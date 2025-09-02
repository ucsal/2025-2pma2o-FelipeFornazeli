/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.mariojp.solid.ocp;

import java.util.stream.Stream;

public interface DiscountPolicy{
    boolean appliesTo(CustomerType custumerType);

    double apply(double amount);
}

