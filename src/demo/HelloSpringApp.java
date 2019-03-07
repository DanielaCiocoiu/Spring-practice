package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {


	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		Coach theCoach1 = context.getBean("myBaseballCoach", Coach.class);
		Coach theCoach2 = context.getBean("myTrackCoach", Coach.class);
		FortuneService theFortuneService = context.getBean("myFortuneService", demo.FortuneService.class);
		
		// call methosd on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
