package by.team34.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class FeedbackDetailsPK implements Serializable{
	@Basic
	private long candidate_feedback_id;
	@Basic
	private long requirement;
	@Basic
	private long verify_state;
	public FeedbackDetailsPK(long candidate_feedback_id, long requirement, long verify_state) {
		this.candidate_feedback_id = candidate_feedback_id;
		this.requirement = requirement;
		this.verify_state = verify_state;
	}
	
	
}
