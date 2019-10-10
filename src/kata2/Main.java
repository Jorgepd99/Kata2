package kata2;

/**
 *
 * @author J0RG3PD99
 */
public class Main {

    public static void main(String[] args) {
        Histogram hist = new Histogram(1,2,3,4,2,7,8,9,3,2,3);
        new ConsoleHistogramDisplay().show(hist);
    }
    
}
