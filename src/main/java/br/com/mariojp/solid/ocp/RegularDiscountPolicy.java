package br.com.mariojp.solid.ocp;

public class RegularDiscountPolicy implements DiscountPolicy{
    @Override
    public boolean appliesTo( CustomerType customerType){
        return  customerType == CustomerType.REGULAR;
    }
    @Override
    public double apply(double amount){
        return amount * 0.95;
    }
    
}
