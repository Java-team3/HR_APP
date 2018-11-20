package by.team34.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Embeddable
@Table(name = "contact_details")
public class ContactDetails {
	
	@EmbeddedId
	private ContactDetailsPK id;

    @ManyToOne
    @JoinColumn(name = "CANDIDATE_ID")
    private Candidate candidate;
    @Column(name = "CONTACT_TYPE")
    private String contactType;
    @Column(name = "CONTACT_DETAILS")
    private String contactDetails;

    public final Candidate getCandidate() {
        return candidate;
    }

    public final void setCandidate(final Candidate candidate) {
        this.candidate = candidate;
    }

    public final String getContactType() {
        return contactType;
    }

    public final void setContactType(final String contactType) {
        this.contactType = contactType;
    }

    public final String getContactDetails() {
        return contactDetails;
    }

    public final void setContactDetails(final String contactDetails) {
        this.contactDetails = contactDetails;
    }
}
