package remotejson.com.charttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart pieChart1 = (PieChart) findViewById(R.id.pieChart_1);
        Utility.setChartData(pieChart1,2);

        PieChart pieChart2 = (PieChart) findViewById(R.id.pieChart_2);
        Utility.setChartData(pieChart2,2);
    }
}
