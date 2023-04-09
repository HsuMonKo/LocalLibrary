package toppan.fullstack.locallibrary.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import toppan.fullstack.locallibrary.model.Country;
import toppan.fullstack.locallibrary.repository.CountryRepository;
import toppan.fullstack.locallibrary.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	CountryRepository cr;

	@Override
	public List<Country> getAllCountries() {
		return cr.findAll();
	}

}
