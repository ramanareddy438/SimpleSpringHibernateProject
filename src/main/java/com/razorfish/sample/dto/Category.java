package com.razorfish.sample.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category implements Serializable {
	
	/**
	 * Generated Serial Version UID
	 */
	private static final long serialVersionUID = 4667376412459230525L;

	@Id
	@Column(name="catid")
	@GeneratedValue
	private int catId;
	
	@Column(name="catgroup")
	private String catGroup;
	
	@Column(name="catname")
	private String catName;
	
	@Column(name="catdesc")
	private String catDesc;

	/**
	 * @return the catId
	 */
	public int getCatId() {
		return catId;
	}

	/**
	 * @param catId the catId to set
	 */
	public void setCatId(int catId) {
		this.catId = catId;
	}

	/**
	 * @return the catGroup
	 */
	public String getCatGroup() {
		return catGroup;
	}

	/**
	 * @param catGroup the catGroup to set
	 */
	public void setCatGroup(String catGroup) {
		this.catGroup = catGroup;
	}

	/**
	 * @return the catName
	 */
	public String getCatName() {
		return catName;
	}

	/**
	 * @param catName the catName to set
	 */
	public void setCatName(String catName) {
		this.catName = catName;
	}

	/**
	 * @return the catDesc
	 */
	public String getCatDesc() {
		return catDesc;
	}

	/**
	 * @param catDesc the catDesc to set
	 */
	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}
}
