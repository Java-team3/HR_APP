package by.team34.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.FetchType;

@Entity
@Table(name = "feedback_details")
public class FeedbackDetails {
	
	@EmbeddedId
	private FeedbackDetailsPK id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CANDIDATE_FEEDBACK_ID")
    private CandidateFeedback candidateFeedback;

    @ManyToOne
    @JoinColumn(name = "REQUIREMENT")
    private Requirement requirement;
    
    @ManyToOne
    @JoinColumn(name = "VERIFY_STATE")
    private SuitableState verifyState;

	public final FeedbackDetailsPK getId() {
		return id;
	}

	public final void setId(final FeedbackDetailsPK id) {
		this.id = id;
	}

	public final CandidateFeedback getCandidateFeedback() {
		return candidateFeedback;
	}

	public final void setCandidateFeedback(final CandidateFeedback candidateFeedback) {
		this.candidateFeedback = candidateFeedback;
	}

	public final Requirement getRequirement() {
		return requirement;
	}

	public final void setRequirement(final Requirement requirement) {
		this.requirement = requirement;
	}

	public final SuitableState getVerifyState() {
		return verifyState;
	}

	public final void setVerifyState(final SuitableState verifyState) {
		this.verifyState = verifyState;
	}
    
}
