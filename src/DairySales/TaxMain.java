package DairySales;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * TaxMain class is this whole program driver. Calls and uses objects and
 * methods from other classes
 * 
 * @author Chaipakon Luangprasert
 * @version August 2019
 */
public class TaxMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Week's Number: (ex. 1  2  3  4  5)"); // to help out
                                                                  // the
                                                                  // override
                                                                  // output csv
                                                                  // file
        int weekNum = scan.nextInt();

        System.out.println("Number of Days: "); // to help pick out the correct
                                                // method of printing
        int dayNum = scan.nextInt();

        // a storage that hold data (calculated data)
        Storage storage = new Storage(dayNum);
        // variable to hold a sum of each row for the week
        double sumSal2 = 0;
        double sumSalT = 0;
        double sumTota = 0;
        double sumTobe = 0;
        double sumCash = 0;
        double sumCred = 0;
        double beginEnd = 100 * dayNum; // might delete later if not ness

        // calculate the input for each day and store it in the storage!
        int dayss = 1;
        for (int col = 0; col < dayNum; col++) { // vertical

            System.out.println("Day" + dayss + " total money: "); // for
                                                                  // calculation
            double totalMoney = scan.nextDouble();

            System.out.println("Day" + dayss + " total credit: "); // for
                                                                   // calculation
            double credit = scan.nextDouble();

            // TODO calculate
            Calculation cal = new Calculation(totalMoney, credit);
            cal.initiailization();
            /*
             * System.out.println("");
             * System.out.println("Sales2: " + cal.getSales2());
             * System.out.println("SalesTax: " + cal.getSalesTax());
             * System.out.println("TotalSales: " + cal.getTotalSales());
             * System.out.println("TotalToBeACC: " + cal.getTotalToBeAcc());
             * System.out.println("Cash: " + cal.getCash());
             * System.out.println("Credit: " + cal.getCredit());
             * System.out.println("");
             */

            // sum the total of each row for the week
            sumSal2 = sumSal2 + cal.getSales2();
            sumSalT = sumSalT + cal.getSalesTax();
            sumTota = sumTota + cal.getTotalSales();
            sumTobe = sumTobe + cal.getTotalToBeAcc();
            sumCash = sumCash + cal.getCash();
            sumCred = sumCred + cal.getCredit();
            /*
             * System.out.println(sumSal2);
             * System.out.println(sumSalT);
             * System.out.println(sumTota);
             * System.out.println(sumTobe);
             * System.out.println(sumCash);
             * System.out.println(sumCred);
             * System.out.println(beginEnd);
             */

            // TODO put it into the storage
            storage.insert(0, col, cal.getSales2());
            storage.insert(1, col, cal.getSalesTax());
            storage.insert(2, col, cal.getTotalSales());
            storage.insert(3, col, cal.getTotalToBeAcc());
            storage.insert(4, col, cal.getCash());
            storage.insert(5, col, cal.getCredit());
            /*
             * System.out.println("Value(R0): "+ storage.access(0, 0));
             * System.out.println("Value(R1): "+ storage.access(1, 0));
             * System.out.println("Value(R2): "+ storage.access(2, 0));
             * System.out.println("Value(R3): "+ storage.access(3, 0));
             * System.out.println("Value(R4): "+ storage.access(4, 0));
             * System.out.println("Value(R5): "+ storage.access(5, 0));
             */
            dayss++;
            System.out.println("");
        }

        double[] arr = { sumSal2, sumSalT, sumTota, sumTobe, sumCash, sumCred,
            beginEnd };

        String fileName = ""; // To initialize name of a file CORRECTLY

        if (weekNum == 1) {
            fileName = "week1.csv";
        }
        else if (weekNum == 2) {
            fileName = "week2.csv";
        }
        else if (weekNum == 3) {
            fileName = "week3.csv";
        }
        else if (weekNum == 4) {
            fileName = "week4.csv";
        }
        else if (weekNum == 5) {
            fileName = "week5.csv";
        }
        else {
            System.out.println("ERROR: 1");
        }

        WriteOut wo = new WriteOut(fileName, dayNum, storage, arr);
        try {
            wo.writeToCSV();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("CSV File Success");
    }

}
