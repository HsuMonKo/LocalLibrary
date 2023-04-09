package toppan.fullstack.locallibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import toppan.fullstack.locallibrary.model.Book;
import toppan.fullstack.locallibrary.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	@Query("SELECT p , COUNT(*) AS total_rents "
			+ "FROM BookRent br "
			+ "JOIN Book b ON b = br.book "
			+ "JOIN Person p ON p = br.person "
			+ "JOIN Country c ON c = p.country "
			+ "WHERE b = :book AND c.countryCode = :countryCode "
			+ "GROUP BY p "
			+ "ORDER BY total_rents DESC "
			+ "LIMIT 3")
	List<Person> findTop3PersonByCountryCode(@Param("book") Book book, @Param("countryCode") String countryCode);

}
