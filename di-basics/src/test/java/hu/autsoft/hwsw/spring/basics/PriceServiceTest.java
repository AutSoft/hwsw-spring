package hu.autsoft.hwsw.spring.basics;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PriceServiceTest {

	@InjectMocks
	PriceService priceService;
	
	@Mock
	DiscountService discountService;
	
//	@BeforeEach
//	public void init() {
//		MockitoAnnotations.initMocks(this);
//	}
	
	@Test
	void testGetFinalPrice() throws Exception {
		when(discountService.getDiscountPercent(anyInt())).thenReturn(5);
		assertEquals(95, priceService.getFinalPrice(100));
		
		when(discountService.getDiscountPercent(anyInt())).thenReturn(10);
		assertEquals(90, priceService.getFinalPrice(100));
	}
}
