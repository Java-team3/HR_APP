package by.team34.dto;

import java.util.*;

public class CandidateDto {

    private Long id;
    private String name;
    private String surname;
    private Date birthday;
    private double salary;

    private CandidateStateDto candidateState;
    private List<AttachmentDto> attachments;

    private Set<CandidateExperienceDto> experiences;
    private List<ContactDetailsDto> contactDetails;
    private Set<InterviewDto> interviews;
    private List<SkillDto> skills;

    public CandidateDto(Long id, String name, String surname, Date birthday, double salary,
                        CandidateStateDto candidateState,
                        List<AttachmentDto> attachments,
                        Set<CandidateExperienceDto> experiences,
                        List<ContactDetailsDto> contactDetails,
                        Set<InterviewDto> interviews, List<SkillDto> skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.salary = salary;
        this.candidateState = candidateState;

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

    public final List<AttachmentDto> getAttachments() {
        if (this.attachments == null) {
            this.attachments = new LinkedList<AttachmentDto>();
        }
        return attachments;
    }

    public final void setAttachments(final List<AttachmentDto> attachments) {
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

    public final List<ContactDetailsDto> getContactDetails() {
        if (this.contactDetails == null) {
            this.contactDetails = new LinkedList<ContactDetailsDto>();
        }
        return contactDetails;
    }

    public final void setContactDetails(final List<ContactDetailsDto> contactDetails) {
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
