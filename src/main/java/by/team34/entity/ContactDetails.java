package by.team34.entity;

import javax.persistence.*;


@Entity
@Table(name = "contact_details")
public class ContactDetails {

    @ManyToOne
    @JoinColumn(name = "CANDIDATE_ID")
    private Candidate candidate;
    @Column(name = "CONTACT_TYPE")
    private String contactType;
    @Column(name = "CONTACT_DETAILS")
    private String contactDetails;

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
}
