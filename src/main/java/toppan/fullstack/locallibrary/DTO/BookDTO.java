package toppan.fullstack.locallibrary.DTO;

import java.util.List;

import lombok.Data;
import toppan.fullstack.locallibrary.model.Person;

@Data
public class BookDTO {

	private String author;
	private String name;
	private List<Person> borrower;
}
