package by.team34.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "suitable_state")
public class SuitableState {

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "suitableState")
    private Set<VacancyCandidate> vacancyCandidates;

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final Set<VacancyCandidate> getVacancyCandidates() {
        if (this.vacancyCandidates == null) {
            this.vacancyCandidates = new HashSet<VacancyCandidate>();
        }
        return vacancyCandidates;
    }

    public final void setVacancyCandidates(final Set<VacancyCandidate> vacancyCandidates) {
        this.vacancyCandidates = vacancyCandidates;
    }
}
