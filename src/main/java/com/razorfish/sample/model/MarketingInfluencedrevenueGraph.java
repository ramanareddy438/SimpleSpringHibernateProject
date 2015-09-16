package com.razorfish.sample.model;

import java.io.Serializable;

public class MarketingInfluencedrevenueGraph implements Serializable {
	
	/**
	 * Default serial version UID
	 */
	private static final long serialVersionUID = 1L;
	private String gridType;
	private Data data;
	/**
	 * @return the gridType
	 */
	public String getGridType() {
		return gridType;
	}
	/**
	 * @param gridType the gridType to set
	 */
	public void setGridType(String gridType) {
		this.gridType = gridType;
	}
	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}
}

class Data {
	private String[] categories;
	private MarketingList[] list;

	/**
	 * @return the categories
	 */
	public String[] getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(String[] categories) {
		this.categories = categories;
	}
	/**
	 * @return the list
	 */
	public MarketingList[] getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(MarketingList[] list) {
		this.list = list;
	}
}

class MarketingList {
	private String name;
	private Won won;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the won
	 */
	public Won getWon() {
		return won;
	}
	/**
	 * @param won the won to set
	 */
	public void setWon(Won won) {
		this.won = won;
	}
}

class Won {
	private long[] sum;

	/**
	 * @return the sum
	 */
	public long[] getSum() {
		return sum;
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(long[] sum) {
		this.sum = sum;
	}
}