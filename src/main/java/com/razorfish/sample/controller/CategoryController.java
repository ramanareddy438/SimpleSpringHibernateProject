package com.razorfish.sample.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.razorfish.sample.dto.Category;
import com.razorfish.sample.service.CampaignService;

@RestController
public class CategoryController {
	private Logger log = LogManager.getLogger(CategoryController.class);

	@Autowired
	CampaignService campaignService;

	@SuppressWarnings("resource")
	@RequestMapping(value="categoryList.go", method=RequestMethod.GET)
	public List<Category> listCategory(@RequestParam(value="paramName", defaultValue="defaultParamValue") String paramName) {
		log.info("Inside Category Controller: fetching listCategories()");
		Client client = new TransportClient().addTransportAddress(new InetSocketTransportAddress("localhost", 9300));

		//GetResponse respose = client.prepareGet("blog", "post", "1").execute().actionGet();
		SearchResponse response = client.prepareSearch("blog").setTypes("blog").setQuery(QueryBuilders.termQuery("multi", "test"))
				.setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
				.execute().actionGet();
		log.debug(response);
		/*for(SearchHit hit : response.getHits()) {

		}*/

		client.close();
		return campaignService.getCategories();
	}
}
