package co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase.impl.mapper;

import org.mapstruct.Mapper;

import co.edu.uco.treepruning.crosscutting.helper.ObjectHelper;
import co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase.domain.ExploreCountriesDomain;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.CountryEntity;

@Mapper(componentModel = "spring")
public interface ExploreCountriesDomainMapper {
	default ExploreCountriesDomain toDomain(CountryEntity entity) {
		if (ObjectHelper.isNull(entity)) return null;
		return new ExploreCountriesDomain(entity.getId(), entity.getName(),entity.getIsoCode());
	}

}
