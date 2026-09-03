package co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.inputport.impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.inputport.ExploreRegisteredCountriesInputPort;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.inputport.dto.ExploreCountriesDTO;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.inputport.impl.mapper.ExploreCountriesDTOMapper;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase.ExploreRegisteredCountriesUseCase;
import co.edu.uco.treepruning.features.family.getfamilybyfilter.application.inputport.impl.GetFamilyByFilterInteractor;

@Service
@Transactional(readOnly = true)
public class ExploreRegisteredCountriesInteractor implements ExploreRegisteredCountriesInputPort {
	
	private static final Logger log = LoggerFactory.getLogger(GetFamilyByFilterInteractor.class);

	private final ExploreRegisteredCountriesUseCase useCase;
	private final ExploreCountriesDTOMapper mapper;

	public ExploreRegisteredCountriesInteractor(ExploreRegisteredCountriesUseCase useCase,
			ExploreCountriesDTOMapper mapper) {
		this.useCase = useCase;
		this.mapper = mapper;
	}

	@Override
	public List<ExploreCountriesDTO> execute(ExploreCountriesDTO filter) {
		log.info("ExploreRegisteredCountriesInteractor — querying");
		List<ExploreCountriesDTO> result = useCase.execute(filter)
				.stream()
				.map(mapper::toDTO)
				.toList();
		log.info("ExploreRegisteredCountriesInteractor — returned {} results", result.size());
		return result;
	}

}
