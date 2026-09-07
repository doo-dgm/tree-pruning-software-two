package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;

import co.edu.uco.treepruning.crosscutting.helper.BooleanHelper;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class AdministratorEntity {
	private UUID id;
	private String username;
	private String email;
	private boolean emailConfirmed;
	private String phone;
	private boolean phoneConfirmed;

	public AdministratorEntity() {
		super();
		setId(UUIDHelper.getDefault());
		setUsername(TextHelper.getDefault());
		setEmail(TextHelper.getDefault());
		setEmailConfirmed(BooleanHelper.getDefault());
		setPhone(TextHelper.getDefault());
		setPhoneConfirmed(BooleanHelper.getDefault());
	}

	public AdministratorEntity(final UUID id) {
		super();
		setId(id);
		setUsername(TextHelper.getDefault());
		setEmail(TextHelper.getDefault());
		setEmailConfirmed(BooleanHelper.getDefault());
		setPhone(TextHelper.getDefault());
		setPhoneConfirmed(BooleanHelper.getDefault());
	}

	public AdministratorEntity(final UUID id, final String username, final String email,
			final boolean emailConfirmed, final String phone, final boolean phoneConfirmed) {
		super();
		setId(id);
		setUsername(username);
		setEmail(email);
		setEmailConfirmed(emailConfirmed);
		setPhone(phone);
		setPhoneConfirmed(phoneConfirmed);
	}

	public UUID getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public boolean isEmailConfirmed() {
		return emailConfirmed;
	}

	public String getPhone() {
		return phone;
	}

	public boolean isPhoneConfirmed() {
		return phoneConfirmed;
	}

	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}

	public void setUsername(final String username) {
		this.username = TextHelper.getDefaultWithTrim(username);
	}

	public void setEmail(final String email) {
		this.email = TextHelper.getDefaultWithTrim(email);
	}

	public void setEmailConfirmed(final boolean emailConfirmed) {
		this.emailConfirmed = BooleanHelper.getDefault(emailConfirmed);
	}

	public void setPhone(final String phone) {
		this.phone = TextHelper.getDefaultWithTrim(phone);
	}

	public void setPhoneConfirmed(final boolean phoneConfirmed) {
		this.phoneConfirmed = BooleanHelper.getDefault(phoneConfirmed);
	}

}
