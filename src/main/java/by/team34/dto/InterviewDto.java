package by.team34.dto;

import by.team34.entity.Candidate;
import by.team34.entity.Requirement;
import by.team34.entity.Vacancy;

import java.util.Date;
import java.util.Set;

public class InterviewDto {
    private Long id;

    private Long vacancyId;
    private Long candidateId;

    private Date factDate;
    private Date planDate;

    private VacancyProxy vacancy;
    private CandidateProxy candidate;


    public InterviewDto(Long id, Long vacancyId, Long candidateId, Date factDate, Date planDate,Vacancy vacancy,Candidate candidate) {
        this.id = id;
        this.vacancyId = vacancyId;
        this.candidateId = candidateId;
        this.factDate = factDate;
        this.planDate = planDate;
        this.vacancy = new VacancyProxy(vacancy);
        this.candidate = new CandidateProxy(candidate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFactDate() {
        return factDate;
    }

    public void setFactDate(Date factDate) {
        this.factDate = factDate;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public Long getVacancyId() {
        return vacancyId;
    }

    public void setVacancyId(Long vacancyId) {
        this.vacancyId = vacancyId;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }


    private class VacancyProxy{
        //а вот тут возможнл набор строк возврашать было бы лучше
        private Set<Requirement> requirements;
        private VacancyProxy(Vacancy vacancy) {
            //TODO кто нибудь у кого не валится ленивая инициализация попробуйте придумтаь тут
            //this.requirements = vacancy.getRequirements();
        }
    }

    private class CandidateProxy{
        private Long id;
        private String name;
        private String surname;
        private Date birthday;
        private double salary;

        private CandidateProxy(Candidate candidate) {
            this.id = candidate.getId();
            this.name = candidate.getName();
            this.surname = candidate.getSurname();
            this.birthday = candidate.getBirthday();
            this.salary = candidate.getSalary();
        }
    }


}
