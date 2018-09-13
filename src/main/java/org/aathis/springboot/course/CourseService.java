package org.aathis.springboot.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course topic) {
		courseRepository.save(topic);
	}
	
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	
	
	public void deleteCourse(String id) {
		courseRepository.delete(id);
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
