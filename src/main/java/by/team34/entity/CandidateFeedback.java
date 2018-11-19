package by.team34.entity;

import javax.persistence.*;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Interview getInterview() {
        return interview;
    }

    public void setInterview(Interview interview) {
        this.interview = interview;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FeedbackState getFeedbackState() {
        return feedbackState;
    }

    public void setFeedbackState(FeedbackState feedbackState) {
        this.feedbackState = feedbackState;
    }

    public String getFeedBackText() {
        return feedBackText;
    }

    public void setFeedBackText(String feedBackText) {
        this.feedBackText = feedBackText;
    }

    public Set<FeedbackDetails> getFeedbackDetails() {
        if (this.feedbackDetails == null) {
            this.feedbackDetails = new HashSet<FeedbackDetails>();
        }
        return feedbackDetails;
    }

    public void setFeedbackDetails(Set<FeedbackDetails> feedbackDetails) {
        this.feedbackDetails = feedbackDetails;
    }
}
