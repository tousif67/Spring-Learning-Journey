package com.user.service;

import com.user.model.Student;

public interface IGreetings {
	String generateWish(String name);
	Boolean addStudent(Student st);

}
