
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 0786954
 */
public class PaintJob {

    public static void main(String[] args) {

        //Variables
        double gallonOfPaint;
        double hoursOfLabor;
        double costOfPaint;
        double laborCharges;
        double totalCostofJob;

        //user input
        gallonOfPaint = getGallons();
        System.out.println(gallonOfPaint);
        hoursOfLabor = getLabor(gallonOfPaint);
        System.out.println("Hours of Labor" + hoursOfLabor);
        costOfPaint = getCostOfPaint(gallonOfPaint);
        System.out.println("Cost of paint" + costOfPaint);

        //Ending display help
        laborCharges = getLaborCharges(hoursOfLabor);
        totalCostofJob = calculateTotalCost(laborCharges, costOfPaint);
        displayResults(laborCharges, costOfPaint, totalCostofJob,
                gallonOfPaint, hoursOfLabor);
    }

    public static double getGallons() {

        //calculation set up
        double squareFeet = 115;
        double numberOfRooms;
        double wallSpace;
        double sumWall = 0.0;
        double gallonsNeeded;

        //make inputs
        String input1;
        String input2; 

        //finding out how many rooms and space
        input1 = JOptionPane.showInputDialog("Please enter the number of rooms to be painted .");
        numberOfRooms = Double.parseDouble(input1);
        for (int i = 1; i <= numberOfRooms; i++) {
            input2 = JOptionPane.showInputDialog("Please enter the wall space for room number " + i);
            wallSpace = Double.parseDouble(input2);
            sumWall += wallSpace;
        }
        gallonsNeeded = (sumWall / squareFeet);
        System.out.println("Gallons " + gallonsNeeded);
        return gallonsNeeded;
    }

    //Labor input
    public static double getLabor(double gallonsNeeded) {
        double laborHours = (gallonsNeeded * 8);
        System.out.println("Labor hours" + laborHours);
        return laborHours;
    }

    //Gallon price input
    public static double getCostOfPaint(double gallonsNeeded) {
        String input;
        double paintPrice;
        input = JOptionPane.showInputDialog("Please enter the price per gallon of paint .");
        paintPrice = Double.parseDouble(input);
        double spentOnPaint = gallonsNeeded * paintPrice;
        System.out.println(gallonsNeeded * paintPrice);
        return spentOnPaint;
    }

    //Labor Charges calculation
    public static double getLaborCharges(double laborHours) {
        double money = ((laborHours * 18));
        System.out.println("Labor" + money);
        return money;
    }

    //Calculate total
    public static double calculateTotalCost(double money, double spentOnPaint) {
        double totalAmount = (money + spentOnPaint);
        System.out.println("Total" + totalAmount);
        return totalAmount;
    }

    //Displaying
    public static void displayResults(double laborCharges, double costOfPaint,
            double totalCostofJob, double gallonOfPaint, double hoursOfLabor) {
        DecimalFormat formatter = new DecimalFormat("$0.00");
        DecimalFormat notMoney = new DecimalFormat("#0.0");
        JOptionPane.showMessageDialog(null, "Amount of gallons required: "
                + notMoney.format(gallonOfPaint) + "\n"
                + "Hours of labor : " + notMoney.format(hoursOfLabor) + "\n"
                + "The cost of paint: "
                + formatter.format(costOfPaint) + "\n" + "The cost of labor: "
                + formatter.format(laborCharges) + "\n"
                + "Total cost: "
                + formatter.format(totalCostofJob));
    }
}
