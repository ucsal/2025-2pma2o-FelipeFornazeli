package br.com.mariojp.solid.ocp;

import java.util.List;
import java.util.logging.Filter;

public class DiscountCalculator {
    private final List<DiscountPolicy> policies;

    public DiscountCalculator(List<DiscountPolicy> policies){
        this.policies = policies;

    }
    public double apply(double amount, CustomerType type){
        return policies.stream()
        .filter(policy -> policy.appliesTo(type))
        .findFirst()
        .map(policy -> policy.apply(amount))
        .orElse(amount);
    }

}
