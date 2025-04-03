package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Kitchen;
import com.xworkz.Inheritence.internal.RestaurantKitchen;

public class KitchenRunner {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.cookFood();
        kitchen.washDishes();
        kitchen.storeIngredients();
        kitchen.useAppliances();
        kitchen.cleanKitchen();

        Kitchen kitchen1 = new RestaurantKitchen();
        kitchen1.cookFood();
        kitchen1.washDishes();
        kitchen1.storeIngredients();
        kitchen1.useAppliances();
        kitchen1.cleanKitchen();

        Kitchen kitchen2 = new RestaurantKitchen();
        kitchen2.cookFood();
        kitchen2.washDishes();
        kitchen2.storeIngredients();
        kitchen2.useAppliances();
        kitchen2.cleanKitchen();

        Kitchen kitchen3 = new RestaurantKitchen();
        kitchen3.cookFood();
        kitchen3.washDishes();
        kitchen3.storeIngredients();
        kitchen3.useAppliances();
        kitchen3.cleanKitchen();
    }
}