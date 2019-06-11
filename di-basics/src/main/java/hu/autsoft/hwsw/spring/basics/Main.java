package hu.autsoft.hwsw.spring.basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
			PriceService priceService = ctx.getBean(PriceService.class);
			System.out.println(priceService.getFinalPrice(1000));		
		}
	}
}
