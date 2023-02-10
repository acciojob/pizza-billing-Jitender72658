package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheeseCount;
    private int toppingCount;
    private int bagCount;


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
        cheeseCount++;
    }

    public void addExtraToppings(){
            toppingCount++;
    }

    public void addTakeaway(){
        bagCount++;
    }

    public String getBill(){
        // your code goes here
        if(isVeg) {
            System.out.println("Veg pizza base price = "+this.price);
            bill="300";
            if(cheeseCount>0){
                System.out.println("Extra Cheese Added: "+80*cheeseCount);
                bill = String.valueOf((Integer.parseInt(bill) + 80*cheeseCount));
            }
            if(toppingCount>0){
                bill = String.valueOf((Integer.parseInt(bill) + 70*toppingCount));
                System.out.println("Extra Toppings Added: "+70*toppingCount);
            }
        }
        else {
            System.out.println("Non-veg pizza base price = "+this.price);
            bill="400";
            if(cheeseCount>0){
                System.out.println("Extra Cheese Added: "+80*cheeseCount);
                bill = String.valueOf((Integer.parseInt(bill) + 80));
            }
            if(toppingCount>0){
                bill = String.valueOf((Integer.parseInt(bill) + 120*toppingCount));
                System.out.println("Extra Toppings Added: "+120*toppingCount);
            }
        }
        if(bagCount>0){
            bill = String.valueOf((Integer.parseInt(bill) + 20*bagCount));
            System.out.println("Paperbag Added: "+20*bagCount);
        }
        return "Total Price: "+this.bill;
    }
}
