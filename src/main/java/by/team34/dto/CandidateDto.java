package by.team34.dto;

import java.util.*;

import by.team34.entity.Attachment;
import by.team34.entity.Candidate;
import by.team34.entity.CandidateState;
import by.team34.entity.ContactDetails;
import by.team34.entity.Skill;

public class CandidateDto {

	private Long id;
	private String name;
	private String surname;
	private Date birthday;
	private double salary;

	private CandidateStateProxy candidateState;
	private Set<AttachmentProxy> attachments;

	// private Set<CandidateExperienceDto> experiences;
	private Set<ContactDetailsProxy> contactDetails;
	private Set<SkillProxy> skills;

	public CandidateDto(Candidate candidate) {
		this.id = candidate.getId();
		this.name = candidate.getName();
		this.surname = candidate.getSurname();
		this.birthday = candidate.getBirthday();
		this.salary = candidate.getSalary();
		this.candidateState = new CandidateStateProxy(candidate.getCandidateState());
		this.attachments = new AttachmentProxy(candidate.getAttachments()).getAttachments();
		this.skills = new SkillProxy(candidate.getSkills()).getSkills();
		this.contactDetails = new ContactDetailsProxy(candidate.getContactDetails()).getContacts();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public CandidateStateProxy getCandidateState() {
		return candidateState;
	}

	public void setCandidateState(CandidateStateProxy candidateState) {
		this.candidateState = candidateState;
	}

	public Set<AttachmentProxy> getAttachments() {
		return attachments;
	}

	public void setAttachments(Set<AttachmentProxy> attachments) {
		this.attachments = attachments;
	}

	public Set<ContactDetailsProxy> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Set<ContactDetailsProxy> contactDetails) {
		this.contactDetails = contactDetails;
	}

	public Set<SkillProxy> getSkills() {
		return skills;
	}

	public void setSkills(Set<SkillProxy> skills) {
		this.skills = skills;
	}

	private class CandidateStateProxy {

		private String name;

		public CandidateStateProxy(CandidateState state) {
			this.name = state.getName();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	private class AttachmentProxy {

		private String filePath;
		private String attachmentType;
		private Set<AttachmentProxy> attachments;

		public AttachmentProxy(Attachment attachment) {
			this.filePath = attachment.getFilePath();
			this.attachmentType = attachment.getAttachmentType();
		}

		public AttachmentProxy(Set<Attachment> attachments) {
			this.attachments = new HashSet<AttachmentProxy>();
			for (Attachment attachment : attachments) {
				this.attachments.add(new AttachmentProxy(attachment));
			}
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getAttachmentType() {
			return attachmentType;
		}

		public void setAttachmentType(String attachmentType) {
			this.attachmentType = attachmentType;
		}

		public Set<AttachmentProxy> getAttachments() {
			return attachments;
		}

		public void setAttachments(Set<AttachmentProxy> attachments) {
			this.attachments = attachments;
		}

	}

	private class SkillProxy {

		private String name;
		private Set<SkillProxy> skills;

		public SkillProxy(Skill skill) {
			this.name = skill.getName();
		}

		public SkillProxy(Set<Skill> skills) {
			this.skills = new HashSet<SkillProxy>();
			for (Skill skill : skills) {
				this.skills.add(new SkillProxy(skill));
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<SkillProxy> getSkills() {
			return skills;
		}

		public void setSkills(Set<SkillProxy> skills) {
			this.skills = skills;
		}

	}

	private class ContactDetailsProxy {

		private String contactType;
		private String contactDetails;
		private Set<ContactDetailsProxy> contacts;

		public ContactDetailsProxy(ContactDetails contacts) {
			this.contactType = contacts.getContactType();
			this.contactDetails = contacts.getContactDetails();
		}

		public ContactDetailsProxy(Set<ContactDetails> contacts) {
			this.contacts = new HashSet<ContactDetailsProxy>();
			for (ContactDetails contact : contacts) {
				this.contacts.add(new ContactDetailsProxy(contact));
			}
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

		public Set<ContactDetailsProxy> getContacts() {
			return contacts;
		}

		public void setContacts(Set<ContactDetailsProxy> contacts) {
			this.contacts = contacts;
		}

	}

}
