package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class NotificationHistoryEntity {
	private UUID          id;
	private UUID          userId;
	private String        title;
	private String        body;
	private UUID          pruningId;
	private UUID        type;
	private LocalDateTime sentAt;
	private boolean       success;

	public NotificationHistoryEntity() {
		super();
		setId(UUIDHelper.getDefault());
		setUserId(UUIDHelper.getDefault());
		setTitle(TextHelper.getDefault());
		setBody(TextHelper.getDefault());
		setPruningId(UUIDHelper.getDefault());
		setType(UUIDHelper.getDefault());
		setSentAt(LocalDateTime.now());
		setSuccess(true);
	}

	public NotificationHistoryEntity(UUID id, UUID userId, String title,
			String body, UUID pruningId, UUID type,
			LocalDateTime sentAt) {
		setId(id);
		setUserId(userId);
		setTitle(title);
		setBody(body);
		setPruningId(pruningId);
		setType(type);
		setSentAt(sentAt);
		setSuccess(true);
	}

	public UUID getId() {
		return id;
	}

	public UUID getUserId() {
		return userId;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public UUID getPruningId() {
		return pruningId;
	}

	public UUID getType() {
		return type;
	}

	public LocalDateTime getSentAt() {
		return sentAt;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}

	public void setUserId(final UUID userId) {
		this.userId = UUIDHelper.getDefault(userId);
	}

	public void setTitle(final String title) {
		this.title = TextHelper.getDefaultWithTrim(title);
	}

	public void setBody(final String body) {
		this.body = TextHelper.getDefaultWithTrim(body);
	}

	public void setPruningId(final UUID pruningId) {
		this.pruningId = UUIDHelper.getDefault(pruningId);
	}

	public void setType(final UUID type) {
		this.type = UUIDHelper.getDefault(type);
	}

	public void setSentAt(final LocalDateTime sentAt) {
		this.sentAt = sentAt;
	}

	public void setSuccess(final boolean success) {
		this.success = success;
	}


}
