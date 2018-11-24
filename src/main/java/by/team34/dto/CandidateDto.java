package by.team34.dto;

import java.util.*;

public class CandidateDto {

    private Long id;
    private String name;
    private String surname;
    private Date birthday;
    private double salary;

    private CandidateStateDto candidateState;
    private List<CandidateFeedbackDto> candidateFeedbacks;

    private Set<AttachmentDto> attachments;

    private Set<CandidateExperienceDto> experiences;
    private Set<ContactDetailsDto> contactDetails;
    private Set<InterviewDto> interviews;
    private List<SkillDto> skills;

    public CandidateDto(Long id, String name, String surname, Date birthday, double salary,
                        CandidateStateDto candidateState, List<CandidateFeedbackDto> candidateFeedbacks,
                        Set<AttachmentDto> attachments, Set<CandidateExperienceDto> experiences,
                        Set<ContactDetailsDto> contactDetails,
                        Set<InterviewDto> interviews, List<SkillDto> skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.salary = salary;
        this.candidateState = candidateState;
        this.candidateFeedbacks = candidateFeedbacks;
        this.attachments = attachments;
        this.experiences = experiences;
        this.contactDetails = contactDetails;
        this.interviews = interviews;
        this.skills = skills;
    }

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

    public final CandidateStateDto getCandidateState() {
        return candidateState;
    }

    public final void setCandidateState(final CandidateStateDto candidateState) {
        this.candidateState = candidateState;
    }

    public final List<CandidateFeedbackDto> getCandidateFeedbacks() {
        if (this.candidateFeedbacks == null) {
            this.candidateFeedbacks = new LinkedList<CandidateFeedbackDto>();
        }
        return candidateFeedbacks;
    }

    public final void setCandidateFeedbacks(final List<CandidateFeedbackDto> candidateFeedbacks) {
        this.candidateFeedbacks = candidateFeedbacks;
    }

    public final Set<AttachmentDto> getAttachments() {
        if (this.attachments == null) {
            this.attachments = new HashSet<AttachmentDto>();
        }
        return attachments;
    }

    public final void setAttachments(final Set<AttachmentDto> attachments) {
        this.attachments = attachments;
    }

    public final Set<CandidateExperienceDto> getExperiences() {
        if (this.experiences == null) {
            this.experiences = new HashSet<CandidateExperienceDto>();
        }
        return experiences;
    }

    public final void setExperiences(final Set<CandidateExperienceDto> experiences) {
        this.experiences = experiences;
    }

    public final Set<ContactDetailsDto> getContactDetails() {
        if (this.contactDetails == null) {
            this.contactDetails = new HashSet<ContactDetailsDto>();
        }
        return contactDetails;
    }

    public final void setContactDetails(final Set<ContactDetailsDto> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public final Set<InterviewDto> getInterviews() {
        if (this.interviews == null) {
            this.interviews = new HashSet<InterviewDto>();
        }
        return interviews;
    }

    public final void setInterviews(final Set<InterviewDto> interviews) {
        this.interviews = interviews;
    }

    public final List<SkillDto> getSkills() {
        if (this.skills == null) {
            this.skills = new LinkedList<SkillDto>();
        }
        return skills;
    }

    public final void setSkills(final List<SkillDto> skills) {
        this.skills = skills;
    }


}