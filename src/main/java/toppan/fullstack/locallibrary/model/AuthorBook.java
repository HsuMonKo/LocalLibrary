package toppan.fullstack.locallibrary.model;

import java.time.ZonedDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="author_books")
@NoArgsConstructor
@Data
public class AuthorBook {
	
	public AuthorBook(Author author, Book book, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
		super();
		this.author = author;
		this.book = book;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@EmbeddedId
	private AuthorBookId id;
	
	@ManyToOne
	@MapsId("authorId")
	@JoinColumn(name="author_id")
	private Author author;
	
	@ManyToOne
	@MapsId("bookId")
	@JoinColumn(name="book_id")
	private Book book;
	
	@Column(nullable = false)
	private ZonedDateTime createdAt;
	
	@Column(nullable = false)
	private ZonedDateTime updatedAt;

}
