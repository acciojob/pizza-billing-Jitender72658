package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int totalAmt =0;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isBagAdded;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) this.price = 300;
        else this.price = 400;
    }

    public int getPrice(){
        if(isVeg){
            price = 300;
        }
        else{
            price = 400;
        }
        return this.price;
    }

    public void addExtraCheese(){
        isCheeseAdded = true;
    }

    public void addExtraToppings(){
        isToppingAdded = true;
    }

    public void addTakeaway(){
        isBagAdded = true;
    }

    public String getBill(){
        // your code goes here
        if(isVeg) {
            System.out.println("Base Price Of The Pizza: "+this.price);
            totalAmt+=300;
            if(isCheeseAdded){
                System.out.println("Extra Cheese Added: "+80);
               totalAmt+= 80;
            }
            if(isToppingAdded){
                totalAmt+= 70;
                System.out.println("Extra Toppings Added: "+70);
            }
        }
        else {
            System.out.println("Base Price Of The Pizza: "+this.price);
            totalAmt+=400;
            if(isCheeseAdded){
                System.out.println("Extra Cheese Added: "+80);
                totalAmt+= 80;
            }
            if(isToppingAdded){
                totalAmt+= 70;
                System.out.println("Extra Toppings Added: "+120);
            }

        }
        if(isBagAdded){
            totalAmt+=20;
            System.out.println("Paperbag Added: "+20);
        }
        return "Total Price: "+totalAmt;
    }
}
