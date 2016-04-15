package remotejson.com.charttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        BarChart barChart1 = (BarChart) findViewById(R.id.barChart_1);
        Utility.setBarChartData(barChart1);

        BarChart barChart2 = (BarChart) findViewById(R.id.barChart_2);
        Utility.setBarChartData(barChart2);
    }
}
