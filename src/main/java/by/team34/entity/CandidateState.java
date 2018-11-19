package by.team34.entity;

import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "candidate_state")
public class CandidateState {

    @Id
    @Column(name = "NAME")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "candidateState")
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
}
