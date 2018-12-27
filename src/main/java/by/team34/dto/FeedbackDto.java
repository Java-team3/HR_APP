package by.team34.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import by.team34.entity.Candidate;
import by.team34.entity.CandidateFeedback;
import by.team34.entity.FeedbackState;
import by.team34.entity.Interview;
import by.team34.entity.Requirement;
import by.team34.entity.Role;
import by.team34.entity.User;
import by.team34.entity.Vacancy;

public class FeedbackDto {

	private Long id;
	private String feedBackText;

	private CandidateProxy candidate;
	private InterviewProxy interview;
	private InterviewerProxy interviewer;
	private FeedbackStateProxy feedbackState;

	public FeedbackDto(CandidateFeedback feedBack) {
		this.id = feedBack.getId();
		this.feedBackText = feedBack.getFeedBackText();
		this.candidate = new CandidateProxy(feedBack.getCandidate());
		this.interview = new InterviewProxy(feedBack.getInterview());
		this.interviewer = new InterviewerProxy(feedBack.getUser());
		this.feedbackState = new FeedbackStateProxy(feedBack.getFeedbackState());
	}

	private class CandidateProxy {

		public CandidateProxy(Candidate candidate) {

		}

	}

	private class InterviewProxy {

		private Long id;
		private Date factDate;
		private Date planDate;
		private VacancyProxy vacancy;

		public InterviewProxy(Interview interview) {
			this.id = interview.getId();
			this.factDate = interview.getFactDate();
			this.planDate = interview.getPlanDate();
		}
		
		

		private class VacancyProxy {

			private Long id;
			private String position;
			private double salaryTo;
			private double salaryFrom;
			private Set<RequirementProxy> requirements;

			public VacancyProxy(Vacancy vacancy) {
				this.id = vacancy.getId();
				this.position = vacancy.getPosition();
				this.salaryFrom = vacancy.getSalaryFrom();
				this.salaryTo = vacancy.getSalaryTo();
				this.requirements = new RequirementProxy(vacancy.getRequirements()).getRequirements();
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getPosition() {
				return position;
			}

			public void setPosition(String position) {
				this.position = position;
			}

			public double getSalaryTo() {
				return salaryTo;
			}

			public void setSalaryTo(double salaryTo) {
				this.salaryTo = salaryTo;
			}

			public double getSalaryFrom() {
				return salaryFrom;
			}

			public void setSalaryFrom(double salaryFrom) {
				this.salaryFrom = salaryFrom;
			}

			public Set<RequirementProxy> getRequirements() {
				return requirements;
			}

			public void setRequirements(Set<RequirementProxy> requirements) {
				this.requirements = requirements;
			}

			private class RequirementProxy {

				private String name;
				private Set<RequirementProxy> requirements;

				public RequirementProxy(Requirement requirement) {
					this.name = requirement.getName();
				}

				public RequirementProxy(Set<Requirement> requirements) {
					this.requirements = new HashSet<RequirementProxy>();
					for (Requirement req : requirements) {
						this.requirements.add(new RequirementProxy(req));
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

	}

	private class InterviewerProxy {

		private Long id;
		private String name;
		private String surname;
		private String userState;
		private String email;
		private String password;
		private Set<RoleProxy> roles;

		public InterviewerProxy(User interviewer) {
			this.id = interviewer.getId();
			this.name = interviewer.getName();
			this.surname = interviewer.getSurname();
			this.userState = interviewer.getUserState().name();
			this.email = interviewer.getEmail();
			this.password = interviewer.getPassword();
			this.roles = new RoleProxy(interviewer.getRoles()).getRoles();
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

		public String getUserState() {
			return userState;
		}

		public void setUserState(String userState) {
			this.userState = userState;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Set<RoleProxy> getRoles() {
			return roles;
		}

		public void setRoles(Set<RoleProxy> roles) {
			this.roles = roles;
		}

		private class RoleProxy {

			private Long id;
			private String name;
			private Set<RoleProxy> roles;

			public RoleProxy(Role role) {
				this.id = role.getId();
				this.name = role.getName();
			}

			public RoleProxy(Set<Role> roles) {
				this.roles = new HashSet<RoleProxy>();
				for (Role role : roles) {
					this.roles.add(new RoleProxy(role));
				}
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

			public Set<RoleProxy> getRoles() {
				return roles;
			}

			public void setRoles(Set<RoleProxy> roles) {
				this.roles = roles;
			}

		}

	}

	private class FeedbackStateProxy {

		private String name;

		public FeedbackStateProxy(FeedbackState feedbackState) {
			this.name = feedbackState.getName();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
	
}
