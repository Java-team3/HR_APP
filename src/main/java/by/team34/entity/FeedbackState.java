package by.team34.entity;

import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "feedback_state")
public class FeedbackState {

    @Id
    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "feedbackState", fetch = FetchType.LAZY)
    private Set<CandidateFeedback> candidateFeedbacks;

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final Set<CandidateFeedback> getCandidateFeedbacks() {
        if (this.candidateFeedbacks == null) {
            this.candidateFeedbacks = new HashSet<CandidateFeedback>();
        }
        return candidateFeedbacks;
    }

    public final void setCandidateFeedbacks(final Set<CandidateFeedback> candidateFeedbacks) {
        this.candidateFeedbacks = candidateFeedbacks;
    }
}
