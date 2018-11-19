package by.team34.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "requirement")
public class Requirement {

    @Id
    @Column(name = "NAME")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "vacancy_requirement",
            joinColumns = @JoinColumn(name = "REQUIREMENT"),
            inverseJoinColumns = @JoinColumn(name = "VACANCY_ID"))
    private Set<Vacancy> vacancies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Vacancy> getVacancies() {
        if (this.vacancies == null) {
            this.vacancies = new HashSet<Vacancy>();
        }
        return vacancies;
    }

    public void setVacancies(Set<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }
}
