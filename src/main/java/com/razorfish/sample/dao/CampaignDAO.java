package com.razorfish.sample.dao;

import java.util.List;

import com.razorfish.sample.dto.Campaign;
import com.razorfish.sample.dto.Category;

public interface CampaignDAO {
	public List<Campaign> getCampaigns();

	public List<Category> getCategories();
}
