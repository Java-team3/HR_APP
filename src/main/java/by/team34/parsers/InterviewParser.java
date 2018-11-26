package by.team34.parsers;

import by.team34.dto.InterviewDto;
import by.team34.entity.Interview;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InterviewParser {

    public static Set<InterviewDto> parseDTO(Collection<Interview> interviews){
        return  parseInterviewDto(interviews);
    }

    public static InterviewDto parse(Interview interview){
        return parseInterview(interview);
    }

    private static Set<InterviewDto> parseInterviewDto(Collection<Interview> interviews) {
        HashSet<InterviewDto> set = new HashSet<InterviewDto>();
        for (Interview interview : interviews) {
            set.add(parse(interview));
        }
        return set;
    }

    private static InterviewDto parseInterview(Interview interview) {
        return new InterviewDto(
                interview.getId(),
                interview.getVacancy().getId(),
                interview.getCandidate().getId(),
                interview.getFactDate(),
                interview.getPlanDate(),
                interview.getVacancy(),
                interview.getCandidate()
                );
    }

}
