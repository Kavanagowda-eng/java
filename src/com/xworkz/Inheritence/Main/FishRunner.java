package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.Fish;
import com.xworkz.Inheritence.internal.Salmon;

public class FishRunner {
        public static void main(String[]args){
            Fish fish=new Fish();
            fish.eat();
            fish.cut();
            fish.purchase();
            fish.type();
            fish.dish();

            System.out.println("--------------------------------");

            Fish fish1=new Salmon();
            fish1.eat();
            fish1.cut();
            fish1.purchase();
            fish1.type();
            fish1.dish();

            System.out.println("--------------------------------");

            Salmon salmon=new Salmon();
            salmon.eat();
            salmon.cut();
            salmon.purchase();
            salmon.type();
            salmon.dish();

            System.out.println("--------------------------------");

        }

}
