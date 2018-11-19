package by.team34.entity;

import by.team34.entity.validation.Name;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "candidate")
public class Candidate {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Name
    @Column(name = "NAME")
    private String name;

    @Name
    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @DecimalMax("10000.0")
    @DecimalMin("200")
    @Column(name = "SALARY")
    private double salary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CANDIDATE_STATE")
    private CandidateState candidateState;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private Set<CandidateFeedback> candidateFeedbacks;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private Set<Attachment> attachments;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private Set<CandidateExperience> experiences;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private Set<ContactDetails> contactDetails;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private Set<Interview> interviews;

    @NotNull
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "candidate_competence",
            joinColumns = @JoinColumn(name = "CANDIDATE_ID"),
            inverseJoinColumns = @JoinColumn(name = "SKILL"))
    private Set<Skill> skills;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private Set<VacancyCandidate> vacancyCandidates;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public CandidateState getCandidateState() {
        return candidateState;
    }

    public void setCandidateState(CandidateState candidateState) {
        this.candidateState = candidateState;
    }

    public Set<CandidateFeedback> getCandidateFeedbacks() {
        if (this.candidateFeedbacks == null) {
            this.candidateFeedbacks = new HashSet<CandidateFeedback>();
        }
        return candidateFeedbacks;
    }

    public void setCandidateFeedbacks(Set<CandidateFeedback> candidateFeedbacks) {
        this.candidateFeedbacks = candidateFeedbacks;
    }

    public Set<Attachment> getAttachments() {
        if (this.attachments == null) {
            this.attachments = new HashSet<Attachment>();
        }
        return attachments;
    }

    public void setAttachments(Set<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Set<CandidateExperience> getExperiences() {
        if (this.experiences == null) {
            this.experiences = new HashSet<CandidateExperience>();
        }
        return experiences;
    }

    public void setExperiences(Set<CandidateExperience> experiences) {
        this.experiences = experiences;
    }

    public Set<ContactDetails> getContactDetails() {
        if (this.contactDetails == null) {
            this.contactDetails = new HashSet<ContactDetails>();
        }
        return contactDetails;
    }

    public void setContactDetails(Set<ContactDetails> contactDetails) {
        this.contactDetails = contactDetails;
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

    public Set<Skill> getSkills() {
        if (this.skills == null) {
            this.skills = new HashSet<Skill>();
        }
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
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
}
