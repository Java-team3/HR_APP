package by.team34.entity;

import javax.persistence.*;


@Entity
@Table(name = "vacancy_candidates")
public class VacancyCandidate {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CANDIDATE_ID")
    private Vacancy vacancy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CANDIDATE_ID")
    private Candidate candidate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUITABLE_STATE")
    private SuitableState suitableState;

    @Column(name = "REASON")
    private String reason;

    public Vacancy getVacancy() {
        return vacancy;
    }

    public void setVacancy(Vacancy vacancy) {
        this.vacancy = vacancy;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public SuitableState getSuitableState() {
        return suitableState;
    }

    public void setSuitableState(SuitableState suitableState) {
        this.suitableState = suitableState;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}


