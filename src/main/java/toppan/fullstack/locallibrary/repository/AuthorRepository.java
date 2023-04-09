package toppan.fullstack.locallibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import toppan.fullstack.locallibrary.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
