package se.mwthinker.cppgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {
		se.mwthinker.openapi.api.PackagesApiController.class,
		se.mwthinker.cppgenerator.service.PackagesApiDelegateImpl.class} )
@SpringBootApplication
public class CppGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CppGeneratorApplication.class);
		//app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		app.run(args);
	}

}
