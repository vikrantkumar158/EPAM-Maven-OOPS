package com.vikrantkumar158;

import com.vikrantkumar158.gift.Gift;

public class App 
{
    public static void main( String[] args )
    {
        Gift g  = new Gift();
        System.out.println("Welcome to Gift Center. Now you can add chocolates and sweets to your basket.");
        g.addToBasket();
        g.displayItems();
        g.displayChocolate();
        g.displaySweets();
    }
}
