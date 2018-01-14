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
import java.util.Random;

public class Today extends AppCompatActivity {
    /** Called when the activity is first created. */
    PieChart pieChart;
    int[] distance = new int[60];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);
        ActionBar actionBar = super.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Random rand = new Random();
        for(int l=0;l<60;l++) {
            int b;
            if(l < 10){
                b = 33;
            }else if(l < 20){
                b = 37;
            }else if(l < 30){
                b = 43;
            }else if(l < 40){
                b = 40;
            }else if(l < 50){
                b = 38;
            }else{
                b = 45;
            }
            int n = rand.nextInt(5) + b;
            distance[l] = n;
        }
        addLineChart();
        addPieChart();
    }

    public void addLineChart() {
        LineChart chart_line = findViewById(R.id.chart_line);
        // chart_line.setData(getLineData());
        List<Entry> entries = new ArrayList<>();
        for(int i=0;i<60;i++) entries.add(new Entry(distance[i], i));

        LineDataSet dataSetA = new LineDataSet(entries, "Distance");
        dataSetA.setFillAlpha(255);
        dataSetA.setColor(Color.BLACK);
        dataSetA.setCircleColor(Color.BLACK);
        dataSetA.setLineWidth(5f);
        dataSetA.setCircleRadius(3f);
        dataSetA.setDrawCircleHole(false);
        dataSetA.setValueTextSize(3f);
        dataSetA.setDrawFilled(true);
        dataSetA.setCircleRadius(3);

        LimitLine yLimitLine = new LimitLine(40f,"");
        yLimitLine.setLineColor(Color.RED);
        yLimitLine.setTextColor(Color.RED);
        YAxis leftAxis = chart_line.getAxisLeft();
        leftAxis.addLimitLine(yLimitLine);
        yLimitLine.setLineWidth(10);

        ArrayList<String> labels = new ArrayList<>();
        for(int i=0; i<60; i++) labels.add("X"+i);

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
        int close=0;
        for(int i=0; i<60; i++) if(distance[i] < 40) close++;
        yValues.add(new Entry(close, 0));
        yValues.add(new Entry(60-close, 1));

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