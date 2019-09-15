package DairySales;

/**
 * Storage class will be in charge of holding all the calculated data of each
 * day
 * 
 * @author Chaipakon Luangprasert
 * @version August 2019
 */
public class Storage {

    public double[][] str;


    // constructor initialize the 2D array
    public Storage(int days) {
        str = new double[6][days];
    }


    /**
     * will insert data into the storage
     * 
     * @param r
     *            row
     * @param c
     *            column
     * @param value
     *            value of the data
     */
    public void insert(int r, int c, double value) {
        str[r][c] = value;
    }


    /**
     * will return the value at the given row and column
     * 
     * @param r
     *            row
     * @param c
     *            column
     * @return the value
     */
    public double access(int r, int c) {
        return str[r][c];
    }

}
