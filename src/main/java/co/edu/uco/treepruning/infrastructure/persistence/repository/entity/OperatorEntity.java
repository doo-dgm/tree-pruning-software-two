package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;

import co.edu.uco.treepruning.crosscutting.helper.ObjectHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class OperatorEntity {
	private UUID id;
	private PersonEntity person;
	
	public OperatorEntity() {
		super();
		setId(UUIDHelper.getDefault());
		setPerson(new PersonEntity());
	}
	
	public OperatorEntity(final UUID id) {
		super();
		setId(id);
		setPerson(new PersonEntity());
	}
	
	public OperatorEntity(final UUID id, final PersonEntity person) {
		super();
		setId(id);
		setPerson(person);
	}
	
	public UUID getId() {
		return id;
	}
	
	public PersonEntity getPerson() {
		return person;
	}
	
	private void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}
	
	private void setPerson(final PersonEntity person) {
		this.person = ObjectHelper.getDefault(person, new PersonEntity());
	}
	
}
