package co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.inputport.dto.ExploreCountriesDTO;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase.ExploreRegisteredCountriesUseCase;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase.domain.ExploreCountriesDomain;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase.impl.mapper.ExploreCountriesDomainMapper;
import co.edu.uco.treepruning.infrastructure.persistence.repository.CountryRepository;

@Service
public class ExploreRegisteredCountriesUseCaseImpl implements ExploreRegisteredCountriesUseCase {

	private final ExploreCountriesDomainMapper mapper;
	private final CountryRepository repository;
	
	public ExploreRegisteredCountriesUseCaseImpl(ExploreCountriesDomainMapper mapper, CountryRepository repository) {
		this.mapper = mapper;
		this.repository = repository;
	}
	
	@Override
	public List<ExploreCountriesDomain> execute(ExploreCountriesDTO filter) {
		return repository.findAll()
				.stream()
				.map(mapper::toDomain)
				.toList();
	}

}
