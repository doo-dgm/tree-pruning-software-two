package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.ObjectHelper;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class StateEntity {
	private UUID id;
	private String name;
	private CountryEntity country;

	public StateEntity() {
		super();
		setId(UUIDHelper.getDefault());
		setName(TextHelper.getDefault());
		setCountry(new CountryEntity());
	}

	public StateEntity(final UUID id) {
		super();
		setId(id);
		setName(TextHelper.getDefault());
		setCountry(new CountryEntity());
	}

	public StateEntity(final UUID id, final String name, final CountryEntity country) {
		super();
		setId(id);
		setName(name);
		setCountry(country);
	}

	public UUID getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public CountryEntity getCountry() {
		return country;
	}

	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}
	public void setName(final String name) {
		this.name = TextHelper.getDefault(name);
	}
	public void setCountry(final CountryEntity country) {
		this.country = ObjectHelper.getDefault(country, new CountryEntity());
	}
}
