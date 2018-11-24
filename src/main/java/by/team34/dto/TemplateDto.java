package by.team34.dto;

import by.team34.entity.*;

import java.util.*;


public class TemplateDto {

    public static VacancyDto parseVacancy(Vacancy vacancy) {
        return new VacancyDto(vacancy.getId(), vacancy.getSalaryTo(),
                vacancy.getSalaryFrom(), vacancy.getExperienceYearsRequire(),
                vacancy.getPosition(), parseUser(vacancy.getUser()),
                parseRequirement(vacancy.getRequirements()));
    }

    public static List<VacancyDto> parseVacancyDto(Collection<Vacancy> vacancies) {
        List<VacancyDto> list = new LinkedList<VacancyDto>();
        for (Vacancy vacancy : vacancies) {
            list.add(parseVacancy(vacancy));
        }
        return list;
    }

    public static CandidateDto parseCandidate(Candidate candidate) {
        return new CandidateDto(candidate.getId(), candidate.getName(), candidate.getSurname(),
                candidate.getBirthday(), candidate.getSalary(), parseCandidateState(candidate.getCandidateState()),
                parseCandidateFeedbacksDto(candidate.getCandidateFeedbacks()),
                parseAttachmentDto(candidate.getAttachments()),
                parseExperienceDto(candidate.getExperiences()),
                parseContactDetailsDto(candidate.getContactDetails()),
                parseInterviewDto(candidate.getInterviews()),
                parseSkill(candidate.getSkills())
        );
    }

    public static AttachmentDto parseAttachment(Attachment attachment) {
        return new AttachmentDto(attachment.getAttachmentType(), attachment.getFilePath());
    }

    public static Set<AttachmentDto> parseAttachmentDto(Collection<Attachment> attachments) {
        HashSet<AttachmentDto> set = new HashSet<AttachmentDto>();
        for (Attachment attachment : attachments) {
            set.add(parseAttachment(attachment));
        }
        return set;
    }

    //NEED TO IMPLEMENT
    public static ContactDetailsDto parseContactDetails(ContactDetails contactDetails) {
        return new ContactDetailsDto();
    }

    public static Set<ContactDetailsDto> parseContactDetailsDto(Collection<ContactDetails> contactDetails) {
        HashSet<ContactDetailsDto> set = new HashSet<ContactDetailsDto>();
        for (ContactDetails contactDetails1 : contactDetails) {
            set.add(parseContactDetails(contactDetails1));
        }
        return set;
    }

    public static CandidateExperienceDto parseExperience(CandidateExperience candidateExperience) {
        return new CandidateExperienceDto(candidateExperience.getId(),
                candidateExperience.getDateFrom(), candidateExperience.getDateTo(),
                candidateExperience.getJobDescription(), candidateExperience.getJobPosition(),
                candidateExperience.getCompanyName(), parseResponsibilityDto(candidateExperience.getResponsibilities()));
    }

    public static ResponsibilityDto parseResponsibility(Responsibility responsibility) {
        return new ResponsibilityDto();
    }

    public static Set<ResponsibilityDto> parseResponsibilityDto(Collection<Responsibility> responsibilities) {
        HashSet<ResponsibilityDto> set = new HashSet<ResponsibilityDto>();
        for (Responsibility responsibility : responsibilities) {
            set.add(parseResponsibility(responsibility));
        }
        return set;
    }

    public static Set<CandidateExperienceDto> parseExperienceDto(Collection<CandidateExperience> candidateExperienceCollection) {
        HashSet<CandidateExperienceDto> set = new HashSet<CandidateExperienceDto>();
        for (CandidateExperience candidateExperience : candidateExperienceCollection) {
            set.add(parseExperience(candidateExperience));
        }
        return set;
    }

    public static List<CandidateDto> parseCandidateDto(Collection<Candidate> candidates) {
        List<CandidateDto> list = new LinkedList<CandidateDto>();
        for (Candidate candidate : candidates)
            list.add(parseCandidate(candidate));
        return list;
    }

    public static UserDto parseUser(User user) {
        return new UserDto(user.getId(), user.getName(),
                user.getSurname(), user.getEmail(), user.getPassword(),
                parseRole(user.getRoles()));
    }

    public static CandidateStateDto parseCandidateState(CandidateState candidateState) {
        return new CandidateStateDto(candidateState.getName());
    }

    public static CandidateFeedbackDto parseCandidateFeedbacks(CandidateFeedback candidateFeedback) {
        return new CandidateFeedbackDto(
                candidateFeedback.getId(),
                parseInterview(candidateFeedback.getInterview()),
                parseUser(candidateFeedback.getUser()),
                parseFeedbackState(candidateFeedback.getFeedbackState()),
                candidateFeedback.getFeedBackText(),
                parseFeedbacksDetailsDto(candidateFeedback.getFeedbackDetails())
        );
    }

    public static List<CandidateFeedbackDto> parseCandidateFeedbacksDto(Collection<CandidateFeedback> inList) {
        List<CandidateFeedbackDto> list = new LinkedList<CandidateFeedbackDto>();
        for (CandidateFeedback candidateFeedback : inList)
            list.add(parseCandidateFeedbacks(candidateFeedback));
        return list;
    }

    public static FeedbackStateDto parseFeedbackState(FeedbackState candidateState) {
        return new FeedbackStateDto(candidateState.getName());
    }

    //NEED TO IMPLEMENT BUT I DON'Y KNOW WHAT IS IT
    public static FeedbackDetailsDto parseFeedbackDetails(FeedbackDetails feedbackDetails) {
        return new FeedbackDetailsDto();
    }

    public static Set<FeedbackDetailsDto> parseFeedbacksDetailsDto(Collection<FeedbackDetails> feedbackDetails) {
        HashSet<FeedbackDetailsDto> set = new HashSet<FeedbackDetailsDto>();
        for (FeedbackDetails feedbackDet : feedbackDetails) {
            set.add(parseFeedbackDetails(feedbackDet));
        }
        return set;
    }

    //NEED TO IMPLEMENT IT'S VLADISLAV JOB
    public static InterviewDto parseInterview(Interview interview) {
        return new InterviewDto();
    }

    //  need to implement
    public static Set<InterviewDto> parseInterviewDto(Collection<Interview> interviews) {
        HashSet<InterviewDto> set = new HashSet<InterviewDto>();
        for (Interview interview : interviews) {
            set.add(parseInterview(interview));
        }
        return set;
    }


    public static Set<RoleDto> parseRole(Collection<Role> roles) {
        HashSet<RoleDto> set = new HashSet<RoleDto>();
        for (Role role : roles) {
            set.add(new RoleDto(role.getId(), role.getName()));
        }
        return set;
    }

    public static List<UserDto> parseUserDto(Collection<User> users) {
        List<UserDto> list = new LinkedList<UserDto>();
        for (User user : users) {
            list.add(parseUser(user));
        }
        return list;
    }
    
    public static SkillDto parseSkill(Skill skill) {
    	return new SkillDto(skill.getName());
    }

    public static List<SkillDto> parseSkill(Collection<Skill> skills) {
        List<SkillDto> list = new LinkedList<SkillDto>();
        for (Skill skill : skills) {
            list.add(new SkillDto(skill.getName()));
        }
        return list;
    }

    public static List<RequirementDto> parseRequirement(Collection<Requirement> requirements) {
        List<RequirementDto> list = new LinkedList<RequirementDto>();
        for (Requirement requirement : requirements) {
            list.add(new RequirementDto(requirement.getName()));
        }
        return list;
    }

}
