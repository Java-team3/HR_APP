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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<VacancyCandidate> getVacancyCandidates() {
        if (this.vacancyCandidates == null) {
            this.vacancyCandidates = new HashSet<VacancyCandidate>();
        }
        return vacancyCandidates;
    }

    public void setVacancyCandidates(Set<VacancyCandidate> vacancyCandidates) {
        this.vacancyCandidates = vacancyCandidates;
    }
}
