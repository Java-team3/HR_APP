package by.team34.entity;

import javax.persistence.*;

@Entity
@Table(name = "feedback_details")
public class FeedbackDetails {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CANDIDATE_FEEDBACK_ID")
    private CandidateFeedback candidateFeedback;

    //тут вот хз чего то
    private Requirement requirement;
    //здесь тоже
    private SuitableState verifyState;


}
