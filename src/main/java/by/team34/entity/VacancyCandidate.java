package by.team34.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.FetchType;


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

    public final Vacancy getVacancy() {
        return vacancy;
    }

    public final void setVacancy(final Vacancy vacancy) {
        this.vacancy = vacancy;
    }

    public final Candidate getCandidate() {
        return candidate;
    }

    public final void setCandidate(final Candidate candidate) {
        this.candidate = candidate;
    }

    public final SuitableState getSuitableState() {
        return suitableState;
    }

    public final void setSuitableState(final SuitableState suitableState) {
        this.suitableState = suitableState;
    }

    public final String getReason() {
        return reason;
    }

    public final void setReason(final String reason) {
        this.reason = reason;
    }
}


