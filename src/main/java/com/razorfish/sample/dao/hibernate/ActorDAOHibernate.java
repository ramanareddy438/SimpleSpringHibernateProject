package com.razorfish.sample.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.razorfish.sample.dao.ActorDAO;
import com.razorfish.sample.model.Actor;

@Repository
public class ActorDAOHibernate implements ActorDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Actor> getActors() {
		//SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Actor.class);
		return criteria.list();
	}
}