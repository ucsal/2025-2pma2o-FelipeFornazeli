package br.com.mariojp.solid.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class DiscountCalculatorTest {
    @Test
    void partner_gets_12_percent() {
        List<DiscountPolicy> policies = List.of(
            new RegularDiscountPolicy(),
            new PremiumDiscountPolicy(),
            new PartnerDiscountPolicy()
        );
        var calc =new DiscountCalculator(policies);

        assertEquals(88.0, calc.apply(100.0, CustomerType.PARTNER), 0.0001,

        "PARTNER deveria ter 12% de desconto");
    }
}
