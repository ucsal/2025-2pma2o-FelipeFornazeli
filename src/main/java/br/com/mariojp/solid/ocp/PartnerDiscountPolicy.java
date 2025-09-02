package br.com.mariojp.solid.ocp;

public class PartnerDiscountPolicy implements DiscountPolicy {
    @Override
    public boolean appliesTo(CustomerType customerType){
        return CustomerType.PARTNER.equals(customerType);
    }
    @Override

    public double apply(double amount){
        return amount * 0.88;
    }
}
