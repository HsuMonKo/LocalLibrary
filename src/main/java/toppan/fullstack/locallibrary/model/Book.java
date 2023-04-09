package toppan.fullstack.locallibrary.model;

import java.time.ZonedDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="books")
@Data
@NoArgsConstructor
public class Book {
	
	public Book(String name, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
		super();
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private ZonedDateTime createdAt;
	
	@Column(nullable = false)
	private ZonedDateTime updatedAt;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "books")
    private List<Author> authors;
	
	@JsonIgnore
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<BookRent> bookRents;

}
