package com.razorfish.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.razorfish.sample.dao.ActorDAO;
import com.razorfish.sample.model.Actor;
import com.razorfish.sample.service.ActorService;

@Service
public class ActiorServiceImpl implements ActorService {

	@Autowired
	ActorDAO actorDAO;
	
	@Override
	@Transactional
	public List<Actor> getActors() {
		return actorDAO.getActors();
	}

}
