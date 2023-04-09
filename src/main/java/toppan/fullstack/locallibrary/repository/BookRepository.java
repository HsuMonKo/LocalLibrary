package toppan.fullstack.locallibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import toppan.fullstack.locallibrary.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
}
