package by.team34.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class VacancyCandidatePK implements Serializable {
    @Basic
    private long vacancyId;
    @Basic
    private long candidateId;
    @Basic
    private String suitableState;
    @Basic
    private String reason;
    public VacancyCandidatePK(final long vacancyId, final long candidateId,
                              final String suitableState, final String reason) {
        this.vacancyId = vacancyId;
        this.candidateId = candidateId;
        this.suitableState = suitableState;
        this.reason = reason;
    }
}
