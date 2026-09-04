package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;

import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class ToolEntity {
	private UUID id;
	private String name;
	private String description;
	
	public ToolEntity() {
		super();
		setId(UUIDHelper.getDefault());
		setName(TextHelper.getDefault());
		setDescription(TextHelper.getDefault());
	}
	
	public ToolEntity(final UUID id) {
		super();
		setId(id);
		setName(TextHelper.getDefault());
		setDescription(TextHelper.getDefault());
	}
	
	public ToolEntity(final UUID id, final String name, final String description) {
		super();
		setId(id);
		setName(name);
		setDescription(description);
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	private void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}
	
	private void setName(final String name) {
		this.name = TextHelper.getDefaultWithTrim(name);
	}
	
	private void setDescription(final String description) {
		this.description = TextHelper.getDefaultWithTrim(description);
	}
}
