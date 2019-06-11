package hu.autsoft.hwsw.spring.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	public DiscountService discountService() {
		return new DefaultDiscountService();
	}
}
