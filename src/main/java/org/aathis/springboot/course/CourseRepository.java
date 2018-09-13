package org.aathis.springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	//All the crud operations are inherited...
	
	//Spring Data will implement automatically these methods, if declared as FindByPROPERTYNAME
	public List<Course> findByName(String name);
	public List<Course> findByDescription(String desc);
	public List<Course> findByTopicId(String topicId);

}
