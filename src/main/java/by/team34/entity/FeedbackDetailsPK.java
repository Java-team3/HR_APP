package by.team34.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class FeedbackDetailsPK implements Serializable {
    @Basic
    private long candidateFeedbackId;
    @Basic
    private long requirement;
    @Basic
    private long verifyState;

    public FeedbackDetailsPK(long candidateFeedbackId, long requirement, long verifyState) {
        this.candidateFeedbackId = candidateFeedbackId;
        this.requirement = requirement;
        this.verifyState = verifyState;
    }


}
