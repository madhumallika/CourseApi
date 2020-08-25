package io.bootexamples.springbootstarter.topic;

public class Topic {
	
	
	private String course;
	private Double version;
	private String description;

	
	public Topic(String course, Double version, String description) {
		super();
		this.course = course;
		this.version = version;
		this.description = description;
	}
	
	public Topic() {
	}
	

	public void setCourse(String course) {
		this.course = course;
	}
	public Double getVersion() {
		return version;
	}
	public void setVersion(Double version) {
		this.version = version;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getCourse() {
		return course;
	} 
	

}
