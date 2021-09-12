import java.util.Scanner;

public class BreakfastBuffet {

    public static void main (String[]args)
    {
        //Variable for menu options
        int opt;

        //Variables for subtotal, total and tax.
        double subTotal, total;
        double tax = 0.07;

        //Variables for item prices.
        double bagelPrice = 1.00;
        double butterPrice = 0.50;
        double creamCheesePrice = 1.00;
        double eggsPrice = 2.75;
        double baconPrice = 2.25;

        //Variables for counter.
        int bagelCount = 0;
        int totalbagelcount = 0;
        int butterCount = 0;
        int totalbuttercount = 0;
        int creamCheeseCount = 0;
        int totalcreamcheesecount = 0;
        int eggsCount = 0;
        int totaleggscount = 0;
        int baconCount = 0;
        int totalbaconcount = 0;

        //Scanner to input options.
        Scanner scannerObj = new Scanner(System.in);

        //Welcome Message
        System.out.println("Welcome to Tina's Breakfast Buffet!");

        //Display the menu items.
        do {
            //System.out.println("Welcome to Tina's Breakfast Buffet!");
            System.out.println("  ");
            System.out.println("Please select from the following menu: " +
                    "\n 1) Bagel            $1.00" +
                    "\n 2) Butter           $0.50" +
                    "\n 3) Cream Cheese     $1.00" +
                    "\n 4) Eggs             $2.75" +
                    "\n 5) Bacon            $2.25" +
                    "\n 6) Exit");
            System.out.println("Please enter your selection here: ");
            opt = scannerObj.nextInt();

            //If the user selects an option outside of 1-6
            if (opt < 1 || opt > 6) {
                System.out.println("That is an invalid option. Please select options 1-6 from the menu.");
            }

            //When user selects options from 1-6
            if (opt == 1) {
                //counter.
                totalbagelcount += bagelCount+1;

                System.out.println("You selected bagel. You currently have " + totalbagelcount +
                        " bagel at this time.");
            }

            if (opt == 2) {
                //counter.
                totalbuttercount += butterCount+1;

                System.out.println("You selected butter. You currently have " + totalbuttercount +
                        " butter at this time.");
            }
            if (opt == 3) {
                //counter.
                totalcreamcheesecount += creamCheeseCount+1;

                System.out.println("You selected cream cheese. You currently have " + totalcreamcheesecount +
                        " cream cheese at this time." );
            }
            if (opt == 4) {
                //counter.
                totaleggscount += eggsCount+1;

                System.out.println("You selected eggs. You currently have " + totaleggscount + " eggs at this time.");
            }
            if (opt == 5) {
                //counter.
                totalbaconcount += baconCount+1;

                System.out.println("You selected bacon. You currently have " + totalbaconcount + " bacon at this time.");
            }
            //Will close the tab and calculate the costs.
            if (opt == 6) {
                //calculations for each items subtotals
                double bagelSubtotal = totalbagelcount * bagelPrice;
                double butterSubtotal = totalbuttercount * butterPrice;
                double creamcheeseSubtotal = totalcreamcheesecount * creamCheesePrice;
                double eggsSubtotal = totaleggscount * eggsPrice;
                double baconSubtotal = totalbaconcount * baconPrice;

                //Subtotal for all items
                subTotal = bagelSubtotal + butterSubtotal + creamcheeseSubtotal + eggsSubtotal + baconSubtotal;

                //Tax
                tax = subTotal * tax;

                //The total of all costs.
                total = subTotal + tax;

                //What will show on the receipt
                System.out.println("Item " + "       " + "Quantity " + "       "  + "Total ");
                System.out.println("--------------------------------------- ");
                System.out.printf("Bagel " + "         " + totalbagelcount + "              $"   + "%.2f\n", bagelSubtotal);
                System.out.printf("Butter " + "        " + totalbuttercount + "              $" + "%.2f\n", butterSubtotal);
                System.out.printf("Cream Cheese " + "  " + totalcreamcheesecount + "              $" + "%.2f\n", creamcheeseSubtotal);
                System.out.printf("Eggs " + "          " + totaleggscount + "              $" + "%.2f\n", eggsSubtotal);
                System.out.printf("Bacon " + "         " + totalbaconcount + "              $" + "%.2f\n", baconSubtotal);
                System.out.printf("Bagel " + "         " + totalbagelcount + "              $" + "%.2f\n", bagelSubtotal);
                System.out.printf("       Subtotal: " + "             $" + "%.2f\n", subTotal);
                System.out.printf("       Tax: " + "                  $" + "%.2f\n", tax);
                System.out.printf("       Total: " + "                $" + "%.2f\n", total);
                System.out.println(" ");
                System.out.println("Thank you for Shopping at Tina's Breakfast Buffet!");
            }

        }
        while (opt!=6);


    }
}
