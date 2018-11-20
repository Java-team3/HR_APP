package by.team34.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class VacancyCandidatePK implements Serializable{
	@Basic
	private long vacancy_id;
	@Basic
	private long candidate_id;
	@Basic
	private String suitable_state;
	@Basic
	private String reason;
	
	public VacancyCandidatePK(long vacancy_id, long candidate_id, String suitable_state, String reason) {
		this.vacancy_id = vacancy_id;
		this.candidate_id = candidate_id;
		this.suitable_state = suitable_state;
		this.reason = reason;
	}
	
}
