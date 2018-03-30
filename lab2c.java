/*
     Written by: Matt Cobb
     Chapter 2
     Assignment 2c
     Lab 2-1
 */
package lab2;
    import java.util.Scanner;
    import java.text.DecimalFormat;

/**
Job Calc Program
 
14% tax
After 10% clothes
1% to buy school supplies
25% bonds
.50 / $1 on bonds bought

Output:
Income before & after taxes
Money spent on clothes and accessories
Money spent on school supplies
Money spent on savings bonds
Money parents spent on bonds 
 
 */


public class lab2c {
    
    public static void main(String[] args) {
        
        // Setup const
                final double JTAXA = .14;
                final double JCLOTHES = .1;
                final double JSUPPLIES =.01;
                final double JBONDS = .25;
        
        Scanner console = new Scanner(System.in);
        
        
        
        // Setup vars
        double jEarned, jTax, jBond, jAddBonds;
        
        System.out.println("*** Financial Calc ***\n");
            
        
            // Calculate remaning funds after each reduction
            System.out.println("Amount earned: ");
            jEarned = console.nextInt();
            
            jTax = jEarned * JTAXA;
            System.out.println("\n Tax (14%) : $" + jTax);
            
            jEarned = jEarned-jTax;
            System.out.println("\n Funds after tax: $" + jEarned);
            
            jTax =  jEarned * JCLOTHES;
            jEarned = jEarned - jTax;
            System.out.println("\n Funds after clothes and accesories (-$" + jTax +"): $" + jEarned);
            
            jTax =  jEarned * JSUPPLIES;
            jEarned = jEarned - jTax;
            System.out.println("\n Funds after buying school supplies (-$" + jTax +"): $" + jEarned);
            
            jTax =  jEarned * JBONDS;
            jEarned = jEarned - jTax;
            jEarned = Math.round(jEarned*100.0)/100.0;
            System.out.println("\n Funds after buying saving bonds (-$" + jTax +"): $" + jEarned);
            
            jBond = jTax * .5;
            jAddBonds = jTax + jBond;
            jAddBonds = Math.round(jAddBonds*100.0)/100.0;
            System.out.println(" Additional bond funds from parents: " + jAddBonds);
            
            
             
    }
}
