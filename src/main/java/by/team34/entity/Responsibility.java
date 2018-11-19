package by.team34.entity;

import javax.persistence.*;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CandidateExperience> getCandidateExperiences() {
        if (this.candidateExperiences == null) {
            this.candidateExperiences = new HashSet<CandidateExperience>();
        }
        return candidateExperiences;
    }

    public void setCandidateExperiences(Set<CandidateExperience> candidateExperiences) {
        this.candidateExperiences = candidateExperiences;
    }
}
