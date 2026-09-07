package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class NotificationTokenEntity {
	private UUID          id;
    private UUID          userId;
    private String        fcmToken;
    private String        language;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean       active;

    public NotificationTokenEntity(UUID id, UUID userId, String fcmToken, String language,
    		LocalDateTime createdAt, LocalDateTime updatedAt, boolean active) {
		setId(id);
		setUserId(userId);
		setFcmToken(fcmToken);
		setLanguage(language);
		setCreatedAt(createdAt);
		setUpdatedAt(updatedAt);
		setActive(active);
    }

	public UUID getId() {
		return id;
	}

	public UUID getUserId() {
		return userId;
	}

	public String getFcmToken() {
		return fcmToken;
	}

	public String getLanguage() {
		return language;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public boolean isActive() {
		return active;
	}

	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}

	public void setUserId(final UUID userId) {
		this.userId = UUIDHelper.getDefault(userId);
	}

	public void setFcmToken(final String fcmToken) {
		this.fcmToken = TextHelper.getDefault(fcmToken);
	}

	public void setLanguage(final String language) {
		this.language = TextHelper.getDefault(language);
	}

	public void setCreatedAt(final LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(final LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setActive(final boolean active) {
		this.active = active;
	}
    
    
}
