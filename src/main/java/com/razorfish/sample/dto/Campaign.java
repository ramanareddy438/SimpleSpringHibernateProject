package com.razorfish.sample.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="campaign")
public class Campaign implements Serializable {
	
	/**
	 * Generated Serial Version UID
	 */
	private static final long serialVersionUID = -6521811735604225430L;

	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="expected_revenue")
	private String expectedRevenue;
	
	@Column(name="budgeted_cost")
	private String budgetedCost;
	
	@Column(name="actual_cost")
	private String actualCost;
	
	@Column(name="expected_response")
	private double expectedResponse;
	
	@Column(name="number_sent")
	private double numberSent;
	
	@Column(name="number_of_leads")
	private int nummberOfLeads;
	
	@Column(name="number_of_converted_leads")
	private int numberOfConvertedLeads;
	
	@Column(name="amount_all_oportunities")
	private String amountAllOpportunites;
	
	@Column(name="amount_won_opportunities ")
	private String amountWonOpportunities;
	
	@Column(name="campaign_member_recordtypeid")
	private String campaignMemberRecordTypeId;
	
	@Column(name="user_or_groupid")
	private String userOfGroupId;
	
	@Column(name="campaign_access_level")
	private String campaignAccessLevel;
	
	@Column(name="label")
	private String label;
	
	@Column(name="is_default")
	private boolean isDefault;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the expectedRevenue
	 */
	public String getExpectedRevenue() {
		return expectedRevenue;
	}

	/**
	 * @param expectedRevenue the expectedRevenue to set
	 */
	public void setExpectedRevenue(String expectedRevenue) {
		this.expectedRevenue = expectedRevenue;
	}

	/**
	 * @return the budgetedCost
	 */
	public String getBudgetedCost() {
		return budgetedCost;
	}

	/**
	 * @param budgetedCost the budgetedCost to set
	 */
	public void setBudgetedCost(String budgetedCost) {
		this.budgetedCost = budgetedCost;
	}

	/**
	 * @return the actualCost
	 */
	public String getActualCost() {
		return actualCost;
	}

	/**
	 * @param actualCost the actualCost to set
	 */
	public void setActualCost(String actualCost) {
		this.actualCost = actualCost;
	}

	/**
	 * @return the expectedResponse
	 */
	public double getExpectedResponse() {
		return expectedResponse;
	}

	/**
	 * @param expectedResponse the expectedResponse to set
	 */
	public void setExpectedResponse(double expectedResponse) {
		this.expectedResponse = expectedResponse;
	}

	/**
	 * @return the numberSpent
	 */
	public double getNumberSent() {
		return numberSent;
	}

	/**
	 * @param numberSpent the numberSpent to set
	 */
	public void setNumberSent(double numberSent) {
		this.numberSent = numberSent;
	}

	/**
	 * @return the nummberOfLeads
	 */
	public int getNummberOfLeads() {
		return nummberOfLeads;
	}

	/**
	 * @param nummberOfLeads the nummberOfLeads to set
	 */
	public void setNummberOfLeads(int nummberOfLeads) {
		this.nummberOfLeads = nummberOfLeads;
	}

	/**
	 * @return the numberOfConvertedLeads
	 */
	public int getNumberOfConvertedLeads() {
		return numberOfConvertedLeads;
	}

	/**
	 * @param numberOfConvertedLeads the numberOfConvertedLeads to set
	 */
	public void setNumberOfConvertedLeads(int numberOfConvertedLeads) {
		this.numberOfConvertedLeads = numberOfConvertedLeads;
	}

	/**
	 * @return the amountAllOpportunites
	 */
	public String getAmountAllOpportunites() {
		return amountAllOpportunites;
	}

	/**
	 * @param amountAllOpportunites the amountAllOpportunites to set
	 */
	public void setAmountAllOpportunites(String amountAllOpportunites) {
		this.amountAllOpportunites = amountAllOpportunites;
	}

	/**
	 * @return the amountWonOpportunities
	 */
	public String getAmountWonOpportunities() {
		return amountWonOpportunities;
	}

	/**
	 * @param amountWonOpportunities the amountWonOpportunities to set
	 */
	public void setAmountWonOpportunities(String amountWonOpportunities) {
		this.amountWonOpportunities = amountWonOpportunities;
	}

	/**
	 * @return the campaignMemberRecordTypeId
	 */
	public String getCampaignMemberRecordTypeId() {
		return campaignMemberRecordTypeId;
	}

	/**
	 * @param campaignMemberRecordTypeId the campaignMemberRecordTypeId to set
	 */
	public void setCampaignMemberRecordTypeId(String campaignMemberRecordTypeId) {
		this.campaignMemberRecordTypeId = campaignMemberRecordTypeId;
	}

	/**
	 * @return the userOfGroupId
	 */
	public String getUserOfGroupId() {
		return userOfGroupId;
	}

	/**
	 * @param userOfGroupId the userOfGroupId to set
	 */
	public void setUserOfGroupId(String userOfGroupId) {
		this.userOfGroupId = userOfGroupId;
	}

	/**
	 * @return the campaignAccessLevel
	 */
	public String getCampaignAccessLevel() {
		return campaignAccessLevel;
	}

	/**
	 * @param campaignAccessLevel the campaignAccessLevel to set
	 */
	public void setCampaignAccessLevel(String campaignAccessLevel) {
		this.campaignAccessLevel = campaignAccessLevel;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the isDefault
	 */
	public boolean isDefault() {
		return isDefault;
	}

	/**
	 * @param isDefault the isDefault to set
	 */
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
}
