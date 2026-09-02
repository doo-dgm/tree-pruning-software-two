package co.edu.uco.treepruning.features.country.exploreregisteredcountries.application.usecase.domain;

import java.util.UUID;

import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class ExploreCountriesDomain {
	private UUID id;
	private String name;
	private String isoCode;
	
	public ExploreCountriesDomain(UUID id, String name, String isoCode) {
		setId(id);
		setName(name);
		setIsoCode(isoCode);
	}
	
	public ExploreCountriesDomain(UUID id) {
		setId(id);
		setName(TextHelper.getDefault());
		setIsoCode(TextHelper.getDefault());
	}
	
	public ExploreCountriesDomain() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.getDefault());
		setIsoCode(TextHelper.getDefault());
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIsoCode() {
		return isoCode;
	}
	
	private void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}
	
	private void setName(final String name) {
		this.name = TextHelper.getDefaultWithTrim(name);
	}
	
	private void setIsoCode(final String isoCode) {
		this.isoCode = TextHelper.getDefaultWithTrim(isoCode);
	}

}
