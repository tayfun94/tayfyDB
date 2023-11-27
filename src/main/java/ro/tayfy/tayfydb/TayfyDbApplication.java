package ro.tayfy.tayfydb;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TayfyDbApplication {
	public static ApplicationContext appContext;
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(TayfyDbApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		appContext = springApplication.run(args);

		//UsersDAO usersDAO = appContext.getBean(UsersDAO.class);
		//usersDAO.createPerson();
	}

}
