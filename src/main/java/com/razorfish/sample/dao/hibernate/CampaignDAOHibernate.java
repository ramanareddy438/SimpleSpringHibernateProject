package com.razorfish.sample.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.razorfish.sample.dao.CampaignDAO;
import com.razorfish.sample.dto.Campaign;
import com.razorfish.sample.dto.Category;

@SuppressWarnings("unchecked")
@Repository
public class CampaignDAOHibernate implements CampaignDAO {

	@Autowired
	SessionFactory sessionFactory;

	
	@Override
	public List<Campaign> getCampaigns() {
		Criteria criteria = sessionFactory.openSession().createCriteria(Campaign.class);
		return criteria.list();
	}

	@Override
	public List<Category> getCategories() {
		Criteria criteria = sessionFactory.openSession().createCriteria(Category.class);
		return criteria.list();
	}
}
