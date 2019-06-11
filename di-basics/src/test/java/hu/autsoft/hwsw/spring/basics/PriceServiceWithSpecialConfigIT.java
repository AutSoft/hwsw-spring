package hu.autsoft.hwsw.spring.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import hu.autsoft.hwsw.spring.basics.PriceServiceWithSpecialConfigIT.TestConfig;

@SpringJUnitConfig(classes = TestConfig.class)
public class PriceServiceWithSpecialConfigIT {
	
	@Autowired
	PriceService priceService;
	
	@Import(AppConfig.class)
	public static class TestConfig{
		@Bean
		public DiscountService discountService() {
			return new SpecialDiscountService();
		}
	}

	@Test
	void testGetFinalPriceWithSpecialDiscount() throws Exception {
		assertEquals(90, priceService.getFinalPrice(100));
		assertEquals(85000, priceService.getFinalPrice(100000));
	}
}
