package by.team34.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.team34.dao.IGenericDao;
import by.team34.entity.Skill;

@Transactional
@Service
public class SkillService implements IGenericService<Skill, String> {

	@Autowired
	private IGenericDao<Skill, String> skillDao;

	@Transactional
	@Override
	public List<Skill> findAll() {
		return skillDao.findAll();
	}

	@Transactional
	@Override
	public List<Skill> sort(String type) {
		return skillDao.sort(type);
	}

	@Transactional
	@Override
	public Skill findBy(String parameter) {
		return skillDao.findBy(parameter);
	}

	@Transactional
	@Override
	public void insert(Skill object) {
		skillDao.insert(object);
	}

	@Transactional
	@Override
	public void update(Skill object) {
		skillDao.update(object);
	}

	@Transactional
	@Override
	public void delete(String parameter) {
		skillDao.delete(parameter);
	}

}
