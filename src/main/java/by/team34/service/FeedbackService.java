package by.team34.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.team34.dao.IGenericDao;
import by.team34.entity.CandidateFeedback;

@Transactional
@Service
public class FeedbackService implements IGenericService<CandidateFeedback, Long> {

	@Autowired
	private IGenericDao<CandidateFeedback, Long> dao;

	@Transactional
	@Override
	public List<CandidateFeedback> findAll() {
		return dao.findAll();
	}

	@Transactional
	@Override
	public List<CandidateFeedback> sort(String type) {
		return dao.sort(type);
	}

	@Transactional
	@Override
	public CandidateFeedback findBy(Long parameter) {
		return dao.findBy(parameter);
	}

	@Transactional
	@Override
	public void insert(CandidateFeedback object) {
		dao.insert(object);
	}

	@Transactional
	@Override
	public void update(CandidateFeedback object) {
		dao.update(object);
	}

	@Transactional
	@Override
	public void delete(Long parameter) {
		dao.delete(parameter);
	}
}
