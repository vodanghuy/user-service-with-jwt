package io.danghuy.userservice;

import io.danghuy.userservice.model.Role;
import io.danghuy.userservice.model.User;
import io.danghuy.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return  args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole((new Role(null, "ROLE_SUPER_ADMIN")));

			userService.saveUser(new User(null, "Dang Huy", "huy", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Dang Khoi", "khoi", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Dang Thinh", "thinh", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Thanh Toan", "toan", "1234", new ArrayList<>()));

			userService.addRoleToUser("huy", "ROLE_USER");
			userService.addRoleToUser("huy", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("khoi", "ROLE_USER");
			userService.addRoleToUser("thinh", "ROLE_USER");
			userService.addRoleToUser("thinh", "ROLE_USER");
			userService.addRoleToUser("toan", "ROLE_ADMIN");
			userService.addRoleToUser("toan", "ROLE_MANAGER");
		};
	}
	/*
		- @Bean - Spring se quan ly va tao ra bean nay

		- CommandLineRunner - la mot interface cua Spring Boot. Khi ung dung khoi dong xong,
		  Spring Boot se chay ham nay mot lan duy nhat.
	 */
}

