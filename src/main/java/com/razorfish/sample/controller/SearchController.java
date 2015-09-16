package com.razorfish.sample.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeFilterBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class SearchController {
	Logger log = LogManager.getLogger(SearchController.class);

	@SuppressWarnings("resource")
	@RequestMapping(value="searchblog.go", method=RequestMethod.GET)
	public String doElasticSearch(Map<String, Object> map, @RequestParam(value="searchField", defaultValue="body") String searchField, @RequestParam(value="searchTerm", defaultValue="lorem ipsum") String searchTerm) {
		log.debug("Search Term :" + searchTerm);

		Client client = new TransportClient().addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
		/*SearchResponse response = client.prepareSearch("blog").setTypes("post").setQuery(QueryBuilders.queryStringQuery(searchTerm))
				.setSearchType(SearchType.QUERY_AND_FETCH)
				.execute().actionGet();*/
		SearchResponse response = client.prepareSearch("blog").setTypes("post").setQuery(QueryBuilders.queryStringQuery("*" + searchTerm + "*"))
				.setSearchType(SearchType.QUERY_AND_FETCH)
				.execute().actionGet();

		/*SearchResponse response1 = client.prepareSearch("blog").setTypes("post").setQuery(searchTerm)
				.setSearchType(SearchType.QUERY_AND_FETCH)
				.execute().actionGet();*/
		//log.debug("Raw Search String Query" + response1.toString());

		SearchHits hits = response.getHits();
		List<String> searchResultPosts = new ArrayList<String>();
		//Post post = null;
		for (SearchHit hit : hits) {
			log.debug("------------------------------");
			Map<String, Object> result = hit.getSource();
			log.debug("Each Search Hit :" + result);
			//post = new Post((String) result.get("user"), (String) result.get("title"), (String) result.get("postDate"), (String)result.get("body"));
			//searchResultPosts.add(post.toString());
			//searchResultPosts.add("|- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -|");
			searchResultPosts.add("User :" + result.get("user").toString() + " | Title :" + result.get("title").toString() + " | Post Date :" + result.get("postDate").toString() + " | Body :" + result.get("body").toString());
			searchResultPosts.add("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			//log.debug(post);
		}

		log.debug(response.toString());
		map.put("searchField", searchField);
		map.put("searchTerm", searchTerm);
		map.put("results", searchResultPosts);
		map.put("noOfHits", hits.getTotalHits());
		return "home";
	}

	@SuppressWarnings("resource")
	@RequestMapping(value="search.go", method=RequestMethod.GET)
	public String doElasticSearchActor(Map<String, Object> map, @RequestParam("searchTerm") String searchTerm, @RequestParam("searchFromDate") String searchFromDate, @RequestParam("searchToDate") String searchToDate) throws ParseException {
		Client client = new TransportClient().addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
		SearchRequestBuilder searchRequestBuilder = client.prepareSearch().setIndices("sakila").setTypes("actor");
		
		SearchResponse response = null;
		QueryBuilder queryBuilder = null;
		if(searchTerm != null) {
			log.info("searchTerm :" + searchTerm);
			if(searchTerm.isEmpty()) {
				queryBuilder = QueryBuilders.queryStringQuery("*");
			} else {
				queryBuilder = QueryBuilders.queryStringQuery("*" + searchTerm + "*");
			}
		}

		RangeFilterBuilder rangeFilterBuilder = FilterBuilders.rangeFilter("@timestamp");

		boolean isDate = searchFromDate.contains("-") && searchToDate.contains("-");
		
		if(searchFromDate != null && searchToDate != null && isDate) {
			log.debug("Search From Date :" + searchFromDate);
			Date fromDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(searchFromDate);
			rangeFilterBuilder.from(fromDate);
			log.debug("Search To Date :" + searchToDate);
			Date toDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(searchToDate);
			rangeFilterBuilder.to(toDate);
		}

		//rangeFilterBuilder.timeZone("+5:30");
		

		if(searchFromDate != null && searchToDate != null && !isDate) {
			rangeFilterBuilder = FilterBuilders.rangeFilter("actor_id");
			log.debug("Search From Date :" + searchFromDate);
			//Date fromDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(searchFromDate);
			rangeFilterBuilder.from(Integer.parseInt(searchFromDate));
			log.debug("Search To Date :" + searchToDate);
			//Date toDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(searchToDate);
			rangeFilterBuilder.to(Integer.parseInt(searchToDate));
		}

		//rangeQueryBuilder.from(toDate.getTime());


		log.debug("Range Filter Builder :" + rangeFilterBuilder);
		//log.debug("Range Filter Builder :" + rangeQueryBuilder);
		/*searchRequestBuilder.setQuery("\"query\" : { \"filtered\" : { \"query\" : { \"query_string\" : { \"query\" : \"*julia*\" } }, \"filter\" : { "or" : {
          "filters" : [ {
            "range" : {
              "last_update" : {
                "from" : "2015-09-01T03:30:00.000Z",
                "to" : "2015-09-08T03:30:00.000Z",
                "time_zone" : "+5:30",
                "include_lower" : true,
                "include_upper" : true
              }
            }
          } ]
        }
      }
    }
  }
} ")
*/		searchRequestBuilder.setQuery(QueryBuilders.filteredQuery(queryBuilder, FilterBuilders.orFilter(rangeFilterBuilder))).addHighlightedField("");
		log.debug("Search Request Builder :" + searchRequestBuilder);
		//searchRequestBuilder.setQuery(rangeQueryBuilder);
		response = searchRequestBuilder.setSearchType(SearchType.QUERY_AND_FETCH).execute().actionGet();
		/*} else {
		log.debug("Inside the else clause");
		response = client.prepareSearch("actors").setTypes("actor").setQuery(QueryBuilders.queryStringQuery("*" + searchTerm + "*"))
					.setSearchType(SearchType.QUERY_AND_FETCH)
					.addSort("actor_id", SortOrder.ASC)
					.setSize(1000)
					.execute().actionGet();
		response = client.prepareSearch().setIndices().setTypes().setQuery(QueryBuilders.queryStringQuery("*" + searchTerm + "*"))
				.setSearchType(SearchType.QUERY_AND_FETCH)
				//.addSort("actor_id", SortOrder.ASC)
				//.setSize(1000)
				.execute().actionGet();
	}*/

		/*SearchResponse response1 = client.prepareSearch("blog").setTypes("post").setQuery(searchTerm)
				.setSearchType(SearchType.QUERY_AND_FETCH)
				.execute().actionGet();*/
		//log.debug("Raw Search String Query" + response1.toString());

		SearchHits hits = response.getHits();
		List<Map<String, Object>> searchResultPosts = new ArrayList<Map<String, Object>>();
		//Post post = null;
		for (SearchHit hit : hits) {
			log.debug("------------------------------");
			Map<String, Object> result = hit.getSource();
			log.debug("Each Search Hit :" + result);
			//post = new Post((String) result.get("user"), (String) result.get("title"), (String) result.get("postDate"), (String)result.get("body"));
			//searchResultPosts.add(post.toString());
			//searchResultPosts.add("|- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -|");
			searchResultPosts.add(result);
			//log.debug(post);
		}

		log.debug("Response from Elasticsearch" + response.toString());
		/*if(searchField != null) {
			map.put("selectedActorField", searchField);
		}*/
		map.put("searchTerm", searchTerm);
		map.put("results", searchResultPosts);
		map.put("noOfHits", hits.getTotalHits());
		map.put("searchFromDate", searchFromDate);
		map.put("searchToDate", searchToDate);
		return "home";
	}
	
	/*@RequestMapping(value="marketinginfluencedrevenue.go", method=RequestMethod.GET)
	public String marketingInfluencedRevenue() {
		// Query elasticsearch server and get the data for the graphs
		return "marketingInfluencedRevenue";
	}*/
}
