package com.razorfish.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.razorfish.sample.model.Actor;

@Service
public interface ActorService {
	public List<Actor> getActors();
}
