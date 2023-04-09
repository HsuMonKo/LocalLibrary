package toppan.fullstack.locallibrary.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import toppan.fullstack.locallibrary.model.Book;
import toppan.fullstack.locallibrary.repository.BookRentRepository;
import toppan.fullstack.locallibrary.service.BookRentService;

@Service
public class BookRentServiceImpl implements BookRentService {
	
	@Autowired
	BookRentRepository bookRentRepository;

	@Override
	public List<Book> getTop3RentedBooksGlobally() {
		// TODO Auto-generated method stub
		return bookRentRepository.findTop3RentedBooksGlobally();
	}

}
