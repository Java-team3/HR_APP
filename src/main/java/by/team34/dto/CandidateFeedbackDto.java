package by.team34.dto;

import by.team34.entity.FeedbackDetails;
import by.team34.entity.FeedbackState;

import java.util.Set;

public class CandidateFeedbackDto {


    private Long id;
    private InterviewDto interview;
    private UserDto user;
    private FeedbackStateDto feedbackState;
    private String feedBackText;
    private Set<FeedbackDetailsDto> feedbackDetails;

    public CandidateFeedbackDto(Long id, InterviewDto interview,
                                UserDto user, FeedbackStateDto feedbackState,
                                String feedBackText,
                                Set<FeedbackDetailsDto> feedbackDetails){
        this.id = id;
        this.interview = interview;
        this.user = user;
        this.feedbackState = feedbackState;
        this.feedBackText = feedBackText;
        this.feedbackDetails = feedbackDetails;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InterviewDto getInterview() {
        return interview;
    }

    public void setInterview(InterviewDto interview) {
        this.interview = interview;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public FeedbackStateDto getFeedbackState() {
        return feedbackState;
    }

    public void setFeedbackState(FeedbackStateDto feedbackState) {
        this.feedbackState = feedbackState;
    }

    public String getFeedBackText() {
        return feedBackText;
    }

    public void setFeedBackText(String feedBackText) {
        this.feedBackText = feedBackText;
    }

    public Set<FeedbackDetailsDto> getFeedbackDetails() {
        return feedbackDetails;
    }

    public void setFeedbackDetails(Set<FeedbackDetailsDto> feedbackDetails) {
        this.feedbackDetails = feedbackDetails;
    }
}
