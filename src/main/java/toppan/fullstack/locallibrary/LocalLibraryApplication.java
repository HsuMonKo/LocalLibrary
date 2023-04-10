package toppan.fullstack.locallibrary;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import toppan.fullstack.locallibrary.model.Author;
import toppan.fullstack.locallibrary.model.AuthorBook;
import toppan.fullstack.locallibrary.model.AuthorBookId;
import toppan.fullstack.locallibrary.model.Book;
import toppan.fullstack.locallibrary.model.BookRent;
import toppan.fullstack.locallibrary.model.Country;
import toppan.fullstack.locallibrary.model.Person;
import toppan.fullstack.locallibrary.repository.AuthorBookRepository;
import toppan.fullstack.locallibrary.repository.AuthorRepository;
import toppan.fullstack.locallibrary.repository.BookRentRepository;
import toppan.fullstack.locallibrary.repository.BookRepository;
import toppan.fullstack.locallibrary.repository.CountryRepository;
import toppan.fullstack.locallibrary.repository.PersonRepository;

@SpringBootApplication
public class LocalLibraryApplication implements CommandLineRunner {
	
	@Autowired
	AuthorRepository ar;
	
	@Autowired
	BookRepository br;
	
	@Autowired
	AuthorBookRepository abr;
	
	@Autowired
	CountryRepository cr;
	
	@Autowired
	PersonRepository pr;
	
	@Autowired
	BookRentRepository brr;

