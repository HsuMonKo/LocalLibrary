package toppan.fullstack.locallibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import toppan.fullstack.locallibrary.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
