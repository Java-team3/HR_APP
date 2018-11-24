package by.team34.dto;

import by.team34.entity.SuitableStatePK;

import java.util.Set;

public class SuitableStateDto {

    private SuitableStatePK id;

    private String name;

    private Set<VacancyCandidateDto> vacancyCandidates;

    public SuitableStatePK getId() {
        return id;
    }

    public void setId(SuitableStatePK id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<VacancyCandidateDto> getVacancyCandidates() {
        return vacancyCandidates;
    }

    public void setVacancyCandidates(Set<VacancyCandidateDto> vacancyCandidates) {
        this.vacancyCandidates = vacancyCandidates;
    }
}
