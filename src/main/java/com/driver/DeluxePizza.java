package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese();
        addExtraToppings();
        //another way using super keyword
        super.addExtraCheese();
        super.addExtraToppings();
        //using this keyword
        this.addExtraCheese();
        this.addExtraToppings();
    }
}
