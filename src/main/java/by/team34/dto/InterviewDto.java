package by.team34.dto;

import java.util.Date;
import java.util.Set;

public class InterviewDto {
    private Long id;
    private VacancyDto vacancy;
    private CandidateDto candidate;
    private Date factDate;
    private Date planDate;
    private Set<CandidateFeedbackDto> candidateFeedbacks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VacancyDto getVacancy() {
        return vacancy;
    }

    public void setVacancy(VacancyDto vacancy) {
        this.vacancy = vacancy;
    }

    public CandidateDto getCandidate() {
        return candidate;
    }

    public void setCandidate(CandidateDto candidate) {
        this.candidate = candidate;
    }

    public Date getFactDate() {
        return factDate;
    }

    public void setFactDate(Date factDate) {
        this.factDate = factDate;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public Set<CandidateFeedbackDto> getCandidateFeedbacks() {
        return candidateFeedbacks;
    }

    public void setCandidateFeedbacks(Set<CandidateFeedbackDto> candidateFeedbacks) {
        this.candidateFeedbacks = candidateFeedbacks;
    }
}
