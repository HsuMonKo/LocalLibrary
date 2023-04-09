package toppan.fullstack.locallibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import toppan.fullstack.locallibrary.model.AuthorBook;

public interface AuthorBookRepository extends JpaRepository<AuthorBook, Integer> {

}
