package hu.autsoft.hwsw.spring.basics;

import org.springframework.stereotype.Component;

@Component
public class SpecialDiscountService implements DiscountService {

	@Override
	public int getDiscountPercent(int totalPrice) {
		return totalPrice > 10000 ? 15 : 10;
	}
}
