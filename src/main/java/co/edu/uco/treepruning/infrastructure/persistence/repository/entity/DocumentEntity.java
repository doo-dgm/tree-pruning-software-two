package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class DocumentEntity {
	private UUID id;
	private String name;
	private String code;

	public DocumentEntity() {
		super();
		setId(UUIDHelper.getDefault());
		setName(TextHelper.getDefault());
		setCode(TextHelper.getDefault());
	}

	public DocumentEntity(final UUID id) {
		super();
		setId(id);
		setName(TextHelper.getDefault());
		setCode(TextHelper.getDefault());
	}
	public DocumentEntity(final UUID id, final String name, final String code) {
		super();
		setId(id);
		setName(name);
		setCode(code);

	}

	public UUID getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCode() {
		return code;
	}

	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}
	public void setName(final String name) {
		this.name = TextHelper.getDefaultWithTrim(name);
	}
	public void setCode(final String code) {
		this.code = TextHelper.getDefaultWithTrim(code);
	}
}
