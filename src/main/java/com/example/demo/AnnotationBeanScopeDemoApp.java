package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach assistantCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == assistantCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach:       " + theCoach);
		System.out.println("\nMemory location for assistantCoach: " + assistantCoach);
				
		// close the context
		context.close();

	}

}
