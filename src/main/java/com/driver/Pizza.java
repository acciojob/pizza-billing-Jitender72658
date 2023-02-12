package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int cheesePrice;
    private int toppingPrice;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isBagAdded;
    private String bill = "";
    private  boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
            this.price = 300;
            this.toppingPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingPrice = 120;
        }
        this.cheesePrice = 80;
       bill += "Base Price Of The Pizza: "+this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded) {
            price+=this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingAdded){
            price+=this.toppingPrice;
            isToppingAdded= true;
        }
    }

    public void addTakeaway(){
        if(!isBagAdded) {
            price+=20;
            isBagAdded = true;
        }
    }

    public String getBill(){
          if(!isBillGenerated) {
              if (isCheeseAdded) {
                  this.bill += "Extra Cheese Added: " + this.cheesePrice + "\n";
              }
              if (isToppingAdded) {
                  this.bill += "Extra Toppings Added: " + this.toppingPrice + "\n";
              }
              if (isBagAdded) {
                  this.bill += "Paperbag Added: " + 20 + "\n";
              }
              this.bill += "Total Price: " + this.price + "\n";
              isBillGenerated = true;
          }
        return this.bill;
    }
}
