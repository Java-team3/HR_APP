package by.team34.entity;


import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "vacancy")
public class Vacancy {

    public static final  int MIN_SIZE = 5;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID" )
    private Long id;

    @Size(min = MIN_SIZE)
    @Column(name = "POSITION")
    private String position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEVELOPER_ID")
    private User user;

    @DecimalMax("10000.0")
    @DecimalMin("200")
    @Column(name = "SALARY_FROM")
    private double salaryFrom;

    @DecimalMax("10000.0")
    @DecimalMin("200")
    @Column(name = "SALARY_TO")
    private double salaryTo;

    @Column(name = "VACANCY_STATE")
    private String vacancyState;

    @DecimalMax("30.0")
    @DecimalMin("0.0")
    @Column(name = "EXPERIENCE_YEATS_REQUIRE")
    private double experienceYearsRequire;

    @OneToMany(mappedBy = "vacancy", fetch = FetchType.LAZY)
    private Set<Interview> interviews;

    @OneToMany(mappedBy = "vacancy", fetch = FetchType.LAZY)
    private Set<VacancyCandidate> vacancyCandidates;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "vacancy_requirement",
            joinColumns = @JoinColumn(name = "VACANCY_ID"),
            inverseJoinColumns = @JoinColumn(name = "REQUIREMENT"))
    private Set<Requirement> requirements;

    public final Long getId() {
        return id;
    }

    public final void setId(final Long id) {
        this.id = id;
    }

    public final String getPosition() {
        return position;
    }

    public final void setPosition(final String position) {
        this.position = position;
    }

    public final User getUser() {
        return user;
    }

    public final void setUser(final User user) {
        this.user = user;
    }

    public final double getSalaryFrom() {
        return salaryFrom;
    }

    public final void setSalaryFrom(final double salaryFrom) {
        this.salaryFrom = salaryFrom;
    }

    public final double getSalaryTo() {
        return salaryTo;
    }

    public final void setSalaryTo(final double salaryTo) {
        this.salaryTo = salaryTo;
    }

    public final String getVacancyState() {
        return vacancyState;
    }

    public final void setVacancyState(final String vacancyState) {
        this.vacancyState = vacancyState;
    }

    public final double getExperienceYearsRequire() {
        return experienceYearsRequire;
    }

    public final void setExperienceYearsRequire(final double experienceYearsRequire) {
        this.experienceYearsRequire = experienceYearsRequire;
    }

    public final Set<Interview> getInterviews() {
        if (this.interviews == null) {
            this.interviews = new HashSet<Interview>();
        }
        return interviews;
    }

    public final void setInterviews(final Set<Interview> interviews) {
        this.interviews = interviews;
    }

    public final Set<VacancyCandidate> getVacancyCandidates() {
        if (this.vacancyCandidates == null) {
            this.vacancyCandidates = new HashSet<VacancyCandidate>();
        }
        return vacancyCandidates;
    }

    public final void setVacancyCandidates(final Set<VacancyCandidate> vacancyCandidates) {
        this.vacancyCandidates = vacancyCandidates;
    }

    public final Set<Requirement> getRequirements() {
        if (this.requirements == null) {
            this.requirements = new HashSet<Requirement>();
        }
        return requirements;
    }

    public final void setRequirements(final Set<Requirement> requirements) {
        this.requirements = requirements;
    }
}
