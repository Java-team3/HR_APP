package by.team34.entity;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;

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

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final Set<Vacancy> getVacancies() {
        if (this.vacancies == null) {
            this.vacancies = new HashSet<Vacancy>();
        }
        return vacancies;
    }

    public final void setVacancies(final Set<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }
}
