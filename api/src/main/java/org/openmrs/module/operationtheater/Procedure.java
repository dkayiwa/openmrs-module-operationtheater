package org.openmrs.module.operationtheater;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.BaseOpenmrsData;

import javax.persistence.*;

/**
 * Defines a Procedure in the system.
 */
@Entity
@Table(name = "procedure")
 public class Procedure extends BaseOpenmrsMetadataJPA{

	private static final Log log = LogFactory.getLog(Procedure.class);

	@Id
	@GeneratedValue
	@Column(name = "procedure_id")
	private int procedureId;

	/**
	 * average timespan in minutes required to perform this procedure
	 */
	@Basic
	@Column(name = "intervention_duration", nullable = false)
	private Integer interventionDuration;

	/**
	 * average timespan in minutes required to prepare the operation theater
	 * for this particular procedure
	 */
	@Basic
	@Column(name = "ot_preparation_duration", nullable = false)
	private Integer otPreparationDuration;

	/**
	 * average number of days the patient has to stay in the hospital
	 * after this procedure
	 */
	@Basic
	@Column(name = "inpatient_stay", nullable = false)
	private Integer inpatientStay;

	public int getProcedureId() {
		return procedureId;
	}

	public void setProcedureId(int procedureId) {
		this.procedureId = procedureId;
	}

	@Override
	public Integer getId() {
		return getProcedureId();
	}

	@Override
	public void setId(Integer id) {
		setProcedureId(id);
	}

	public Integer getInterventionDuration() {
		return interventionDuration;
	}

	public void setInterventionDuration(Integer interventionDuration) {
		this.interventionDuration = interventionDuration;
	}

	public Integer getOtPreparationDuration() {
		return otPreparationDuration;
	}

	public void setOtPreparationDuration(Integer otPreparationDuration) {
		this.otPreparationDuration = otPreparationDuration;
	}

	public int getInpatientStay() {
		return inpatientStay;
	}

	public void setInpatientStay(int inpatientStay) {
		this.inpatientStay = inpatientStay;
	}

}
