package by.team34.entity;

import javax.persistence.*;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Set<Responsibility> getResponsibilities() {
        if (this.responsibilities == null) {
            this.responsibilities = new HashSet<Responsibility>();
        }
        return responsibilities;
    }

    public void setResponsibilities(Set<Responsibility> responsibilities) {
        this.responsibilities = responsibilities;
    }
}
