package by.team34.dto;

import java.util.List;

public class VacancyDto {
    private Long id;
    private double salaryTo;
    private double salaryFrom;
    private double experienceYear;
    private String position;
    private UserDto user;
    private List<RequirementDto> requirements;


    public VacancyDto(Long id, double salaryTo, double salaryFrom,
                      double experienceYear, String position,
                      UserDto user, List<RequirementDto> requirements) {
        this.id = id;
        this.salaryTo = salaryTo;
        this.salaryFrom = salaryFrom;
        this.experienceYear = experienceYear;
        this.position = position;
        this.user = user;
        this.requirements = requirements;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSalaryTo() {
        return salaryTo;
    }

    public void setSalaryTo(double salaryTo) {
        this.salaryTo = salaryTo;
    }

    public double getSalaryFrom() {
        return salaryFrom;
    }

    public void setSalaryFrom(double salaryFrom) {
        this.salaryFrom = salaryFrom;
    }

    public double getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(double experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<RequirementDto> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<RequirementDto> requirements) {
        this.requirements = requirements;
    }
}
