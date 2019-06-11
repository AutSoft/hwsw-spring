package hu.autsoft.hwsw.spring.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = AppConfig.class)
public class PriceServiceWithDefaultConfigIT {
	
	@Autowired
	PriceService priceService;

	@Test
	void testGetFinalPriceWithDefaultDiscount() throws Exception {
		assertEquals(90, priceService.getFinalPrice(100));
		assertEquals(90000, priceService.getFinalPrice(100000));
	}
}
