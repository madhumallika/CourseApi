package io.bootexamples.springbootstarter.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TopicController {
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topic")
	public List<Topic> getTopics() {
		
		 return topicservice.getTopics();
	}
	 //public String getTopic(String id) {
		 
		 //return topicservice.get
	 //}
	 
	@RequestMapping(value = "/course", method = RequestMethod.POST)
	
	 public String addCourse(String course)
	 {
		return "Hello  "+course;
		
	 }

}
