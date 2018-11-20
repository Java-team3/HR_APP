package by.team34.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class ContactDetailsPK implements Serializable{
	@Basic
	private long candidate_id;
	@Basic
	private String contact_type;
	@Basic
	private String contact_details;
	public ContactDetailsPK(long candidate_id, String contact_type, String contact_details) {
		this.candidate_id = candidate_id;
		this.contact_type = contact_type;
		this.contact_details = contact_details;
	}
	
	
}
