import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tcode.repository.CustomerRepository;
import com.tcode.repository.HibernateCustomerRepositoryImpl;
import com.tcode.service.CustomerService;
import com.tcode.service.CustomerServiceIml;

@Configuration
@ComponentScan({"com.tcode"})
public class AppConfig {
		
	//@Bean(name= "customerService") possible to wire the beans using the stereotype annotation @Service on the impl class
	//public CustomerService getCustomerService() {
		
		//CustomerServiceIml service = new CustomerServiceIml();
		//service.setCustomerRepository(getCustomerRepository());
		//return service;
		//To make constructor injection:
		
		//CustomerServiceIml service = new CustomerServiceIml(getCustomerRepository());
		//return service;
		//To make Setter Injection:
		//CustomerServiceIml service = new CustomerServiceIml();
		//service.setCustomerRepository(getCustomerRepository());
		//return service;
	//}
//	------------------------------------------------------------------------
	//@Bean (name= "customerRepository") another alternative is, we can use stereotype annotation(@Repository, @Service)
	
	//public CustomerRepository getCustomerRepository() {
		
	//	return new HibernateCustomerRepositoryImpl();
		
	//}
}
