package remotejson.com.charttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.chart_list, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getTitle().toString().toLowerCase()){
            case "line chart":
                Intent lineChartIntent = new Intent(MainActivity.this, LineChartActivity.class);
                startActivity(lineChartIntent);
                break;
            case "bar chart":
                Intent barChartIntent = new Intent(MainActivity.this, BarChartActivity.class);
                startActivity(barChartIntent);
                break;
            case "pie chart":
                Intent pieChartIntent = new Intent(MainActivity.this, PieChartActivity.class);
                startActivity(pieChartIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
