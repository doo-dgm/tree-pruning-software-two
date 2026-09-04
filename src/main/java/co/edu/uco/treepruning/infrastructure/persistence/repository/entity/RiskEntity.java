package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class RiskEntity {
	private UUID id;
	private String name;

	public RiskEntity() {
		super();
		setId(UUIDHelper.getDefault());
		setName(TextHelper.getDefault());
	}

	public RiskEntity(final UUID id) {
		super();
		setId(id);
		setName(TextHelper.getDefault());
	}
	
	public RiskEntity(final UUID id, final String name) {
		super();
		setId(id);
		setName(name);

	}

	public UUID getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}
	public void setName(final String name) {
		this.name = TextHelper.getDefault(name);
	}
}
