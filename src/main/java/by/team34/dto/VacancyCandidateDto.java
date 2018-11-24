package by.team34.dto;

import by.team34.entity.VacancyCandidatePK;

public class VacancyCandidateDto {

    private VacancyCandidatePK id;
    private VacancyDto vacancy;
    private CandidateDto candidate;
    private SuitableStateDto suitableState;
    private String reason;

    public VacancyCandidatePK getId() {
        return id;
    }

    public void setId(VacancyCandidatePK id) {
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

    public SuitableStateDto getSuitableState() {
        return suitableState;
    }

    public void setSuitableState(SuitableStateDto suitableState) {
        this.suitableState = suitableState;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
