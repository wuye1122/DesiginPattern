package com.wuye.observer;


//主题的具体 就是主题是什么 具体化
public class ConcreteSubject extends Subject {
private String SubjectNot;

public String getSubjectNot() {
	return SubjectNot;
}

public void setSubjectNot(String subjectNot) {
	SubjectNot = subjectNot;
}

	
	
}
