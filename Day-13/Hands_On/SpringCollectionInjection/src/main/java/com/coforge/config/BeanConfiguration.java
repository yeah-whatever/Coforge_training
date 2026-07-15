package com.coforge.config;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Address;
import com.coforge.model.Student;

@Configuration
public class BeanConfiguration {
	@Bean
	public Address address(){
		return new Address("City-1","State-1");
	}
	@Bean
	public Student student(){
		List<String> subjects=Arrays.asList("Java","Spring Core","Hibernate","MySQL","React");
		
		Set<String> skills=new HashSet<>();
		skills.add("Communication");
		skills.add("Problem Solving");
		skills.add("Team Work");
		skills.add("Java");
		
		Map<String,Integer> marks=new HashMap<>();
		marks.put("Java", 95);
		marks.put("Spring", 90);
		marks.put("Hibernate", 88);
		marks.put("MySQL", 92);
		marks.put("React",85);
		
		return new Student(101,"Rahul Sharma",address(),subjects,skills,marks);
		
	}
}
