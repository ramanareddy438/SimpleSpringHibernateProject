package com.razorfish.sample.model;

public class Post {
	private String user;
	private String title;
	private String postDate;
	private String body;
	
	public Post() {
		
	}
	
	public Post(String user, String title, String postDate, String body) {
		this.user = user;
		this.title = title;
		this.postDate = postDate;
		this.body = body;
	}
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the postDate
	 */
	public String getPostDate() {
		return postDate;
	}
	/**
	 * @param postDate the postDate to set
	 */
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return "[User :" + this.user + " - Title :" + this.title + " - Post Date :" + this.postDate + " - Body :" + this.body + "]";
	}
}
