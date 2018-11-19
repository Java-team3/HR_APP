package by.team34.entity;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "candidate_feedback")
public class CandidateFeedback {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "CANDIDATE_ID")
    private Candidate candidate;

    @ManyToOne
    @JoinColumn(name = "INTERVIEW_ID")
    private Interview interview;

    @ManyToOne
    @JoinColumn(name = "INTERVIEWER_ID")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEEDBACK_STATE")
    private FeedbackState feedbackState;

    @Column(name = "FEEDBACK_TEXT")
    private String feedBackText;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "candidateFeedback")
    private Set<FeedbackDetails> feedbackDetails;

    public final int getId() {
        return id;
    }

    public final void setId(final int id) {
        this.id = id;
    }

    public final Candidate getCandidate() {
        return candidate;
    }

    public final void setCandidate(final Candidate candidate) {
        this.candidate = candidate;
    }

    public final Interview getInterview() {
        return interview;
    }

    public final void setInterview(final Interview interview) {
        this.interview = interview;
    }

    public final User getUser() {
        return user;
    }

    public final void setUser(final User user) {
        this.user = user;
    }

    public final FeedbackState getFeedbackState() {
        return feedbackState;
    }

    public final void setFeedbackState(final FeedbackState feedbackState) {
        this.feedbackState = feedbackState;
    }

    public final String getFeedBackText() {
        return feedBackText;
    }

    public final void setFeedBackText(final String feedBackText) {
        this.feedBackText = feedBackText;
    }

    public final Set<FeedbackDetails> getFeedbackDetails() {
        if (this.feedbackDetails == null) {
            this.feedbackDetails = new HashSet<FeedbackDetails>();
        }
        return feedbackDetails;
    }

    public final void setFeedbackDetails(final Set<FeedbackDetails> feedbackDetails) {
        this.feedbackDetails = feedbackDetails;
    }
}
