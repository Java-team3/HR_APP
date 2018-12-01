package by.team34.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import by.team34.entity.Requirement;
import by.team34.entity.Vacancy;

public class VacancyDto {
	private Long id;
	private double salaryTo;
	private double salaryFrom;
	private double experienceYear;
	private String position;
	private Set<RequirementProxy> requirements;

	public VacancyDto(Vacancy vacancy) {
		this.id = vacancy.getId();
		this.salaryTo = vacancy.getSalaryTo();
		this.salaryFrom = vacancy.getSalaryFrom();
		this.experienceYear = vacancy.getExperienceYearsRequire();
		this.position = vacancy.getPosition();
		this.requirements = new RequirementProxy(vacancy.getRequirements()).getRequirements();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public double getExperienceYear() {
		return experienceYear;
	}

	public void setExperienceYear(double experienceYear) {
		this.experienceYear = experienceYear;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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
