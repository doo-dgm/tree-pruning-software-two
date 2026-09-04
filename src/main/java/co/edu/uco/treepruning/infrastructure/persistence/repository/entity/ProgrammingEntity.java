package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.time.LocalDate;
import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.DateHelper;
import co.edu.uco.treepruning.crosscutting.helper.NumericHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class ProgrammingEntity {
	private UUID id;
	private LocalDate initialDate;
	private int frequencyMonths;
	private int amount;

	public ProgrammingEntity() {
		super();
		setId(UUIDHelper.getDefault());
		setInitialDate(DateHelper.getDefault());
		setFrequencyMonths(NumericHelper.getDefaultInt());
		setAmount(NumericHelper.getDefaultInt());
	}

	public ProgrammingEntity(final UUID id) {
		super();
		setId(id);
		setInitialDate(DateHelper.getDefault());
		setFrequencyMonths(NumericHelper.getDefaultInt());
		setAmount(NumericHelper.getDefaultInt());
	}

	public ProgrammingEntity(final UUID id, final LocalDate initialDate, final int frequencyMonths, final int amount) {
		super();
		setId(id);
		setInitialDate(initialDate);
		setFrequencyMonths(frequencyMonths);
		setAmount(amount);

	}

	public UUID getId() {
		return id;
	}
	public LocalDate getInitialDate() {
		return initialDate;
	}
	public int getFrequencyMonths() {
		return frequencyMonths;
	}
	public int getAmount() {
		return amount;
	}

	public void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id);
	}
	public void setInitialDate(final LocalDate initialDate) {
		this.initialDate = DateHelper.getDefault(initialDate);
	}
	public void setFrequencyMonths(final int frequencyMonths) {
		this.frequencyMonths = NumericHelper.getDefaultInt(frequencyMonths);
	}
	public void setAmount(final int amount) {
		this.amount = NumericHelper.getDefaultInt(amount);
	}
}
