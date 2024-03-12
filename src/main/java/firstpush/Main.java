package firstpush;

public class Main {
    public static void main(String[] args) {
        String Product = "Rice";
        int quantity = 20;
        double ricePrice = 5.0;
        double distance = 17;

        int fee1 = 2;
        int fee2 = 5;
        int fee3 = 10;
        int fee4 = 15;



        if (distance <= 4) {
            System.out.println(fee1 +ricePrice + quantity);

        }else if (distance <= 15) {
            System.out.println(fee2 + ricePrice * quantity);
        }if (distance <= 25) {
            System.out.println(fee3 + ricePrice * quantity);
        }else if (distance > 26) {
            System.out.println(fee4 + ricePrice * quantity);
        }




            // int age = 31;
            //
            //        if (age > 18) {
            //            System.out.println("You can party with us at YearUP");
            //        } else if (age == 18) {
            //            System.out.println("Can also party with us");
            //        }else{
            //            System.out.println("Too young to party");




    } // end method
} // end class
