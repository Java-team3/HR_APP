package by.team34.dto;

import java.util.Date;
import java.util.Set;

public class InterviewDto {
    private Long id;

    private Long vacancyId;
    private Long candidateId;


    //private VacancyDto vacancy;
    //private CandidateDto candidate;
    private Date factDate;
    private Date planDate;
    //private Set<CandidateFeedbackDto> candidateFeedbacks;

    public InterviewDto(Long id, Long vacancyId, Long candidateId, Date factDate, Date planDate) {
        this.id = id;
        this.vacancyId = vacancyId;
        this.candidateId = candidateId;
        this.factDate = factDate;
        this.planDate = planDate;
    }

//    public InterviewDto(Long id, VacancyDto vacancy, CandidateDto candidate, Date factDate, Date planDate, Set<CandidateFeedbackDto> candidateFeedbacks) {
//        this.id = id;
//        //this.vacancy = vacancy;
//        //this.candidate = candidate;
//        this.factDate = factDate;
//        this.planDate = planDate;
//        // this.candidateFeedbacks = candidateFeedbacks;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public VacancyDto getVacancy() {
//        return vacancy;
//    }
//
//    public void setVacancy(VacancyDto vacancy) {
//        this.vacancy = vacancy;
//    }

//    public CandidateDto getCandidate() {
//        return candidate;
//    }
//
//    public void setCandidate(CandidateDto candidate) {
//        this.candidate = candidate;
//    }

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

//    public Set<CandidateFeedbackDto> getCandidateFeedbacks() {
//        return candidateFeedbacks;
//    }
//
//    public void setCandidateFeedbacks(Set<CandidateFeedbackDto> candidateFeedbacks) {
//        this.candidateFeedbacks = candidateFeedbacks;
//    }


    public Long getVacancyId() {
        return vacancyId;
    }

    public void setVacancyId(Long vacancyId) {
        this.vacancyId = vacancyId;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

}