	public static void main(String[] args) {
		SpringApplication.run(LocalLibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		ZonedDateTime date = ZonedDateTime.now();
		
		Author author1 = new Author("author1", date, date);
		Author author2 = new Author("author2", date, date);
		Author author3 = new Author("author3", date, date);
		
		List<Author> authors = new ArrayList<Author>();
		authors.add(author1);
		authors.add(author2);
		authors.add(author3);
		
		ar.saveAll(authors);
		
		Book book1 = new Book("Book 1", date, date);
		Book book2 = new Book("Book 2", date, date);
		Book book3 = new Book("Book 3", date, date);
		Book book4 = new Book("Book 4", date, date);
		Book book5 = new Book("Book 5", date, date);
		Book book6 = new Book("Book 6", date, date);
		Book book7 = new Book("Book 7", date, date);
		
		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		
		br.saveAll(books);
		
		AuthorBook authorBook1 = new AuthorBook();
		authorBook1.setId(new AuthorBookId(author1.getId(),book1.getId()));
		authorBook1.setAuthor(author1);
		authorBook1.setBook(book1);
		authorBook1.setCreatedAt(date);
		authorBook1.setUpdatedAt(date);
		
		AuthorBook authorBook2 = new AuthorBook();
		authorBook2.setId(new AuthorBookId(author1.getId(),book2.getId()));
		authorBook2.setAuthor(author1);
		authorBook2.setBook(book2);
		authorBook2.setCreatedAt(date);
		authorBook2.setUpdatedAt(date);
		
		AuthorBook authorBook3 = new AuthorBook();
		authorBook3.setId(new AuthorBookId(author1.getId(),book3.getId()));
		authorBook3.setAuthor(author1);
		authorBook3.setBook(book3);
		authorBook3.setCreatedAt(date);
		authorBook3.setUpdatedAt(date);
		
		AuthorBook authorBook4 = new AuthorBook();
		authorBook4.setId(new AuthorBookId(author2.getId(),book3.getId()));
		authorBook4.setAuthor(author2);
		authorBook4.setBook(book3);
		authorBook4.setCreatedAt(date);
		authorBook4.setUpdatedAt(date);
		
		AuthorBook authorBook5 = new AuthorBook();
		authorBook5.setId(new AuthorBookId(author2.getId(),book4.getId()));
		authorBook5.setAuthor(author2);
		authorBook5.setBook(book4);
		authorBook5.setCreatedAt(date);
		authorBook5.setUpdatedAt(date);
		
		AuthorBook authorBook6 = new AuthorBook();
		authorBook6.setId(new AuthorBookId(author2.getId(),book5.getId()));
		authorBook6.setAuthor(author2);
		authorBook6.setBook(book5);
		authorBook6.setCreatedAt(date);
		authorBook6.setUpdatedAt(date);
		
		AuthorBook authorBook7 = new AuthorBook();
		authorBook7.setId(new AuthorBookId(author3.getId(),book5.getId()));
		authorBook7.setAuthor(author3);
		authorBook7.setBook(book5);
		authorBook7.setCreatedAt(date);
		authorBook7.setUpdatedAt(date);
		
		AuthorBook authorBook8 = new AuthorBook();
		authorBook8.setId(new AuthorBookId(author3.getId(),book6.getId()));
		authorBook8.setAuthor(author3);
		authorBook8.setBook(book6);
		authorBook8.setCreatedAt(date);
		authorBook8.setUpdatedAt(date);
		
		AuthorBook authorBook9 = new AuthorBook();
		authorBook9.setId(new AuthorBookId(author3.getId(),book7.getId()));
		authorBook9.setAuthor(author3);
		authorBook9.setBook(book7);
		authorBook9.setCreatedAt(date);
		authorBook9.setUpdatedAt(date);
		
		List<AuthorBook> authorBooks = new ArrayList<AuthorBook>();
		authorBooks.add(authorBook1);
		authorBooks.add(authorBook2);
		authorBooks.add(authorBook3);
		authorBooks.add(authorBook4);
		authorBooks.add(authorBook5);
		authorBooks.add(authorBook6);
		authorBooks.add(authorBook7);
		authorBooks.add(authorBook8);
		authorBooks.add(authorBook9);
		
		abr.saveAll(authorBooks);
		
		Country country1 = new Country("SG", date, date);
		Country country2 = new Country("MY", date, date);
		Country country3 = new Country("US", date, date);
		
		List<Country> countries = new ArrayList<Country>();
		countries.add(country1);
		countries.add(country2);
		countries.add(country3);
		
		cr.saveAll(countries);
		
		Person person1 = new Person("Emily", date, date, country1);
		Person person2 = new Person("Ethan", date, date, country1);
		Person person3 = new Person("Natalie", date, date, country1);
		Person person4 = new Person("William", date, date, country1);
		Person person5 = new Person("Madison", date, date, country1);
		Person person6 = new Person("Sophia", date, date, country1);
		Person person7 = new Person("Andrew", date, date, country1);
		Person person8 = new Person("Olivia", date, date, country1);
		Person person9 = new Person("Daniel", date, date, country2);
		Person person10 = new Person("Isabella", date, date, country2);
		Person person11 = new Person("Joshua", date, date, country2);
		Person person12 = new Person("Mia", date, date, country2);
		Person person13 = new Person("Taylor", date, date, country2);
		Person person14 = new Person("Michael", date, date, country2);
		Person person15 = new Person("Chloe", date, date, country2);
		Person person16 = new Person("Victoria", date, date, country2);
		Person person17 = new Person("Christopher", date, date, country3);
		Person person18 = new Person("David", date, date, country3);
		Person person19 = new Person("Benjamin", date, date, country3);
		Person person20 = new Person("Lily", date, date, country3);
		Person person21 = new Person("Ryan", date, date, country3);
		Person person22 = new Person("Grace", date, date, country3);
		Person person23 = new Person("Elizabeth", date, date, country3);
		Person person24 = new Person("Matthew", date, date, country3);
		
		List<Person> people = new ArrayList<Person>();
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		people.add(person5);
		people.add(person6);
		people.add(person7);
		people.add(person8);
		people.add(person9);
		people.add(person10);
		people.add(person11);
		people.add(person12);
		people.add(person13);
		people.add(person14);
		people.add(person15);
		people.add(person16);
		people.add(person17);
		people.add(person18);
		people.add(person19);
		people.add(person20);
		people.add(person21);
		people.add(person22);
		people.add(person23);
		people.add(person24);
		
		pr.saveAll(people);
		
		BookRent bookRent1 = new BookRent();
		bookRent1.setBook(book1);
		bookRent1.setPerson(person1);
		bookRent1.setCreatedAt(date);
		bookRent1.setUpdatedAt(date);
		
		BookRent bookRent2 = new BookRent();
		bookRent2.setBook(book1);
		bookRent2.setPerson(person2);
		bookRent2.setCreatedAt(date);
		bookRent2.setUpdatedAt(date);
		
		BookRent bookRent3 = new BookRent();
		bookRent3.setBook(book2);
		bookRent3.setPerson(person3);
		bookRent3.setCreatedAt(date);
		bookRent3.setUpdatedAt(date);
		
		BookRent bookRent4 = new BookRent();
		bookRent4.setBook(book2);
		bookRent4.setPerson(person4);
		bookRent4.setCreatedAt(date);
		bookRent4.setUpdatedAt(date);
		
		BookRent bookRent5 = new BookRent();
		bookRent5.setBook(book3);
		bookRent5.setPerson(person5);
		bookRent5.setCreatedAt(date);
		bookRent5.setUpdatedAt(date);
		
		BookRent bookRent6 = new BookRent();
		bookRent6.setBook(book3);
		bookRent6.setPerson(person6);
		bookRent6.setCreatedAt(date);
		bookRent6.setUpdatedAt(date);
		
		BookRent bookRent7 = new BookRent();
		bookRent7.setBook(book4);
		bookRent7.setPerson(person7);
		bookRent7.setCreatedAt(date);
		bookRent7.setUpdatedAt(date);
		
		BookRent bookRent8 = new BookRent();
		bookRent8.setBook(book4);
		bookRent8.setPerson(person8);
		bookRent8.setCreatedAt(date);
		bookRent8.setUpdatedAt(date);
		
		BookRent bookRent9 = new BookRent();
		bookRent9.setBook(book5);
		bookRent9.setPerson(person9);
		bookRent9.setCreatedAt(date);
		bookRent9.setUpdatedAt(date);
		
		BookRent bookRent10 = new BookRent();
		bookRent10.setBook(book5);
		bookRent10.setPerson(person10);
		bookRent10.setCreatedAt(date);
		bookRent10.setUpdatedAt(date);
		
		BookRent bookRent11 = new BookRent();
		bookRent11.setBook(book6);
		bookRent11.setPerson(person11);
		bookRent11.setCreatedAt(date);
		bookRent11.setUpdatedAt(date);
		
		BookRent bookRent12 = new BookRent();
		bookRent12.setBook(book6);
		bookRent12.setPerson(person12);
		bookRent12.setCreatedAt(date);
		bookRent12.setUpdatedAt(date);
		
		BookRent bookRent13 = new BookRent();
		bookRent13.setBook(book7);
		bookRent13.setPerson(person13);
		bookRent13.setCreatedAt(date);
		bookRent13.setUpdatedAt(date);
		
		BookRent bookRent14 = new BookRent();
		bookRent14.setBook(book7);
		bookRent14.setPerson(person14);
		bookRent14.setCreatedAt(date);
		bookRent14.setUpdatedAt(date);
		
		BookRent bookRent15 = new BookRent();
		bookRent15.setBook(book7);
		bookRent15.setPerson(person15);
		bookRent15.setCreatedAt(date);
		bookRent15.setUpdatedAt(date);
		
		BookRent bookRent16 = new BookRent();
		bookRent16.setBook(book6);
		bookRent16.setPerson(person16);
		bookRent16.setCreatedAt(date);
		bookRent16.setUpdatedAt(date);
		
		BookRent bookRent17 = new BookRent();
		bookRent17.setBook(book5);
		bookRent17.setPerson(person17);
		bookRent17.setCreatedAt(date);
		bookRent17.setUpdatedAt(date);
		
		BookRent bookRent18 = new BookRent();
		bookRent18.setBook(book4);
		bookRent18.setPerson(person18);
		bookRent18.setCreatedAt(date);
		bookRent18.setUpdatedAt(date);
		
		BookRent bookRent19 = new BookRent();
		bookRent19.setBook(book3);
		bookRent19.setPerson(person19);
		bookRent19.setCreatedAt(date);
		bookRent19.setUpdatedAt(date);
		
		BookRent bookRent20 = new BookRent();
		bookRent20.setBook(book2);
		bookRent20.setPerson(person20);
		bookRent20.setCreatedAt(date);
		bookRent20.setUpdatedAt(date);
		
		BookRent bookRent21 = new BookRent();
		bookRent21.setBook(book1);
		bookRent21.setPerson(person21);
		bookRent21.setCreatedAt(date);
		bookRent21.setUpdatedAt(date);
		
		BookRent bookRent22 = new BookRent();
		bookRent22.setBook(book1);
		bookRent22.setPerson(person22);
		bookRent22.setCreatedAt(date);
		bookRent22.setUpdatedAt(date);
		
		BookRent bookRent23 = new BookRent();
		bookRent23.setBook(book3);
		bookRent23.setPerson(person23);
		bookRent23.setCreatedAt(date);
		bookRent23.setUpdatedAt(date);
		
		BookRent bookRent24 = new BookRent();
		bookRent24.setBook(book5);
		bookRent24.setPerson(person24);
		bookRent24.setCreatedAt(date);
		bookRent24.setUpdatedAt(date);
		
		BookRent bookRent25 = new BookRent();
		bookRent25.setBook(book7);
		bookRent25.setPerson(person24);
		bookRent25.setCreatedAt(date);
		bookRent25.setUpdatedAt(date);
		
		BookRent bookRent26 = new BookRent();
		bookRent26.setBook(book2);
		bookRent26.setPerson(person9);
		bookRent26.setCreatedAt(date);
		bookRent26.setUpdatedAt(date);
		
		BookRent bookRent27 = new BookRent();
		bookRent27.setBook(book4);
		bookRent27.setPerson(person11);
		bookRent27.setCreatedAt(date);
		bookRent27.setUpdatedAt(date);
		
		BookRent bookRent28 = new BookRent();
		bookRent28.setBook(book6);
		bookRent28.setPerson(person15);
		bookRent28.setCreatedAt(date);
		bookRent28.setUpdatedAt(date);
		
		BookRent bookRent29 = new BookRent();
		bookRent29.setBook(book1);
		bookRent29.setPerson(person20);
		bookRent29.setCreatedAt(date);
		bookRent29.setUpdatedAt(date);
		
		BookRent bookRent30 = new BookRent();
		bookRent30.setBook(book3);
		bookRent30.setPerson(person16);
		bookRent30.setCreatedAt(date);
		bookRent30.setUpdatedAt(date);
		
		List<BookRent> bookRents = new ArrayList<BookRent>();
		bookRents.add(bookRent1);
		bookRents.add(bookRent2);
		bookRents.add(bookRent3);
		bookRents.add(bookRent4);
		bookRents.add(bookRent5);
		bookRents.add(bookRent6);
		bookRents.add(bookRent7);
		bookRents.add(bookRent8);
		bookRents.add(bookRent9);
		bookRents.add(bookRent10);
		bookRents.add(bookRent11);
		bookRents.add(bookRent12);
		bookRents.add(bookRent13);
		bookRents.add(bookRent14);
		bookRents.add(bookRent15);
		bookRents.add(bookRent16);
		bookRents.add(bookRent17);
		bookRents.add(bookRent18);
		bookRents.add(bookRent19);
		bookRents.add(bookRent20);
		bookRents.add(bookRent21);
		bookRents.add(bookRent22);
		bookRents.add(bookRent23);
		bookRents.add(bookRent24);
		bookRents.add(bookRent25);
		bookRents.add(bookRent26);
		bookRents.add(bookRent27);
		bookRents.add(bookRent28);
		bookRents.add(bookRent29);
		bookRents.add(bookRent30);
		
		brr.saveAll(bookRents);
		
	}

}
