package co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.inputport.impl.mapper;

import org.mapstruct.Mapper;

import co.edu.uco.treepruning.crosscutting.helper.ObjectHelper;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.inputport.dto.ExploreCountriesDTO;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase.domain.ExploreCountriesDomain;

@Mapper(componentModel = "spring")
public interface ExploreCountriesDTOMapper {
	default ExploreCountriesDTO toDTO(ExploreCountriesDomain domain) {
		
		if (ObjectHelper.isNull(domain)) return null;
		return new ExploreCountriesDTO(domain.getId(), domain.getName(),domain.getIsoCode());
	}
}
