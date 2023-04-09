package toppan.fullstack.locallibrary.model;

import java.time.ZonedDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="countries")
@Data
@NoArgsConstructor
public class Country {
	
	public Country(String countryCode, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
		super();
		this.countryCode = countryCode;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String countryCode;
	
	@Column(nullable = false)
	private ZonedDateTime createdAt;
	
	@Column(nullable = false)
	private ZonedDateTime updatedAt;
	
	@JsonIgnore
	@OneToMany(mappedBy = "country")
	private List<Person> people;
}
