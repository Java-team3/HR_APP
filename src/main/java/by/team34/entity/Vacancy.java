package by.team34.entity;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "vacancy")
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Size(min = 5)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getSalaryFrom() {
        return salaryFrom;
    }

    public void setSalaryFrom(double salaryFrom) {
        this.salaryFrom = salaryFrom;
    }

    public double getSalaryTo() {
        return salaryTo;
    }

    public void setSalaryTo(double salaryTo) {
        this.salaryTo = salaryTo;
    }

    public String getVacancyState() {
        return vacancyState;
    }

    public void setVacancyState(String vacancyState) {
        this.vacancyState = vacancyState;
    }

    public double getExperienceYearsRequire() {
        return experienceYearsRequire;
    }

    public void setExperienceYearsRequire(double experienceYearsRequire) {
        this.experienceYearsRequire = experienceYearsRequire;
    }

    public Set<Interview> getInterviews() {
        if (this.interviews == null) {
            this.interviews = new HashSet<Interview>();
        }
        return interviews;
    }

    public void setInterviews(Set<Interview> interviews) {
        this.interviews = interviews;
    }

    public Set<VacancyCandidate> getVacancyCandidates() {
        if (this.vacancyCandidates == null) {
            this.vacancyCandidates = new HashSet<VacancyCandidate>();
        }
        return vacancyCandidates;
    }

    public void setVacancyCandidates(Set<VacancyCandidate> vacancyCandidates) {
        this.vacancyCandidates = vacancyCandidates;
    }

    public Set<Requirement> getRequirements() {
        if (this.requirements == null) {
            this.requirements = new HashSet<Requirement>();
        }
        return requirements;
    }

    public void setRequirements(Set<Requirement> requirements) {
        this.requirements = requirements;
    }
}
