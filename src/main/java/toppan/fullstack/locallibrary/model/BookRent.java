package toppan.fullstack.locallibrary.model;

import java.time.ZonedDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book_rents")
@Data
@NoArgsConstructor
public class BookRent {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
    
	@ManyToOne(fetch = FetchType.LAZY)
    private Book book;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;
	
	@Column(nullable = false)
	private ZonedDateTime createdAt;
	
	@Column(nullable = false)
	private ZonedDateTime updatedAt;
}
