package by.team34.entity;

import javax.persistence.*;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CandidateFeedback> getCandidateFeedbacks() {
        if (this.candidateFeedbacks == null) {
            this.candidateFeedbacks = new HashSet<CandidateFeedback>();
        }
        return candidateFeedbacks;
    }

    public void setCandidateFeedbacks(Set<CandidateFeedback> candidateFeedbacks) {
        this.candidateFeedbacks = candidateFeedbacks;
    }
}
