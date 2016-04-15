package remotejson.com.charttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;

public class LineChartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);
        LineChart lineChart1 = (LineChart) findViewById(R.id.lineChart_1);
        Utility.setChartData(lineChart1,1);

        LineChart lineChart2 = (LineChart) findViewById(R.id.lineChart_2);
        Utility.setChartData(lineChart2,1);
    }
}
