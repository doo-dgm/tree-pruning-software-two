package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.DateHelper;
import co.edu.uco.treepruning.crosscutting.helper.ObjectHelper;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class PQREntity {
	private UUID id;
	private LocalDate date;
	private StatusEntity status;
	private RiskEntity risk;
	private SectorEntity sector;
	private PersonEntity person;
	private String photographicRecordPath;
	private ZonedDateTime createdAt;
	private ZonedDateTime updatedAt;

	public PQREntity() {
		super();
		setId(UUIDHelper.getDefault());
		setDate(DateHelper.getDefault());
		setStatus(new StatusEntity());
		setRisk(new RiskEntity());
		setSector(new SectorEntity());
		setPerson(new PersonEntity());
		setPhotographicRecordPath(TextHelper.getDefault());
		setCreatedAt(DateHelper.getDefaultZonedDateTime());
		setUpdatedAt(DateHelper.getDefaultZonedDateTime());
	}

	public PQREntity(final UUID id) {
		super();
		setId(id);
		setDate(DateHelper.getDefault());
		setStatus(new StatusEntity());
		setRisk(new RiskEntity());
		setSector(new SectorEntity());
		setPerson(new PersonEntity());
		setPhotographicRecordPath(TextHelper.getDefault());
		setCreatedAt(DateHelper.getDefaultZonedDateTime());
		setUpdatedAt(DateHelper.getDefaultZonedDateTime());
	}
	
	public PQREntity(final UUID id, final LocalDate date, final StatusEntity status, final RiskEntity risk, final SectorEntity sector, final PersonEntity person, final String photographicRecordPath, final ZonedDateTime createdAt, final ZonedDateTime updatedAt) {
		super();
		setId(id);
		setDate(date);
		setStatus(status);
		setRisk(risk);
		setSector(sector);
		setPerson(person);
		setPhotographicRecordPath(photographicRecordPath);
		setCreatedAt(createdAt);
		setUpdatedAt(updatedAt);
	}

	public UUID getId() {
		return id;
	}
	public LocalDate getDate() {
		return date;
	}
	public StatusEntity getStatus() {
		return status;
	}
	public RiskEntity getRisk() {
		return risk;
	}
	public SectorEntity getSector() {
		return sector;
	}
	public PersonEntity getPerson() {
		return person;
	}
	public String getPhotographicRecordPath() {
		return photographicRecordPath;
	}
	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}
	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}
	public void setDate(final LocalDate date) {
		this.date = DateHelper.getDefault(date);
	}
	public void setStatus(final StatusEntity status) {
		this.status = ObjectHelper.getDefault(status, new StatusEntity());
	}
	public void setRisk(final RiskEntity risk) {
		this.risk = ObjectHelper.getDefault(risk, new RiskEntity());
	}
	public void setSector(final SectorEntity sector) {
		this.sector = ObjectHelper.getDefault(sector, new SectorEntity());
	}
	public void setPerson(final PersonEntity person) {
		this.person = ObjectHelper.getDefault(person, new PersonEntity());
	}
	public void setPhotographicRecordPath(final String photographicRecordPath) {
		this.photographicRecordPath = TextHelper.getDefault(photographicRecordPath);
	}
	public void setCreatedAt(final ZonedDateTime createdAt) {
		this.createdAt = DateHelper.getDefaultZonedDateTime(createdAt);
	}
	public void setUpdatedAt(final ZonedDateTime updatedAt) {
		this.updatedAt = DateHelper.getDefaultZonedDateTime(updatedAt);
	}

}
