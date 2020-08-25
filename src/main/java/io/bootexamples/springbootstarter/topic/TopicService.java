package io.bootexamples.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	public List<Topic> topics=Arrays.asList(new Topic("java",1.8,"core java"),
            new Topic("Spring",4.0,"Spring framework"),
            new Topic("webservices",1.3,"webservices"));
	
	
	public List<Topic> getTopics() {
		 return topics;
	}
	public Topic getTopic(String course) {
		return  topics.stream().filter(t -> t.getCourse().equals(course)).findFirst().get();
	}
	
}
