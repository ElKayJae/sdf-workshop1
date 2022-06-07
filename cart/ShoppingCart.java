package cart;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("Welcome to your shopping cart!");

        // instantiate list
        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        String input;
        int delIndex;
        boolean stop = false;

        cart.add("apple");
        cart.add("orange");
        cart.add("pear");
        
        // main loop
        while(!stop){
            // read input from console
            input = cons.readLine("> ");
            System.out.println("READ: " + input);

            //split input into terms and put into string array
            String[] terms = input.split(" ");

            // command is the first word of input
            String cmd = terms[0];

            switch (cmd){
                case "add":

                    String fruitStr = terms[1];
                    String fruitsReplaced = fruitStr.replace(",", " ");
                    String[] fruits = fruitsReplaced.split(" ");

                        for(int i=0; i < fruits.length; i++){
                            boolean found = false;
                            for(int j=0; j<cart.size(); j++){
                                if(fruits[i].equals(cart.get(j))){
                                    found = true;
                                    break;
                                }
                            }
                        if (!found){
                            cart.add(fruits[i]);
                            System.out.println(fruits[i] + " is added to cart");

                        }
                    }
                    break;

                case "list":
                    if(cart.size()>0){
                        for (int i=0; i < cart.size(); i++){
                            System.out.println(i+1+" " + cart.get(i));
                        }
                    } else {
                            System.out.println("Your cart is empty!");
                        }

                        break;

                    case "del":
                        if (terms.length <2){
                            System.out.println("Please provide an index in order to delete");
                        }else{
                            try {
                            // index is number on list -1
                            // terms[1] 2nd word after the word del
                            delIndex = Integer.parseInt(terms[1]) -1;
                            System.out.println(delIndex);
                            if (delIndex >= 0 && delIndex<cart.size()){ 
                                System.out.println("Deleted " + cart.get(delIndex)+ " from cart");
                                cart.remove(delIndex);
                            }else{
                                showNoSuchItemToDel();
                            }
                        }catch(NumberFormatException e){
                            showNoSuchItemToDel();
                        }
                           
                        }
                        break;
                    case "end":
                            stop = true;
                            break;
                    default:
                    System.out.println("Invalid Command");
                    }
                 
            }
            System.out.println("Thank you for shopping with us");   
        }
private static void showNoSuchItemToDel(){
    System.out.println("No such item to delete");
    
}
    }
