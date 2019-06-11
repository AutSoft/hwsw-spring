package hu.autsoft.hwsw.spring.basics;

import org.springframework.stereotype.Component;

@Component
public class DefaultDiscountService implements DiscountService {

	@Override
	public int getDiscountPercent(int totalPrice) {
		return 10;
	}
}
