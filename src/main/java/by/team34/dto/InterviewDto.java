package by.team34.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import by.team34.entity.Attachment;
import by.team34.entity.Candidate;
import by.team34.entity.CandidateState;
import by.team34.entity.Interview;
import by.team34.entity.Requirement;
import by.team34.entity.Vacancy;

public class InterviewDto {

	private Long id;
	private Date factDate;
	private Date planDate;
	private VacancyProxy vacancy;
	private CandidateProxy candidate;

	public InterviewDto(Interview interview) {
		this.id = interview.getId();
		this.planDate = interview.getPlanDate();
		this.factDate = interview.getFactDate();
		this.vacancy = new VacancyProxy(interview.getVacancy());
		this.candidate = new CandidateProxy(interview.getCandidate());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFactDate() {
		return factDate;
	}

	public void setFactDate(Date factDate) {
		this.factDate = factDate;
	}

	public Date getPlanDate() {
		return planDate;
	}

	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}

	public VacancyProxy getVacancy() {
		return vacancy;
	}

	public void setVacancy(VacancyProxy vacancy) {
		this.vacancy = vacancy;
	}

	public CandidateProxy getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateProxy candidate) {
		this.candidate = candidate;
	}

	private class VacancyProxy {

		private String position;
		private Set<RequirementProxy> requirements;

		public VacancyProxy(Vacancy vacancy) {
			this.position = vacancy.getPosition();
		}

		private class RequirementProxy {

			private String name;
			private Set<RequirementProxy> requirements;

			public RequirementProxy(Requirement requirement) {
				this.name = requirement.getName();
			}

			public RequirementProxy(Set<Requirement> requirements) {
				this.requirements = new HashSet<RequirementProxy>();
				for (Requirement requirement : requirements) {
					this.requirements.add(new RequirementProxy(requirement));
				}
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Set<RequirementProxy> getRequirements() {
				return requirements;
			}

			public void setRequirements(Set<RequirementProxy> requirements) {
				this.requirements = requirements;
			}

		}

	}

	private class CandidateProxy {

		private Long id;
		private String name;
		private String surname;
		private Date birthday;
		private double salary;
		private CandidateStateProxy candidateState;
		private Set<AttachmentProxy> attachments;

		public CandidateProxy(Candidate candidate) {
			this.id = candidate.getId();
			this.name = candidate.getName();
			this.surname = candidate.getSurname();
			this.birthday = candidate.getBirthday();
			this.salary = candidate.getSalary();
			this.candidateState = new CandidateStateProxy(candidate.getCandidateState());
			this.attachments = new AttachmentProxy(candidate.getAttachments()).getAttachments();
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
				this.attachmentType = attachment.getAttachmentType().name();
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
	}

}
