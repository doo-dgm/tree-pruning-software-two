package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.ObjectHelper;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class QuadrilleEntity {
	private UUID id;
	private String quadrilleName;
	private ManagerEntity manager;

	public QuadrilleEntity() {
		super();
		setId(UUIDHelper.getDefault());
		setQuadrilleName(TextHelper.getDefault());
		setManager(new ManagerEntity());
	}

	public QuadrilleEntity(final UUID id) {
		super();
		setId(id);
		setQuadrilleName(TextHelper.getDefault());
		setManager(new ManagerEntity());
	}

	public QuadrilleEntity(final UUID id, final String quadrilleName, final ManagerEntity manager) {
		super();
		setId(id);
		setQuadrilleName(quadrilleName);
		setManager(manager);
	}

	public UUID getId() {
		return id;
	}
	public String getQuadrilleName() {
		return quadrilleName;
	}
	public ManagerEntity getManager() {
		return manager;
	}

	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}
	public void setQuadrilleName(final String quadrilleName) {
		this.quadrilleName = TextHelper.getDefaultWithTrim(quadrilleName);
	}
	public void setManager(final ManagerEntity manager) {
		this.manager = ObjectHelper.getDefault(manager, new ManagerEntity());
	}
}
