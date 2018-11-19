package by.team34.entity;


import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "candidate_experience")
public class CandidateExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "CANDIDATE_ID")
    private Candidate candidate;

    @Column(name = "DATE_FROM")
    private Date dateFrom;

    @Column(name = "DATE_TO")
    private Date dateTo;

    @Column(name = "JOB_DESCRIPTION")
    private String jobDescription;

    @Column(name = "JOB_POSITION")
    private String jobPosition;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "candidate_responsibility",
            joinColumns = @JoinColumn(name = "CANDIDATE_EXPERIENCE_ID"),
            inverseJoinColumns = @JoinColumn(name = "RESPONSIBILITY"))
    private Set<Responsibility> responsibilities;

    public final int getId() {
        return id;
    }

    public final void setId(final int id) {
        this.id = id;
    }

    public final Candidate getCandidate() {
        return candidate;
    }

    public final void setCandidate(final Candidate candidate) {
        this.candidate = candidate;
    }

    public final Date getDateFrom() {
        return dateFrom;
    }

    public final void setDateFrom(final Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public final Date getDateTo() {
        return dateTo;
    }

    public final void setDateTo(final Date dateTo) {
        this.dateTo = dateTo;
    }

    public final String getJobDescription() {
        return jobDescription;
    }

    public final void setJobDescription(final String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public final String getJobPosition() {
        return jobPosition;
    }

    public final void setJobPosition(final String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public final String getCompanyName() {
        return companyName;
    }

    public final void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public final Set<Responsibility> getResponsibilities() {
        if (this.responsibilities == null) {
            this.responsibilities = new HashSet<Responsibility>();
        }
        return responsibilities;
    }

    public final void setResponsibilities(final Set<Responsibility> responsibilities) {
        this.responsibilities = responsibilities;
    }
}
