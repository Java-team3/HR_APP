package by.team34.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.team34.entity.CandidateFeedback;

@Repository
public class FeedbackDao implements IGenericDao<CandidateFeedback, Long> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<CandidateFeedback> findAll() {
		return sessionFactory.getCurrentSession().createQuery("select distinct feedback"
				+ " from CandidateFeedback feedback"
				+ " left join fetch feedback.candidate candidate"
				+ " left join fetch candidate.candidateState"
				+ " left join fetch candidate.skills"
				+ " left join fetch candidate.contactDetails"
				+ " left join fetch candidate.attachments"
				+ " left join fetch feedback.interview interview" 
				+ " left join fetch interview.vacancy vacancy"
				+ " left join fetch vacancy.requirements requirements" 
				+ " left join fetch feedback.user user"
				+ " left join fetch user.roles roles" 
				+ " left join fetch feedback.feedbackState state").list();
	}

	@Override
	public List<CandidateFeedback> sort(String type) {
		return sessionFactory.getCurrentSession().createQuery("select distinct feedback"
				+ " from CandidateFeedback feedback"
				+ " left join fetch feedback.candidate candidate"
				+ " left join fetch candidate.candidateState st"
				+ " left join fetch candidate.skills skills"
				+ " left join fetch candidate.contactDetails details"
				+ " left join fetch candidate.attachments"
				+ " left join fetch feedback.interview interview" 
				+ " left join fetch interview.vacancy vacancy"
				+ " left join fetch vacancy.requirements requirements" 
				+ " left join fetch feedback.user user"
				+ " left join fetch user.roles roles" 
				+ " left join fetch feedback.feedbackState state order by feedback." + type).list();
	}

	@Override
	public CandidateFeedback findBy(Long parameter) {
		return sessionFactory.getCurrentSession().get(CandidateFeedback.class, parameter);
	}

	@Override
	public void insert(CandidateFeedback object) {
		sessionFactory.getCurrentSession().save(object);
	}

	@Override
	public void update(CandidateFeedback object) {
		sessionFactory.getCurrentSession().update(object);

	}

	@Override
	public void delete(Long parameter) {
		CandidateFeedback feedback = sessionFactory.getCurrentSession().load(CandidateFeedback.class, parameter);
		if (feedback != null) {
			sessionFactory.getCurrentSession().delete(feedback);
		}
	}
}
