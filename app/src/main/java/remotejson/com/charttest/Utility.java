package remotejson.com.charttest;

import com.github.mikephil.charting.charts.*;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.interfaces.datasets.*;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by Akshay on 4/16/2016.
 */
public class Utility {
    /**
     * Function Returning Arraylist
     * Containing Label of the Chart
     * Readings
     * @return ArrayList
     */
    private static ArrayList<String> getLabels(){
        ArrayList<String> labels = new ArrayList<>();
        labels.add("2013");
        labels.add("2014");
        labels.add("2015");
        labels.add("2016");
        return labels;
    }

    /**
     * Function Which Draws the BarChart
     * @param chart
     */
    public static void setBarChartData(Chart chart){
        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(18f, 0));
        entries.add(new BarEntry(12f, 1));
        entries.add(new BarEntry(15f, 2));
        entries.add(new BarEntry(12f, 3));

        BarDataSet dataSet = new BarDataSet(entries, "Revenue Data");

        BarData data= new BarData(Utility.getLabels(), dataSet);
        chart.animateY(3000);
        chart.setData(data);
    }

    /**
     * Generic function to draw
     * PieChat or Linechart based
     * on 2nd Input
     * @param Chart
     * @param chartOption
     */
    public static void setChartData(Chart Chart, int chartOption){
        ArrayList<Entry> entries = new ArrayList<>();
        DataSet dataset;
        ChartData data;
        entries.add(new BarEntry(18f, 0));
        entries.add(new Entry(10f, 1));
        entries.add(new Entry(8f, 2));
        entries.add(new Entry(15f, 3));


        switch (chartOption){
            case 1:
                dataset = new LineDataSet(entries, "Revenue Data");
                data= new LineData(Utility.getLabels(), (ILineDataSet) dataset);
                break;
            default:
                dataset = new PieDataSet(entries, "Revenue Data");
                dataset.setColors(ColorTemplate.COLORFUL_COLORS);
                data= new PieData(Utility.getLabels(), (IPieDataSet) dataset);
                break;
        }

        Chart.animateY(3000);
        Chart.setData(data);
    }
}
