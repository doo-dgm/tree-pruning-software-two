package co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase;

import java.util.List;

import co.edu.uco.treepruning.application.usecase.UseCase;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.inputport.dto.ExploreCountriesDTO;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase.domain.ExploreCountriesDomain;

public interface ExploreRegisteredCountriesUseCase extends UseCase<ExploreCountriesDTO, List<ExploreCountriesDomain>> {

}
