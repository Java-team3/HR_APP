package by.team34.entity;

import javax.persistence.*;

@Embeddable
public class ContactDetails {

    @Column(name = "CONTACT_TYPE")
    private String contactType;
    @Column(name = "CONTACT_DETAILS")
    private String contactDetails;

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
