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

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "interview")
public class Interview {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VACANCY_ID")
    private Vacancy vacancy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CANDIDATE_ID")
    private Candidate candidate;

    @Column(name = "FACT_DATE")
    private Date factDate;

    @Column(name = "PLAN_DATE")
    private Date planDate;

    @OneToMany(mappedBy = "interview", fetch = FetchType.LAZY)
    private Set<CandidateFeedback> candidateFeedbacks;

    public final Long getId() {
        return id;
    }

    public final void setId(final Long id) {
        this.id = id;
    }

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

    public final Date getFactDate() {
        return factDate;
    }

    public final void setFactDate(final Date factDate) {
        this.factDate = factDate;
    }

    public final Date getPlanDate() {
        return planDate;
    }

    public final void setPlanDate(final Date planDate) {
        this.planDate = planDate;
    }

    public final Set<CandidateFeedback> getCandidateFeedbacks() {
        if (this.candidateFeedbacks == null) {
            this.candidateFeedbacks = new HashSet<CandidateFeedback>();
        }
        return candidateFeedbacks;
    }

    public final void setCandidateFeedbacks(final Set<CandidateFeedback> candidateFeedbacks) {
        this.candidateFeedbacks = candidateFeedbacks;
    }
}
