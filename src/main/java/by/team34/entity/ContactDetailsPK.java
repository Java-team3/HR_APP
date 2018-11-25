package by.team34.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class ContactDetailsPK implements Serializable {
    @Basic
    private long candidateId;
    @Basic
    private String contactType;
    @Basic
    private String contactDetails;

    public ContactDetailsPK() {}

    public ContactDetailsPK(final long candidateId,
                            final String contactType, final String contactDetails) {
        this.candidateId = candidateId;
        this.contactType = contactType;
        this.contactDetails = contactDetails;
    }


}
