import br.com.mariojp.solid.ocp.*;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<DiscountPolicy> policies = List.of(
			new RegularDiscountPolicy(),
			new PremiumDiscountPolicy(),
			new PartnerDiscountPolicy()


		);
		
		DiscountCalculator calc = new DiscountCalculator(policies); 

		System.out.println ("REGULAR 100 ->" + calc.apply(100, CustomerType.REGULAR));
		System.out.println ("PREMIUM 100 ->" + calc.apply(100, CustomerType.PREMIUM));
		System.out.println ("PARTNER 100 ->" + calc.apply(100, CustomerType.PARTNER));
		
		

	}
}
