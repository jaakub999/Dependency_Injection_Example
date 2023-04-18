package com.di;

import com.di.container.constructor.Car;
import com.di.container.interf.Computer;
import com.di.container.setter.Phone;
import com.di.framework.config.AppConfig;
import com.di.framework.user.UserService;
import com.di.manual.AdminRepository;
import com.di.manual.AdminService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final Car car;
	private final Phone phone;
	private final Computer computer;

	public DemoApplication(Car car, Phone phone, Computer computer) {
		this.car = car;
		this.phone = phone;
		this.computer = computer;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Container DI
		//Constructor Injection
		car.start();

		//Setter Injection
		//phone.plugIn();

		//Interface Injection
		//computer.start();

		//Framework DI
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//UserService userService = context.getBean(UserService.class);
		//userService.logIn();

		//Manual DI
		//AdminService adminService = new AdminService(new AdminRepository());
		//adminService.kick();
	}
}
