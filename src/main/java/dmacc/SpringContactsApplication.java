package dmacc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import dmacc.beans.Dog;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ContactRepository;


@SpringBootApplication
public class SpringContactsApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringContactsApplication.class, args);
		
		
	
	 }
	@Autowired
	ContactRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Dog d = new Dog("Spot","German Shepard",50296,true);
		Dog c = new Dog("Ruff","Shiba Inu",50160,false);
		repo.save(d);
		repo.save(c);
		List<Dog> allMyDogs = repo.findAll();
		for(Dog dogs : allMyDogs) {
			System.out.println(dogs.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
	
}
