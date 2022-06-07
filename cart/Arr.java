package cart;

public class Arr {
    public static void main(String[] args) {
        System.out.println("Array");
        for(int idx = 0; idx <args.length; idx++){
            System.out.println("idx = " + idx);
            System.out.println("value = " + args[idx]);            
        }
    
        for (String valString : args){
            System.out.println("value = " + args );
        }
    }

    

    
}