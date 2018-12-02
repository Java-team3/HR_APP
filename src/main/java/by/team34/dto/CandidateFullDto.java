package by.team34.dto;

import by.team34.entity.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CandidateFullDto extends CandidateDto{

	Set<CandidateFeedbackProxy> candidateFeedbacks;
	Set<CandidateExperienceProxy> candidateExperiences;
	Set<Interview> interviews;


	public CandidateFullDto(Candidate candidate) {
		super(candidate);

		this.candidateFeedbacks = new HashSet<CandidateFeedbackProxy>();
		for (CandidateFeedback candidateFeedback:
			 candidate.getCandidateFeedbacks()) {
						this.candidateFeedbacks.add(new CandidateFeedbackProxy(candidateFeedback));
		}


		this.candidateExperiences = new HashSet<CandidateExperienceProxy>();
		for (CandidateExperience candidateExperience:
				candidate.getExperiences()) {
			this.candidateExperiences.add(new CandidateExperienceProxy(candidateExperience));
		}

	}



	private class CandidateFeedbackProxy{
		Long id;
		String feedbackState;
		String feedbackText;
		//TODO дополнить возможно в CandidateFeedback что то
		public CandidateFeedbackProxy(CandidateFeedback candidateFeedback){
			this.id = candidateFeedback.getId();
			this.feedbackState = candidateFeedback.getFeedbackState().getName();
			this.feedbackText = candidateFeedback.getFeedBackText();
		}
	}

	private class CandidateExperienceProxy{
		Long id;
		Date dateFrom;
		Date dateTo;
		String jobDescription;
		String jobPosition;
		String companyName;
		//TODO add responsibilities


		public CandidateExperienceProxy(CandidateExperience candidateExperience) {
			this.id = candidateExperience.getId();
			this.dateFrom = candidateExperience.getDateFrom();
			this.dateTo = candidateExperience.getDateTo();
			this.jobDescription = candidateExperience.getJobDescription();
			this.jobPosition = candidateExperience.getJobPosition();
			this.companyName = candidateExperience.getCompanyName();
		}
	}
}
