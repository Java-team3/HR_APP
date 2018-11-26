package by.team34.entity;

import by.team34.entity.validation.Name;

import javax.persistence.*;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import java.util.*;


@Entity
@Table(name = "candidate")
public class Candidate {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

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

    @ElementCollection
    @CollectionTable(name = "contact_details",
            joinColumns = @JoinColumn(name = "CANDIDATE_ID"))
    private List<ContactDetails> contactDetails;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private Set<Interview> interviews;

    @NotNull
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "candidate_competence",
            joinColumns = @JoinColumn(name = "CANDIDATE_ID"),
            inverseJoinColumns = @JoinColumn(name = "SKILL"))
    private List<Skill> skills;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private Set<VacancyCandidate> vacancyCandidates;


    public final Long getId() {
        return id;
    }

    public final void setId(final Long id) {
        this.id = id;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getSurname() {
        return surname;
    }

    public final void setSurname(final String surname) {
        this.surname = surname;
    }

    public final Date getBirthday() {
        return birthday;
    }

    public final void setBirthday(final Date birthday) {
        this.birthday = birthday;
    }

    public final double getSalary() {
        return salary;
    }

    public final void setSalary(final double salary) {
        this.salary = salary;
    }

    public final CandidateState getCandidateState() {
        return candidateState;
    }

    public final void setCandidateState(final CandidateState candidateState) {
        this.candidateState = candidateState;
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

    public final Set<Attachment> getAttachments() {
        if (this.attachments == null) {
            this.attachments = new HashSet<Attachment>();
        }
        return attachments;
    }

    public final void setAttachments(final Set<Attachment> attachments) {
        this.attachments = attachments;
    }

    public final Set<CandidateExperience> getExperiences() {
        if (this.experiences == null) {
            this.experiences = new HashSet<CandidateExperience>();
        }
        return experiences;
    }

    public final void setExperiences(final Set<CandidateExperience> experiences) {
        this.experiences = experiences;
    }

    public final List<ContactDetails> getContactDetails() {
        if (this.contactDetails == null) {
            this.contactDetails = new LinkedList<ContactDetails>();
        }
        return contactDetails;
    }

    public final void setContactDetails(final List<ContactDetails> contactDetails) {
        this.contactDetails = contactDetails;
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

    public final List<Skill> getSkills() {
        if (this.skills == null) {
            this.skills = new LinkedList<Skill>();
        }
        return skills;
    }

    public final void setSkills(final List<Skill> skills) {
        this.skills = skills;
    }

    public final  Set<VacancyCandidate> getVacancyCandidates() {
        if (this.vacancyCandidates == null) {
            this.vacancyCandidates = new HashSet<VacancyCandidate>();
        }
        return vacancyCandidates;
    }

    public final void setVacancyCandidates(final Set<VacancyCandidate> vacancyCandidates) {
        this.vacancyCandidates = vacancyCandidates;
    }
}
