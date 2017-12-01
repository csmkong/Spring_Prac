package com.spring.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);
		MyInfo myInfo = ctx.getBean("myInfo",MyInfo.class);
		/*myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
		*/
		//myInfo.bmiCalculation();
		myInfo.getInfo();
		
		
		StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);
		studentInfo.getStudentInfo();
		Student student2 = ctx.getBean("student2",Student.class);
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
		
		Pencil pencil = ctx.getBean("pencil",Pencil.class);
		pencil.use();
		
		ctx.close();
	}

}
