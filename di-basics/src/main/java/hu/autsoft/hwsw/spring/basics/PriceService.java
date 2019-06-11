package hu.autsoft.hwsw.spring.basics;

import org.springframework.stereotype.Component;

@Component
public class PriceService {

	DiscountService discountService;

	public PriceService(DiscountService discountService) {
		this.discountService = discountService;
	}
		
	public int getFinalPrice(int price) {
		return (int)(price/100.0*(100-discountService.getDiscountPercent(price)));
	}
	
}
