package by.team34.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Skill {
    @Id
    @Column(name = "NAME")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "candidate_competence",
            joinColumns = @JoinColumn(name = "SKILL"),
            inverseJoinColumns = @JoinColumn(name = "CANDIDATE_ID"))
    private Set<Candidate> candidates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Candidate> getCandidates() {
        if (this.candidates == null) {
            this.candidates = new HashSet<Candidate>();
        }
        return candidates;
    }

    public void setCandidates(Set<Candidate> candidates) {
        this.candidates = candidates;
    }

    //    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "vacancy_requirement", joinColumns = @JoinColumn(name = "skill"), inverseJoinColumns = @JoinColumn(name = "idVacancy"))
//    private transient Set<Vacancy> vacancies;
}
