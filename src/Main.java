import java.util.List;

/**
 * Main
 */
public class Main {

    /**
     * Main method
     *
     * @param args Command line arguments
     * */
    public static void main(String[] args) {

        // List of integers for happy path scenario
        List<Integer> list = List.of(5, 5, 5, 10, 20);

        // List of integers for false path scenario
        List<Integer> list1 = List.of(5, 5, 10, 10, 20);

        System.out.println("Answer to "+lemonadeChange(list));
        System.out.println("Answer to "+lemonadeChange(list1));
    }

    /**
     * Method to check if the lemonade change can be given
     *
     * @param list List of integers
     * @return boolean
     * */
    private static boolean lemonadeChange(List<Integer> list) {
        int fiveCurrency = 0;
        int tenCurrency = 0;
        for (int i : list) {
            if (i == 5) {
                fiveCurrency++;
            } else if (i == 10) {
                if (fiveCurrency == 0) {
                    return false;
                }
                fiveCurrency--;
                tenCurrency++;
            } else {
                if (fiveCurrency > 0 && tenCurrency > 0) {
                    fiveCurrency--;
                    tenCurrency--;
                } else if (fiveCurrency >= 3) {
                    fiveCurrency -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}