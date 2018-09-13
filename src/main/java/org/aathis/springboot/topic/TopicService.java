package org.aathis.springboot.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	private static List<Topic> topics = new ArrayList<Topic>();

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {

		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		// topics.add(topic);
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}
	
	
	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}
	
	/*
	 * public void updateTopic(Topic topic, String id) { for (int i = 0; i <
	 * topics.size(); i++) { Topic t = topics.get(i); if (t.getId().equals(id)) {
	 * topics.set(i, topic); return; } } }
	 * 
	 * public void deleteTopic(String id) {
	 * System.out.println("inside delete size:"+topics.size()); for (int i =
	 * topics.size()-1; i >= 0; i--) { Topic t = topics.get(i);
	 * System.out.println("inside delete id:"+t.getId()); if (t.getId().equals(id))
	 * { System.out.println("removed id : "+id); topics.remove(i); return; } }
	 * 
	 * }
	 */

}
