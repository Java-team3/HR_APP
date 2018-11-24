package by.team34.dto;

import java.util.Set;

public class ResponsibilityDto {
    private String name;
    private Set<CandidateExperienceDto> candidateExperiences;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CandidateExperienceDto> getCandidateExperiences() {
        return candidateExperiences;
    }

    public void setCandidateExperiences(Set<CandidateExperienceDto> candidateExperiences) {
        this.candidateExperiences = candidateExperiences;
    }
}
