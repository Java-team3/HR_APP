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
@Table(name = "responsibility")
public class Responsibility {

    @Id
    @Column(name = "NAME")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "candidate_responsibility",
            joinColumns = @JoinColumn(name = "RESPONSIBILITY"),
            inverseJoinColumns = @JoinColumn(name = "CANDIDATE_EXPERIENCE_ID"))
    private Set<CandidateExperience> candidateExperiences;

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final Set<CandidateExperience> getCandidateExperiences() {
        if (this.candidateExperiences == null) {
            this.candidateExperiences = new HashSet<CandidateExperience>();
        }
        return candidateExperiences;
    }

    public final void setCandidateExperiences(final Set<CandidateExperience> candidateExperiences) {
        this.candidateExperiences = candidateExperiences;
    }
}
