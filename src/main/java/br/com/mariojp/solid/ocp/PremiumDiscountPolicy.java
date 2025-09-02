package br.com.mariojp.solid.ocp;

public class PremiumDiscountPolicy implements DiscountPolicy  {
    @Override
    
    public boolean appliesTo(CustomerType customerType){
        return customerType == CustomerType.PREMIUM;

    }

    public double  apply(double amount){
        return amount * 0.90;
    }
}
