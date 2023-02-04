public class Main {
    public static void main(String[] args) {

        double totalCost;


        System.out.println("What was the cost for Summer? "); // Asking the user what the cost was
        double summerCost = 250.12; //User would then have an input statement asking for that cost
        System.out.println("What was the cost for Spring? ");
        double springCost = 150.63;
        System.out.println("What was the cost for Fall? ");
        double fallCost = 50.78;
        System.out.println("What was the cost for Winter? ");
        int winterCost = 300;

        totalCost = summerCost + springCost + fallCost + winterCost; //Total cost added up

        System.out.print("This is the total maintenance cost for the year " + totalCost); // Informs user of total cost

    }
}