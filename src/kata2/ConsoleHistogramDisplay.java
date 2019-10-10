package kata2;

/**
 *
 * @author J0RG3PD99
 */
public class ConsoleHistogramDisplay implements HistogramDisplay {

    public ConsoleHistogramDisplay() {
    }
    
    @Override
    public void show(Histogram histogram) {
        for (int i : histogram) {
            System.out.println( i + ": " + histogram.getCount(i));
        }
    }
    
}