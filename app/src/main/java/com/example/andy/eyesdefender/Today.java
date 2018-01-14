package com.example.andy.eyesdefender;

/**
 * Created by Andy on 2017/12/30.
 */
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import java.util.List;
import java.util.ArrayList;

public class Today extends AppCompatActivity {
    /** Called when the activity is first created. */
    PieChart pieChart;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);
        ActionBar actionBar = super.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        addLineChart();
        addPieChart();
    }

    public void addLineChart() {
        LineChart chart_line = findViewById(R.id.chart_line);
        // chart_line.setData(getLineData());
        List<Entry> entries = new ArrayList<>();
        entries.add(new Entry(28, 0));
        entries.add(new Entry(25, 1));
        entries.add(new Entry(31, 2));
        entries.add(new Entry(32, 3));
        entries.add(new Entry(30, 4));
        entries.add(new Entry(29, 5));

        LineDataSet dataSetA = new LineDataSet(entries, "Distance");
        dataSetA.setFillAlpha(255);
        dataSetA.setColor(Color.BLACK);
        dataSetA.setCircleColor(Color.BLACK);
        dataSetA.setLineWidth(5f);
        dataSetA.setCircleRadius(3f);
        dataSetA.setDrawCircleHole(false);
        dataSetA.setValueTextSize(9f);
        dataSetA.setDrawFilled(true);
        dataSetA.setCircleRadius(5);

        LimitLine yLimitLine = new LimitLine(30f,"yLimit 测试");
        yLimitLine.setLineColor(Color.RED);
        yLimitLine.setTextColor(Color.RED);
        YAxis leftAxis = chart_line.getAxisLeft();
        leftAxis.addLimitLine(yLimitLine);
        yLimitLine.setLineWidth(10);

        ArrayList<String> labels = new ArrayList<>();
        labels.add("1/13 12:00");
        labels.add("13:00");
        labels.add("14:00");
        labels.add("15:00");
        labels.add("16:00");
        labels.add("17:00");

        LineData data = new LineData(labels, dataSetA);
        chart_line.setData(data);

        XAxis xAxis = chart_line.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM); // 设置X轴的位置
    }

    public void addPieChart() {
        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.rgb(255,81,81));
        colors.add(Color.rgb(121,255,121));

        pieChart =  findViewById(R.id.chart_pie);
        pieChart.setUsePercentValues(true);
        pieChart.setDrawHoleEnabled(false);

        ArrayList<Entry> yValues = new ArrayList<Entry>();
        yValues.add(new Entry(8f, 0));
        yValues.add(new Entry(15f, 1));

        PieDataSet dataSet = new PieDataSet(yValues, "");
        dataSet.setColors(colors);

        ArrayList<String> xVal = new ArrayList<String>();

        xVal.add("Too Close");
        xVal.add("Appropriate");

        PieData pData = new PieData(xVal, dataSet);
        pData.setValueTextSize(15f);
        pData.setValueFormatter(new PercentFormatter());

        pieChart.setData(pData);
    }

}