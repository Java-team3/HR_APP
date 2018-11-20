package by.team34.entity;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.FetchType;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @Column(name = "NAME")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "candidate_competence",
            joinColumns = @JoinColumn(name = "SKILL"),
            inverseJoinColumns = @JoinColumn(name = "CANDIDATE_ID"))
    private Set<Candidate> candidates;

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final Set<Candidate> getCandidates() {
        if (this.candidates == null) {
            this.candidates = new HashSet<Candidate>();
        }
        return candidates;
    }

    public final void setCandidates(final Set<Candidate> candidates) {
        this.candidates = candidates;
    }

    //    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "vacancy_requirement",
// joinColumns = @JoinColumn(name = "skill"),
// inverseJoinColumns = @JoinColumn(name = "idVacancy"))
//    private transient Set<Vacancy> vacancies;
}
