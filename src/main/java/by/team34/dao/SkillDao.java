package by.team34.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.team34.entity.Skill;

@Repository
public class SkillDao implements IGenericDao<Skill, String> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Skill> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Skill").list();
	}

	@Override
	public List<Skill> sort(String type) {
		return sessionFactory.getCurrentSession().createQuery("select skill from Skill skill order by skill." + type)
				.list();
	}

	@Override
	public Skill findBy(String parameter) {
		return sessionFactory.getCurrentSession().get(Skill.class, parameter);
	}

	@Override
	public void insert(Skill object) {
		sessionFactory.getCurrentSession().save(object);
	}

	@Override
	public void update(Skill object) {
		sessionFactory.getCurrentSession().save(object);
	}

	@Override
	public void delete(String parameter) {
		Skill skill = sessionFactory.getCurrentSession().load(Skill.class, parameter);
		if (skill != null) {
			sessionFactory.getCurrentSession().delete(skill);
		}
	}

}
