package com.driver;

public class Pizza {

    private  int price;// different for veg and nonvage
    private  final int cheesePrice = 80; // same for both veg and noveg piza
    private  int extratoppings ;
    private final int takeAway = 20;
    private Boolean isVeg;
    private  int total;
    private boolean ischeeseAdded;
    private boolean istoppingsAdded;
    private boolean istakeawayAdded;
//    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price = 300;
            extratoppings = 70;
            total = 300;
        }else{
            price = 400;
            extratoppings = 120;
            total = 400;
        }
        // your code goes here
    }

    public int getPrice(){
        return total;
    }

    public void addExtraCheese(){
        if(ischeeseAdded == false){
            total += cheesePrice;
            ischeeseAdded = true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        // your code goes here
        if(istoppingsAdded == false){
            total += extratoppings;
            istoppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeawayAdded == false){
            total += takeAway;
            istakeawayAdded = true;
        }
    }

    public String getBill(){
        String bill="Base Price Of The Pizza: " + price + "\n";
        if(ischeeseAdded){
            bill=bill+"Extra Cheese Added: "+cheesePrice+" \n";
        }
        if(istoppingsAdded){
            bill=bill+"Extra Toppings Added: "+extratoppings+"\n";
        }
        if(istakeawayAdded){
            bill = bill + "Paper Bag Added: " +takeAway +"\n";
        }
        bill=bill+"Total Price: "+total +"\n";
        return bill;
    }
}
