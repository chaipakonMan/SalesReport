package DairySales;

/**
 * Calculation class will be in charge of calculating stuff of each day
 * 
 * @author Chaipakon Luangprasert
 * @version August 2019
 */
public class Calculation {

    private double sales2;

    private double salesTax;
    private double totalSales;

    private double totalToBeAcc;

    private double cash;
    private double credit;


    /**
     * constructor
     * 
     * @param totalSal
     *            total sales amount
     * @param credi
     *            total credit amount
     */
    public Calculation(double totalSal, double credi) {
        totalSales = totalSal;
        credit = credi;
    }


    /**
     * will do all the calculation and put it into each field
     */
    public void initiailization() {
        sales2 = totalSales / 1.108;
        salesTax = sales2 * 0.108;
        totalToBeAcc = totalSales + 100;
        cash = totalSales - credit;
    }


// Getter and Setter

    public double getSales2() {
        return sales2;
    }


    public double getSalesTax() {
        return salesTax;
    }


    public double getTotalSales() {
        return totalSales;
    }


    public double getTotalToBeAcc() {
        return totalToBeAcc;
    }


    public double getCash() {
        return cash;
    }


    public double getCredit() {
        return credit;
    }

}
