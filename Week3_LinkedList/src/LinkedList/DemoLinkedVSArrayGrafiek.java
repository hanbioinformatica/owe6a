package LinkedList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static LinkedList.DemoLinkedListVsArrayList.addElements;


public class DemoLinkedVSArrayGrafiek extends ApplicationFrame {
    public static XYSeries series = new XYSeries("Tijd data");
    static List lijst = new LinkedList<Integer>();


    public static double tijdVoorToevoegen(int aantal){
        long startTime = System.nanoTime();
        addElements(lijst, aantal);
        long endTime = System.nanoTime();
        long tijd1 = endTime - startTime;
        System.out.println("LinkedList"+aantal+" Tijd:" + (double) tijd1 / 1000000000 + " seconden");
        return (double) tijd1 / 1000000000; //Tijd in seconden
    }

    /**
     * A demonstration application showing an XY series containing a null value.
     *
     * @param title the frame title.
     */
    public DemoLinkedVSArrayGrafiek(final String title) {

        super(title);
        double tijd;
        //addValue(10,tijd);
        //tijd = DemoLinkedListVsArrayList.tijdVoorToevoegen(100);
        for (int i = 0; i < 50; i++) {
            tijd = tijdVoorToevoegen(i * 1000);
            addValue(i, tijd);
        }


        final XYSeriesCollection data = new XYSeriesCollection(series);
        final JFreeChart chart = ChartFactory.createXYLineChart(
                "Big O()",
                "data",
                "tijd",
                data,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);

    }

    public static void addValue(double x, double y) {
        series.add(x, y);
    }
// ****************************************************************************
// * JFREECHART DEVELOPER GUIDE                                               *
// * The JFreeChart Developer Guide, written by David Gilbert, is available   *
// * to purchase from Object Refinery Limited:                                *
// *                                                                          *
// * http://www.object-refinery.com/jfreechart/guide.html                     *
// *                                                                          *
// * Sales are used to provide funding for the JFreeChart project - please    *
// * support us so that we can continue developing free software.             *
// ****************************************************************************

    /**
     * Starting point for the demonstration application.
     *
     * @param args ignored.
     */
    public static void main(final String[] args) {

        final DemoLinkedVSArrayGrafiek demo = new DemoLinkedVSArrayGrafiek("XY Series Demo");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}

