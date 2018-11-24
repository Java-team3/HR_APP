package by.team34.dto;

import by.team34.entity.ContactDetailsPK;

public class ContactDetailsDto {

    private ContactDetailsPK id;
    private CandidateDto candidate;

    private String contactType;
    private String contactDetails;

    public ContactDetailsPK getId() {
        return id;
    }

    public void setId(ContactDetailsPK id) {
        this.id = id;
    }

    public CandidateDto getCandidate() {
        return candidate;
    }

    public void setCandidate(CandidateDto candidate) {
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
