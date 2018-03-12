package org.pankaj.learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory; // Depricated. Don't use this way.
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DrawingApp {

	public static void main(String[] args) {
		System.out.println("This is the main class executing now .... ");
//		Resource resource = new ClassPathResource("employee.xml");
//		BeanFactory factory = new XmlBeanFactory(resource); // Deprecated Way !!!
		ApplicationContext context = new ClassPathXmlApplicationContext("shapeConfig.xml");
		
//		Circle c = (Circle) context.getBean("circle"); // getBean() has an Object class return type. Casting required !!!
//		System.out.println("Type of cirlce:\n " + c.getType() + " circle of radius " + c.getRadius());
//		c.draw();
//		
		Triangle triangle = (Triangle) context.getBean("triangle-demo");
		triangle.draw();
		
	  
	}
}
