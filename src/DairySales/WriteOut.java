package DairySales;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * WriteOut class will be in charge of writing out to a csv file
 * 
 * @author Chaipakon Luangprasert
 * @version August 2019
 */
public class WriteOut {

    private String fileName;
    private int numberOfDays;
    private Storage sto;
    private double[] sums;


    /**
     * constructor
     * 
     * @param fName
     *            String that will be use as a output file name
     */
    public WriteOut(String fName, int days, Storage st, double[] ss) {
        fileName = fName;
        numberOfDays = days;
        sto = st;
        sums = ss;
    }


    /**
     * will write out to a csv file!
     * 
     * @throws FileNotFoundException
     */
    public void writeToCSV() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(fileName, true);
        PrintWriter pw = new PrintWriter(fos);

        // kind of dumb but it will be really annoying hard without it
        if (numberOfDays == 1) {
            pw.println("DESCRIPTION, DATE, TOTAL");
            pw.println();
            pw.println("CASH AT START OF DAY, 100, 100");
            pw.println("SALES(1)");
            pw.println("SALES(2)," + sto.access(0, 0) + "," + sums[0]); // Sales2
            pw.println("SALES(3)");
            pw.println("SALES(4)");
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("SALES TAX," + sto.access(1, 0) + "," + sums[1]); // SalesTax
            pw.println("TOTAL SALES," + sto.access(2, 0) + "," + sums[2]); // Total
                                                                           // Sales
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("TOTAL TO BE ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sums[3]); // Total to be
            pw.println("MDSE.(1)");
            pw.println("MDSE.(2)");
            pw.println("MDSE.(3)");
            pw.println();
            pw.println("REFUND/RETURNS");
            pw.println("ADVERTISING");
            pw.println("CAR AND DELIVERY");
            pw.println("FREIGHT-POSTAGE");
            pw.println("LAUNDRY-LINEN");
            pw.println("OFFICE EXPENSE");
            pw.println("OPERATING SUPPLIES");
            pw.println("REPAIRS AND MAINTENANCE");
            pw.println("TRAVEL-ENTERTAINMENT");
            pw.println("PERSONAL DRAWING");
            pw.println("NET WAGES");
            pw.println();
            pw.println("TOTAL PAYOUT");
            pw.println("BANK DEPOSIT (CASH)," + sto.access(4, 0) + ","
                + sums[4]); // total cash
            pw.println("BANK DEPOSIT (CR.CARDS)," + sto.access(5, 0) + ","
                + sums[5]); // total credit
            pw.println("BANK DEPOSIT");
            pw.println("CLOSING CASH, 100, 100");
            pw.println("TOTAL CASH ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sums[3]); // total to be
            pw.println("OVER OR SHORT");
            pw.close();
        }
        else if (numberOfDays == 2) {
            pw.println("DESCRIPTION, DATE, DATE, TOTAL"); // add Date
            pw.println();
            pw.println("CASH AT START OF DAY, 100, 100, 200"); // add 100 and
                                                               // total
            pw.println("SALES(1)");
            pw.println("SALES(2)," + sto.access(0, 0) + "," + sto.access(0, 1)
                + "," + sums[0]); // Sales2
            pw.println("SALES(3)");
            pw.println("SALES(4)");
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("SALES TAX," + sto.access(1, 0) + "," + sto.access(1, 1)
                + "," + sums[1]); // SalesTax
            pw.println("TOTAL SALES," + sto.access(2, 0) + "," + sto.access(2,
                1) + "," + sums[2]); // Total
            // Sales
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("TOTAL TO BE ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sto.access(3, 1) + "," + sums[3]); // Total to be
            pw.println("MDSE.(1)");
            pw.println("MDSE.(2)");
            pw.println("MDSE.(3)");
            pw.println();
            pw.println("REFUND/RETURNS");
            pw.println("ADVERTISING");
            pw.println("CAR AND DELIVERY");
            pw.println("FREIGHT-POSTAGE");
            pw.println("LAUNDRY-LINEN");
            pw.println("OFFICE EXPENSE");
            pw.println("OPERATING SUPPLIES");
            pw.println("REPAIRS AND MAINTENANCE");
            pw.println("TRAVEL-ENTERTAINMENT");
            pw.println("PERSONAL DRAWING");
            pw.println("NET WAGES");
            pw.println();
            pw.println("TOTAL PAYOUT");
            pw.println("BANK DEPOSIT (CASH)," + sto.access(4, 0) + "," + sto
                .access(4, 1) + "," + sums[4]); // total cash
            pw.println("BANK DEPOSIT (CR.CARDS)," + sto.access(5, 0) + "," + sto
                .access(5, 1) + "," + sums[5]); // total credit
            pw.println("BANK DEPOSIT");
            pw.println("CLOSING CASH, 100, 100, 200"); // add 100 and total
            pw.println("TOTAL CASH ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sto.access(3, 1) + "," + sums[3]); // total to be
            pw.println("OVER OR SHORT");
            pw.close();
        }
        else if (numberOfDays == 3) {
            pw.println("DESCRIPTION, DATE, DATE, DATE, TOTAL"); // add Date
            pw.println();
            pw.println("CASH AT START OF DAY, 100, 100, 100, 300"); // add 100
                                                                    // and total
            pw.println("SALES(1)");
            pw.println("SALES(2)," + sto.access(0, 0) + "," + sto.access(0, 1)
                + "," + sto.access(0, 2) + "," + sums[0]); // Sales2
            pw.println("SALES(3)");
            pw.println("SALES(4)");
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("SALES TAX," + sto.access(1, 0) + "," + sto.access(1, 1)
                + "," + sto.access(1, 2) + "," + sums[1]); // SalesTax
            pw.println("TOTAL SALES," + sto.access(2, 0) + "," + sto.access(2,
                1) + "," + sto.access(2, 2) + "," + sums[2]); // Total
            // Sales
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("TOTAL TO BE ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sto.access(3, 1) + "," + sto.access(3, 2) + "," + sums[3]); // Total
                                                                              // to
                                                                              // be
            pw.println("MDSE.(1)");
            pw.println("MDSE.(2)");
            pw.println("MDSE.(3)");
            pw.println();
            pw.println("REFUND/RETURNS");
            pw.println("ADVERTISING");
            pw.println("CAR AND DELIVERY");
            pw.println("FREIGHT-POSTAGE");
            pw.println("LAUNDRY-LINEN");
            pw.println("OFFICE EXPENSE");
            pw.println("OPERATING SUPPLIES");
            pw.println("REPAIRS AND MAINTENANCE");
            pw.println("TRAVEL-ENTERTAINMENT");
            pw.println("PERSONAL DRAWING");
            pw.println("NET WAGES");
            pw.println();
            pw.println("TOTAL PAYOUT");
            pw.println("BANK DEPOSIT (CASH)," + sto.access(4, 0) + "," + sto
                .access(4, 1) + "," + sto.access(4, 2) + "," + sums[4]); // total
                                                                         // cash
            pw.println("BANK DEPOSIT (CR.CARDS)," + sto.access(5, 0) + "," + sto
                .access(5, 1) + "," + sto.access(5, 2) + "," + sums[5]); // total
                                                                         // credit
            pw.println("BANK DEPOSIT");
            pw.println("CLOSING CASH, 100, 100, 100, 300"); // add 100 and total
            pw.println("TOTAL CASH ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sto.access(3, 1) + "," + sto.access(3, 2) + "," + sums[3]); // total
                                                                              // to
                                                                              // be
            pw.println("OVER OR SHORT");
            pw.close();
        }
        else if (numberOfDays == 4) {
            pw.println("DESCRIPTION, DATE, DATE, DATE, DATE, TOTAL"); // add
                                                                      // Date
            pw.println();
            pw.println("CASH AT START OF DAY, 100, 100, 100, 100, 400"); // add
                                                                         // 100
                                                                         // and
                                                                         // total
            pw.println("SALES(1)");
            pw.println("SALES(2)," + sto.access(0, 0) + "," + sto.access(0, 1)
                + "," + sto.access(0, 2) + "," + sto.access(0, 3) + ","
                + sums[0]); // Sales2
            pw.println("SALES(3)");
            pw.println("SALES(4)");
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("SALES TAX," + sto.access(1, 0) + "," + sto.access(1, 1)
                + "," + sto.access(1, 2) + "," + sto.access(1, 3) + ","
                + sums[1]); // SalesTax
            pw.println("TOTAL SALES," + sto.access(2, 0) + "," + sto.access(2,
                1) + "," + sto.access(2, 2) + "," + sto.access(2, 3) + ","
                + sums[2]); // Total
            // Sales
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("TOTAL TO BE ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sto.access(3, 1) + "," + sto.access(3, 2) + "," + sto.access(
                    3, 3) + "," + sums[3]); // Total to be
            pw.println("MDSE.(1)");
            pw.println("MDSE.(2)");
            pw.println("MDSE.(3)");
            pw.println();
            pw.println("REFUND/RETURNS");
            pw.println("ADVERTISING");
            pw.println("CAR AND DELIVERY");
            pw.println("FREIGHT-POSTAGE");
            pw.println("LAUNDRY-LINEN");
            pw.println("OFFICE EXPENSE");
            pw.println("OPERATING SUPPLIES");
            pw.println("REPAIRS AND MAINTENANCE");
            pw.println("TRAVEL-ENTERTAINMENT");
            pw.println("PERSONAL DRAWING");
            pw.println("NET WAGES");
            pw.println();
            pw.println("TOTAL PAYOUT");
            pw.println("BANK DEPOSIT (CASH)," + sto.access(4, 0) + "," + sto
                .access(4, 1) + "," + sto.access(4, 2) + "," + sto.access(4, 3)
                + "," + sums[4]); // total cash
            pw.println("BANK DEPOSIT (CR.CARDS)," + sto.access(5, 0) + "," + sto
                .access(5, 1) + "," + sto.access(5, 2) + "," + sto.access(5, 3)
                + "," + sums[5]); // total credit
            pw.println("BANK DEPOSIT");
            pw.println("CLOSING CASH, 100, 100, 100, 100, 400"); // add 100 and
                                                                 // total
            pw.println("TOTAL CASH ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sto.access(3, 1) + "," + sto.access(3, 2) + "," + sto.access(
                    3, 3) + "," + sums[3]); // total to be
            pw.println("OVER OR SHORT");
            pw.close();
        }
        else if (numberOfDays == 5) {
            pw.println("DESCRIPTION, DATE, DATE, DATE, DATE, DATE, TOTAL"); // add
                                                                            // Date
            pw.println();
            pw.println("CASH AT START OF DAY, 100, 100, 100, 100, 100, 500"); // add
                                                                              // 100
                                                                              // and
                                                                              // total
            pw.println("SALES(1)");
            pw.println("SALES(2)," + sto.access(0, 0) + "," + sto.access(0, 1)
                + "," + sto.access(0, 2) + "," + sto.access(0, 3) + "," + sto
                    .access(0, 4) + "," + sums[0]); // Sales2
            pw.println("SALES(3)");
            pw.println("SALES(4)");
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("SALES TAX," + sto.access(1, 0) + "," + sto.access(1, 1)
                + "," + sto.access(1, 2) + "," + sto.access(1, 3) + "," + sto
                    .access(1, 4) + "," + sums[1]); // SalesTax
            pw.println("TOTAL SALES," + sto.access(2, 0) + "," + sto.access(2,
                1) + "," + sto.access(2, 2) + "," + sto.access(2, 3) + "," + sto
                    .access(2, 4) + "," + sums[2]); // Total
            // Sales
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("TOTAL TO BE ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sto.access(3, 1) + "," + sto.access(3, 2) + "," + sto.access(
                    3, 3) + "," + sto.access(3, 4) + "," + sums[3]); // Total to
                                                                     // be
            pw.println("MDSE.(1)");
            pw.println("MDSE.(2)");
            pw.println("MDSE.(3)");
            pw.println();
            pw.println("REFUND/RETURNS");
            pw.println("ADVERTISING");
            pw.println("CAR AND DELIVERY");
            pw.println("FREIGHT-POSTAGE");
            pw.println("LAUNDRY-LINEN");
            pw.println("OFFICE EXPENSE");
            pw.println("OPERATING SUPPLIES");
            pw.println("REPAIRS AND MAINTENANCE");
            pw.println("TRAVEL-ENTERTAINMENT");
            pw.println("PERSONAL DRAWING");
            pw.println("NET WAGES");
            pw.println();
            pw.println("TOTAL PAYOUT");
            pw.println("BANK DEPOSIT (CASH)," + sto.access(4, 0) + "," + sto
                .access(4, 1) + "," + sto.access(4, 2) + "," + sto.access(4, 3)
                + "," + sto.access(4, 4) + "," + sums[4]); // total cash
            pw.println("BANK DEPOSIT (CR.CARDS)," + sto.access(5, 0) + "," + sto
                .access(5, 1) + "," + sto.access(5, 2) + "," + sto.access(5, 3)
                + "," + sto.access(5, 4) + "," + sums[5]); // total credit
            pw.println("BANK DEPOSIT");
            pw.println("CLOSING CASH, 100, 100, 100, 100, 100, 500"); // add 100
                                                                      // and
                                                                      // total
            pw.println("TOTAL CASH ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sto.access(3, 1) + "," + sto.access(3, 2) + "," + sto.access(
                    3, 3) + "," + sto.access(3, 4) + "," + sums[3]); // total to
                                                                     // be
            pw.println("OVER OR SHORT");
            pw.close();
        }
        else if (numberOfDays == 6) {
            pw.println(
                "DESCRIPTION, DATE, DATE, DATE, DATE, DATE, DATE, TOTAL"); // add
                                                                           // Date
            pw.println();
            pw.println(
                "CASH AT START OF DAY, 100, 100, 100, 100, 100, 100, 600"); // add
                                                                            // 100
                                                                            // and
                                                                            // total
            pw.println("SALES(1)");
            pw.println("SALES(2)," + sto.access(0, 0) + "," + sto.access(0, 1)
                + "," + sto.access(0, 2) + "," + sto.access(0, 3) + "," + sto
                    .access(0, 4) + "," + sto.access(0, 5) + "," + sums[0]); // Sales2
            pw.println("SALES(3)");
            pw.println("SALES(4)");
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("SALES TAX," + sto.access(1, 0) + "," + sto.access(1, 1)
                + "," + sto.access(1, 2) + "," + sto.access(1, 3) + "," + sto
                    .access(1, 4) + "," + sto.access(1, 5) + "," + sums[1]); // SalesTax
            pw.println("TOTAL SALES," + sto.access(2, 0) + "," + sto.access(2,
                1) + "," + sto.access(2, 2) + "," + sto.access(2, 3) + "," + sto
                    .access(2, 4) + "," + sto.access(2, 5) + "," + sums[2]); // Total
            // Sales
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println();
            pw.println("TOTAL TO BE ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sto.access(3, 1) + "," + sto.access(3, 2) + "," + sto.access(
                    3, 3) + "," + sto.access(3, 4) + "," + sto.access(3, 5)
                + "," + sums[3]); // Total to be
            pw.println("MDSE.(1)");
            pw.println("MDSE.(2)");
            pw.println("MDSE.(3)");
            pw.println();
            pw.println("REFUND/RETURNS");
            pw.println("ADVERTISING");
            pw.println("CAR AND DELIVERY");
            pw.println("FREIGHT-POSTAGE");
            pw.println("LAUNDRY-LINEN");
            pw.println("OFFICE EXPENSE");
            pw.println("OPERATING SUPPLIES");
            pw.println("REPAIRS AND MAINTENANCE");
            pw.println("TRAVEL-ENTERTAINMENT");
            pw.println("PERSONAL DRAWING");
            pw.println("NET WAGES");
            pw.println();
            pw.println("TOTAL PAYOUT");
            pw.println("BANK DEPOSIT (CASH)," + sto.access(4, 0) + "," + sto
                .access(4, 1) + "," + sto.access(4, 2) + "," + sto.access(4, 3)
                + "," + sto.access(4, 4) + "," + sto.access(4, 5) + ","
                + sums[4]); // total cash
            pw.println("BANK DEPOSIT (CR.CARDS)," + sto.access(5, 0) + "," + sto
                .access(5, 1) + "," + sto.access(5, 2) + "," + sto.access(5, 3)
                + "," + sto.access(5, 4) + "," + sto.access(5, 5) + ","
                + sums[5]); // total credit
            pw.println("BANK DEPOSIT");
            pw.println("CLOSING CASH, 100, 100, 100, 100, 100, 100, 600"); // add
                                                                           // 100
                                                                           // and
                                                                           // total
            pw.println("TOTAL CASH ACCOUNTED FOR," + sto.access(3, 0) + ","
                + sto.access(3, 1) + "," + sto.access(3, 2) + "," + sto.access(
                    3, 3) + "," + sto.access(3, 4) + "," + sto.access(3, 5)
                + "," + sums[3]); // total to be
            pw.println("OVER OR SHORT");
            pw.close();
        }

    }

}
