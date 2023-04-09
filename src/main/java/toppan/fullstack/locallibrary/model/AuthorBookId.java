package toppan.fullstack.locallibrary.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class AuthorBookId {
	
	public AuthorBookId(int authorId, int bookId) {
		super();
		this.authorId = authorId;
		this.bookId = bookId;
	}

	@Column(name = "author_id")
	private int authorId;
	
	@Column(name = "book_id")
	private int bookId;

}
