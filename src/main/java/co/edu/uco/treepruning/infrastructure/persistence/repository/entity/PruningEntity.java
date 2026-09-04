package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.DateHelper;
import co.edu.uco.treepruning.crosscutting.helper.ObjectHelper;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class PruningEntity {
	private UUID id;
	private StatusEntity status;
	private LocalDate plannedDate;
	private LocalDate executedDate;
	private TreeEntity tree;
	private QuadrilleEntity quadrille;
	private TypeEntity type;
	private PQREntity pqr;
	private String photographicRecordPath;
	private String observations;
	private ZonedDateTime createdAt;
	private ZonedDateTime updatedAt;

	public PruningEntity() {
		super();
		setId(UUIDHelper.getDefault());
		setStatus(new StatusEntity());
		setPlannedDate(DateHelper.getDefault());
		setExecutedDate(DateHelper.getDefault());
		setTree(new TreeEntity());
		setQuadrille(new QuadrilleEntity());
		setType(new TypeEntity());
		setPqr(new PQREntity());
		setPhotographicRecordPath(TextHelper.getDefault());
		setObservations(TextHelper.getDefault());
		setCreatedAt(DateHelper.getDefaultZonedDateTime());
		setUpdatedAt(DateHelper.getDefaultZonedDateTime());
	}

	public PruningEntity(final UUID id) {
		super();
		setId(id);
		setStatus(new StatusEntity());
		setPlannedDate(DateHelper.getDefault());
		setExecutedDate(DateHelper.getDefault());
		setTree(new TreeEntity());
		setQuadrille(new QuadrilleEntity());
		setType(new TypeEntity());
		setPqr(new PQREntity());
		setPhotographicRecordPath(TextHelper.getDefault());
		setObservations(TextHelper.getDefault());
		setCreatedAt(DateHelper.getDefaultZonedDateTime());
		setUpdatedAt(DateHelper.getDefaultZonedDateTime());
	}

	public PruningEntity(final UUID id, final StatusEntity status, final LocalDate plannedDate, final LocalDate executedDate, final TreeEntity tree, final QuadrilleEntity quadrille, final TypeEntity type, final PQREntity pqr, final String photographicRecordPath, final String observations, final ZonedDateTime createdAt, final ZonedDateTime updatedAt) {
		super();
		setId(id);
		setStatus(status);
		setPlannedDate(plannedDate);
		setExecutedDate(executedDate);
		setTree(tree);
		setQuadrille(quadrille);
		setType(type);
		setPqr(pqr);
		setPhotographicRecordPath(photographicRecordPath);
		setObservations(observations);
		setCreatedAt(createdAt);
		setUpdatedAt(updatedAt);
	}

	public UUID getId() {
		return id;
	}
	public StatusEntity getStatus() {
		return status;
	}
	public LocalDate getPlannedDate() {
		return plannedDate;
	}
	public LocalDate getExecutedDate() {
		return executedDate;
	}
	public TreeEntity getTree() {
		return tree;
	}
	public QuadrilleEntity getQuadrille() {
		return quadrille;
	}
	public TypeEntity getType() {
		return type;
	}
	public PQREntity getPqr() {
		return pqr;
	}
	public String getPhotographicRecordPath() {
		return photographicRecordPath;
	}
	public String getObservations() {
		return observations;
	}

	private void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}
	private void setStatus(final StatusEntity status) {
		this.status = ObjectHelper.getDefault(status, new StatusEntity());
	}
	private void setPlannedDate(final LocalDate plannedDate) {
		this.plannedDate = DateHelper.getDefault(plannedDate);
	}
	private void setExecutedDate(final LocalDate executedDate) {
		this.executedDate = DateHelper.getDefault(executedDate);
	}
	private void setTree(final TreeEntity tree) {
		this.tree = ObjectHelper.getDefault(tree, new TreeEntity());
	}
	private void setQuadrille(final QuadrilleEntity quadrille) {
		this.quadrille = ObjectHelper.getDefault(quadrille, new QuadrilleEntity());
	}
	private void setType(final TypeEntity type) {
		this.type = ObjectHelper.getDefault(type, new TypeEntity());
	}
	private void setPqr(final PQREntity pqr) {
		this.pqr = ObjectHelper.getDefault(pqr, new PQREntity());
	}
	private void setPhotographicRecordPath(final String photographicRecordPath) {
		this.photographicRecordPath = TextHelper.getDefaultWithTrim(photographicRecordPath);
	}
	private void setObservations(final String observations) {
		this.observations = TextHelper.getDefaultWithTrim(observations);
	}
	private void setCreatedAt(final ZonedDateTime createdAt) {
		this.createdAt = DateHelper.getDefaultZonedDateTime(createdAt);
	}
	private void setUpdatedAt(final ZonedDateTime updatedAt) {
		this.updatedAt = DateHelper.getDefaultZonedDateTime(updatedAt);
	}
}
