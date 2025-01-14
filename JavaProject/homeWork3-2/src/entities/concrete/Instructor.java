package entities.concrete;

import entities.abstracts.user;

public class Instructor extends user {
	private String category;
	private String[] camps;
	
	public Instructor() {
		super();
	}
	
	public Instructor(String category, String[] camps) {
		super();
		this.category = category;
		this.camps = camps;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String[] getCamps() {
		return camps;
	}

	public void setCamps(String[] camps) {
		this.camps = camps;
	}
}
