package com.razorfish.sample.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketingInfluencedRevenueController {
	private Logger log = LogManager.getLogger(MarketingInfluencedRevenueController.class);
	
	@RequestMapping(value="marketinginfluencedrevenue.go", method=RequestMethod.GET)
	public @ResponseBody Map<Object, Object> marketingInfluencedRevenue(HttpServletRequest request, HttpServletResponse response) {
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		Map<Object, Object> rootObject = new LinkedHashMap<Object, Object>();
		rootObject.put("gridType", "DefaultGrid");
		
		
		Map<Object, Object> dataObject = new LinkedHashMap<Object, Object>();
		String[] categories = new String[] {"1 month", "1 quarter", "2 quarters", "3 quarters", "One year", "1+ years"};
		dataObject.put("categories", categories);
		Object[] listArray = new Object[4];
		
		
		//Map<String, Object> listArray = new LinkedHashMap<String, Object>();
		Map<Object, Object> eachListObj = new LinkedHashMap<Object, Object>();
		long[] brtWonArray = new long[] {2500000000l, 2500000000l, 2500000000l, 2500000000l, 2500000000l, 2500000000l};
		
		eachListObj.put("name", "Business Revenue Target");
		eachListObj.put("won", brtWonArray);
		listArray[0] = eachListObj;
		
		long[] mirWonArray = new long[] {2500000000l, 2500000000l, 2500000000l, 2500000000l, 2500000000l, 2500000000l};
		eachListObj = new LinkedHashMap<Object, Object>();
		
		eachListObj.put("name", "Marketing Influenced Revenue Target");
		eachListObj.put("won", mirWonArray);
		listArray[1] = eachListObj;
		
		/*jsonObj.accumulate("name", "MiRi Revenue Target");
		wonArray.put(2500000000l);
		wonArray.put(2500000000l);
		wonArray.put(2500000000l);
		wonArray.put(2500000000l);
		wonArray.put(2500000000l);
		wonArray.put(2500000000l);
		jsonObj.accumulate("won", wonArray);
		listArray.put(jsonObj);*/
		
		long[] miriRevenueAchievedArray = {0, 595500l, 3086000l, 31670000l, 54461390l, 91891090l};
		eachListObj = new LinkedHashMap<Object, Object>();
		
		eachListObj.put("name", "MiRi Revenue Achieved");
		eachListObj.put("won", miriRevenueAchievedArray);
		listArray[2] = eachListObj;
		
		
		long[] miriRevenuePredictedArray = {160366420l, 160366420l, 160366420l, 160366420l, 160366420l, 160366420l};
		eachListObj = new LinkedHashMap<Object, Object>();
		
		eachListObj.put("name", "MiRi Revenue Predicted");
		eachListObj.put("won", miriRevenuePredictedArray);
		listArray[3] = eachListObj;
		
		
		dataObject.put("list", listArray);
		Map<String, long[][]> targets = new LinkedHashMap<String, long[][]>();
		
		for(int i = 0; i < categories.length; i++) {
			long[][] target = new long[][] {{brtWonArray[i], mirWonArray[i]}, {miriRevenueAchievedArray[i], miriRevenuePredictedArray[i]}};
			targets.put(categories[i], target);
		}
		dataObject.put("targets", targets);
		
		rootObject.put("data", dataObject);
		log.debug(rootObject);
		
		return rootObject;
	}
	
	@SuppressWarnings("resource")
	@RequestMapping(value="marketingspendroi.go", method=RequestMethod.GET)
	public Map<String, Object> marketingSpendROI() {
		Client client = new TransportClient().addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
		
		SearchResponse searchResponse = client.prepareSearch().setIndices("phaladata").setTypes("campaign").setSearchType(SearchType.QUERY_AND_FETCH)
				.execute().actionGet();
		SearchHits hits = searchResponse.getHits();
		
		String[] categories1 = new String[10];
		for(SearchHit hit : hits) {
			System.out.println(hit.getSource());
		}
		
		
		Map<String, Object> rootObject = new LinkedHashMap<String, Object>();
		rootObject.put("gridType", "DefaultGrid");
		
		
		Map<String, Object> dataObject = new LinkedHashMap<String, Object>();
		String[] categories = new String[] {"MiRi Analytic Platform Launch - NYC", "G5K Reach Out Campaign", "G5K World Tour", "Go get em SFDC AppEx",
			      "Land and Expand AWS/AZURE- Online",
			      "Outcomes that Matter"};
		dataObject.put("categories", categories);
		Object[] listArray = new Object[4];
		
		
		//Map<String, Object> listArray = new LinkedHashMap<String, Object>();
		Map<String, Object> eachListObj = new LinkedHashMap<String, Object>();
		long[] brtWonArray = new long[] {2500000000l, 2500000000l, 2500000000l, 2500000000l, 2500000000l, 2500000000l};
		
		eachListObj.put("name", "Business Revenue Target");
		eachListObj.put("won", brtWonArray);
		listArray[0] = eachListObj;
		
		long[] mirWonArray = new long[] {2500000000l, 2500000000l, 2500000000l, 2500000000l, 2500000000l, 2500000000l};
		eachListObj = new LinkedHashMap<String, Object>();
		
		eachListObj.put("name", "Marketing Influenced Revenue Target");
		eachListObj.put("won", mirWonArray);
		listArray[1] = eachListObj;
		
		/*jsonObj.accumulate("name", "MiRi Revenue Target");
		wonArray.put(2500000000l);
		wonArray.put(2500000000l);
		wonArray.put(2500000000l);
		wonArray.put(2500000000l);
		wonArray.put(2500000000l);
		wonArray.put(2500000000l);
		jsonObj.accumulate("won", wonArray);
		listArray.put(jsonObj);*/
		
		long[] miriRevenueAchievedArray = {0, 595500l, 3086000l, 31670000l, 54461390l, 91891090l};
		eachListObj = new LinkedHashMap<String, Object>();
		
		eachListObj.put("name", "MiRi Revenue Achieved");
		eachListObj.put("won", miriRevenueAchievedArray);
		listArray[2] = eachListObj;
		
		
		long[] miriRevenuePredictedArray = {160366420l, 160366420l, 160366420l, 160366420l, 160366420l, 160366420l};
		eachListObj = new LinkedHashMap<String, Object>();
		
		eachListObj.put("name", "MiRi Revenue Predicted");
		eachListObj.put("won", miriRevenuePredictedArray);
		listArray[3] = eachListObj;
		
		
		dataObject.put("list", listArray);
		Map<String, long[][]> targets = new LinkedHashMap<String, long[][]>();
		
		for(int i = 0; i < categories.length; i++) {
			long[][] target = new long[][] {{brtWonArray[i], mirWonArray[i]}, {miriRevenueAchievedArray[i], miriRevenuePredictedArray[i]}};
			targets.put(categories[i], target);
		}
		dataObject.put("targets", targets);
		
		rootObject.put("data", dataObject);
		log.debug(rootObject);
		
		return rootObject;
	}
}
