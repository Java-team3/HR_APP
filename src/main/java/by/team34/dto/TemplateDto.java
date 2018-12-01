
package by.team34.dto;

import by.team34.entity.*;

import java.util.*;


public class TemplateDto {

    public static List<VacancyDto> parseVacancyDto(Collection<Vacancy> vacancies) {
        List<VacancyDto> list = new LinkedList<VacancyDto>();
        for (Vacancy vacancy : vacancies) {
            list.add(new VacancyDto(vacancy));
        }
        return list;
    }

    public static CandidateDto parseCandidate(Candidate candidate) {

        System.out.println("-------------------------------------------------------");
        System.out.println(candidate.getContactDetails().size());
        System.out.println("-------------------------------------------------------");

        return new CandidateDto(candidate.getId(),
                candidate.getName(),
                candidate.getSurname(),
                candidate.getBirthday(),
                candidate.getSalary(),
                parseCandidateState(candidate.getCandidateState()),
                parseAttachmentDto(candidate.getAttachments()),
                parseExperienceDto(candidate.getExperiences()),
                parseContactDetailsDto(candidate.getContactDetails()),
                parseInterviewDto(candidate.getInterviews()),
                parseSkill(candidate.getSkills())
        );
    }

    public static AttachmentDto parseAttachment(Attachment attachment) {
        return new AttachmentDto(attachment.getAttachmentType().toString(), attachment.getFilePath());
    }

    public static List<AttachmentDto> parseAttachmentDto(Collection<Attachment> attachments) {
        LinkedList<AttachmentDto> set = new LinkedList<AttachmentDto>();
        for (Attachment attachment : attachments) {
            set.add(parseAttachment(attachment));
        }
        return set;
    }

    public static ContactDetailsDto parseContactDetails(ContactDetails contactDetails) {
        return new ContactDetailsDto(contactDetails.getContactType(), contactDetails.getContactDetails());
    }

    public static List<ContactDetailsDto> parseContactDetailsDto(Collection<ContactDetails> contactDetails) {
        List<ContactDetailsDto> list = new LinkedList<ContactDetailsDto>();
        for (ContactDetails contactDetails1 : contactDetails) {
            list.add(parseContactDetails(contactDetails1));
        }
        return list;
    }

    public static CandidateExperienceDto parseExperience(CandidateExperience candidateExperience) {
        return new CandidateExperienceDto(candidateExperience.getId(),
                candidateExperience.getDateFrom(), candidateExperience.getDateTo(),
                candidateExperience.getJobDescription(), candidateExperience.getJobPosition(),
                candidateExperience.getCompanyName(), parseResponsibilityDto(candidateExperience.getResponsibilities()));
    }

    public static ResponsibilityDto parseResponsibility(Responsibility responsibility) {
        return new ResponsibilityDto(responsibility.getName());
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

    public static CandidateStateDto parseCandidateState(CandidateState candidateState) {
        return new CandidateStateDto(candidateState.getName());
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

    public static InterviewDto parseInterview(Interview interview) {

        return new InterviewDto(
                interview.getId(),
                interview.getVacancy().getId(),
                interview.getCandidate().getId(),
                interview.getFactDate(),
                interview.getPlanDate());
    }

    public static Set<InterviewDto> parseInterviewDto(Collection<Interview> interviews) {
        HashSet<InterviewDto> set = new HashSet<InterviewDto>();
        for (Interview interview : interviews) {
            set.add(parseInterview(interview));
        }
        return set;
    }

    
    public static SkillDto parseSkillDto(Skill skill) {
    	return new SkillDto(skill.getName());
    }

    public static List<UserDto> parseUserDto(Collection<User> users) {
        List<UserDto> list = new LinkedList<UserDto>();
        for (User user : users) {
            list.add(new UserDto(user));
        }
        return list;
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
    
    public static List<FeedbackDto> parseFeedback(Collection<CandidateFeedback> feedback){
    	List<FeedbackDto> list = new LinkedList<FeedbackDto>();
    	for (CandidateFeedback feedBack : feedback) {
    		list.add(new FeedbackDto(feedBack));
    	}
    	return list;
    }
}
