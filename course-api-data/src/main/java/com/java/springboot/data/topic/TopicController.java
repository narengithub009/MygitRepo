package com.java.springboot.data.topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		System.out.println(topicService);
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		System.out.println(topicService);
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public String updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		
		topicService.updateTopic(id,topic);
		return "Topic has been updated successfully";
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		
		topicService.deleteTopic(id);
	}
}
