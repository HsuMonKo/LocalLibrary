package toppan.fullstack.locallibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import toppan.fullstack.locallibrary.model.Book;
import toppan.fullstack.locallibrary.model.BookRent;

public interface BookRentRepository extends JpaRepository<BookRent, Integer> {
	
	@Query("SELECT b, COUNT(*) as rent_count "
			+ "FROM BookRent br "
			+ "INNER JOIN Book b ON b = br.book "
			+ "GROUP BY b "
			+ "ORDER BY rent_count DESC "
			+ "LIMIT 3")
	List<Book> findTop3RentedBooksGlobally();

}
