/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsanta;

/**
 *
 * @author Cristina Butler
 */

import java.util.Scanner;
import java.util.HashMap;

public class SecretSanta{  
    public static void main(String[] args) {
        int i = 0;
        Scanner s = new Scanner(System.in);
       
        System.out.println("SECRET SANTA MATCH GENERATOR");
        System.out.println("WASSAPENIN?");
        System.out.println("This program generates your secret santa matches and if you do it right you won't get your spouse or significant other as your Secret Santa.");
        System.out.println();
        System.out.println("Directions: First count the total number of people that will participate.");
        System.out.println("How many did you count?");
        int numberOfPeople = s.nextInt();
    
        System.out.println("Now you will enter names. Follow the prompts");
        System.out.println();
        //System.out.println("Example: Cristina types - Cristina, ENTER, Richard, ENTER");
        //System.out.println("Example: Richard types - Richard, ENTER, Cristina, ENTER");  
        //System.out.println("Example: Natalie has no boyfriend so she types - Nati, ENTER, ENTER");  

       
        HashMap <String, String> secretSantaMap = new HashMap<String, String>();
        String name = s.nextLine();

        while (i < numberOfPeople){ 
             System.out.println("Your name");
            String santa = s.nextLine(); //takes input and saves into key
            i++; 
            System.out.println("Your significant other's name. If you are single hit enter twice after your name.");
            String spouse = s.nextLine(); //takes input and saves into value
            secretSantaMap.put(santa, spouse); //adds key & value to hashmap called secretSantaMap
            System.out.println("Thank you. Now let the next person go unless you are last");
        }
            System.out.println("");            
            System.out.println("We're done adding names? Cool!");            
            System.out.println("Here is your list of participants and their significant others");
            System.out.println(secretSantaMap);
            System.out.println("Now let me prepare the list!");

    }    
  }
  

   