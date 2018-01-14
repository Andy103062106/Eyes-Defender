package com.example.andy.eyesdefender;

/**
 * Created by Andy on 2017/12/30.
 */

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.widget.Button;

public class History extends AppCompatActivity {
    /** Called when the activity is first created. */
    PieChart pieChart1;
    PieChart pieChart2;
    PieChart pieChart3;
    PieChart pieChart4;
    PieChart pieChart5;
    PieChart pieChart6;
    PieChart pieChart7;
    LineChart chart_line1;
    LineChart chart_line2;
    LineChart chart_line3;
    LineChart chart_line4;
    LineChart chart_line5;
    LineChart chart_line6;
    LineChart chart_line7;
    private Button btnday1;
    private Button btnday2;
    private Button btnday3;
    private Button btnday4;
    private Button btnday5;
    private Button btnday6;
    private Button btnday7;
    int[] distance = new int[60];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        btnday1 = (Button)findViewById(R.id.Day_1);
        btnday1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                pieChart1.setVisibility(View.VISIBLE);
                chart_line1.setVisibility(View.VISIBLE);

                pieChart2.setVisibility(View.INVISIBLE);
                chart_line2.setVisibility(View.INVISIBLE);
                pieChart3.setVisibility(View.INVISIBLE);
                chart_line3.setVisibility(View.INVISIBLE);
                pieChart4.setVisibility(View.INVISIBLE);
                chart_line4.setVisibility(View.INVISIBLE);
                pieChart5.setVisibility(View.INVISIBLE);
                chart_line5.setVisibility(View.INVISIBLE);
                pieChart6.setVisibility(View.INVISIBLE);
                chart_line6.setVisibility(View.INVISIBLE);
                pieChart7.setVisibility(View.INVISIBLE);
                chart_line7.setVisibility(View.INVISIBLE);
            }
        });
        btnday2 = (Button)findViewById(R.id.Day_2);
        btnday2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                pieChart2.setVisibility(View.VISIBLE);
                chart_line2.setVisibility(View.VISIBLE);

                pieChart1.setVisibility(View.INVISIBLE);
                chart_line1.setVisibility(View.INVISIBLE);
                pieChart3.setVisibility(View.INVISIBLE);
                chart_line3.setVisibility(View.INVISIBLE);
                pieChart4.setVisibility(View.INVISIBLE);
                chart_line4.setVisibility(View.INVISIBLE);
                pieChart5.setVisibility(View.INVISIBLE);
                chart_line5.setVisibility(View.INVISIBLE);
                pieChart6.setVisibility(View.INVISIBLE);
                chart_line6.setVisibility(View.INVISIBLE);
                pieChart7.setVisibility(View.INVISIBLE);
                chart_line7.setVisibility(View.INVISIBLE);
            }
        });
        btnday3 = (Button)findViewById(R.id.Day_3);
        btnday3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                pieChart3.setVisibility(View.VISIBLE);
                chart_line3.setVisibility(View.VISIBLE);

                pieChart2.setVisibility(View.INVISIBLE);
                chart_line2.setVisibility(View.INVISIBLE);
                pieChart1.setVisibility(View.INVISIBLE);
                chart_line1.setVisibility(View.INVISIBLE);
                pieChart4.setVisibility(View.INVISIBLE);
                chart_line4.setVisibility(View.INVISIBLE);
                pieChart5.setVisibility(View.INVISIBLE);
                chart_line5.setVisibility(View.INVISIBLE);
                pieChart6.setVisibility(View.INVISIBLE);
                chart_line6.setVisibility(View.INVISIBLE);
                pieChart7.setVisibility(View.INVISIBLE);
                chart_line7.setVisibility(View.INVISIBLE);
            }
        });
        btnday4 = (Button)findViewById(R.id.Day_4);
        btnday4.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                pieChart4.setVisibility(View.VISIBLE);
                chart_line4.setVisibility(View.VISIBLE);

                pieChart2.setVisibility(View.INVISIBLE);
                chart_line2.setVisibility(View.INVISIBLE);
                pieChart3.setVisibility(View.INVISIBLE);
                chart_line3.setVisibility(View.INVISIBLE);
                pieChart1.setVisibility(View.INVISIBLE);
                chart_line1.setVisibility(View.INVISIBLE);
                pieChart5.setVisibility(View.INVISIBLE);
                chart_line5.setVisibility(View.INVISIBLE);
                pieChart6.setVisibility(View.INVISIBLE);
                chart_line6.setVisibility(View.INVISIBLE);
                pieChart7.setVisibility(View.INVISIBLE);
                chart_line7.setVisibility(View.INVISIBLE);
            }
        });
        btnday5 = (Button)findViewById(R.id.Day_5);
        btnday5.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                pieChart5.setVisibility(View.VISIBLE);
                chart_line5.setVisibility(View.VISIBLE);

                pieChart2.setVisibility(View.INVISIBLE);
                chart_line2.setVisibility(View.INVISIBLE);
                pieChart3.setVisibility(View.INVISIBLE);
                chart_line3.setVisibility(View.INVISIBLE);
                pieChart4.setVisibility(View.INVISIBLE);
                chart_line4.setVisibility(View.INVISIBLE);
                pieChart1.setVisibility(View.INVISIBLE);
                chart_line1.setVisibility(View.INVISIBLE);
                pieChart6.setVisibility(View.INVISIBLE);
                chart_line6.setVisibility(View.INVISIBLE);
                pieChart7.setVisibility(View.INVISIBLE);
                chart_line7.setVisibility(View.INVISIBLE);
            }
        });
        btnday6 = (Button)findViewById(R.id.Day_6);
        btnday6.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                pieChart6.setVisibility(View.VISIBLE);
                chart_line6.setVisibility(View.VISIBLE);

                pieChart2.setVisibility(View.INVISIBLE);
                chart_line2.setVisibility(View.INVISIBLE);
                pieChart3.setVisibility(View.INVISIBLE);
                chart_line3.setVisibility(View.INVISIBLE);
                pieChart4.setVisibility(View.INVISIBLE);
                chart_line4.setVisibility(View.INVISIBLE);
                pieChart5.setVisibility(View.INVISIBLE);
                chart_line5.setVisibility(View.INVISIBLE);
                pieChart1.setVisibility(View.INVISIBLE);
                chart_line1.setVisibility(View.INVISIBLE);
                pieChart7.setVisibility(View.INVISIBLE);
                chart_line7.setVisibility(View.INVISIBLE);
            }
        });
        btnday7 = (Button)findViewById(R.id.Day_7);
        btnday7.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                pieChart7.setVisibility(View.VISIBLE);
                chart_line7.setVisibility(View.VISIBLE);

                pieChart2.setVisibility(View.INVISIBLE);
                chart_line2.setVisibility(View.INVISIBLE);
                pieChart3.setVisibility(View.INVISIBLE);
                chart_line3.setVisibility(View.INVISIBLE);
                pieChart4.setVisibility(View.INVISIBLE);
                chart_line4.setVisibility(View.INVISIBLE);
                pieChart5.setVisibility(View.INVISIBLE);
                chart_line5.setVisibility(View.INVISIBLE);
                pieChart6.setVisibility(View.INVISIBLE);
                chart_line6.setVisibility(View.INVISIBLE);
                pieChart1.setVisibility(View.INVISIBLE);
                chart_line1.setVisibility(View.INVISIBLE);
            }
        });


        ActionBar actionBar = super.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Random rand = new Random();
        for (int i=1;i<=7;i++) {
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
            addLineChart(i);
            addPieChart(i);
        }
    }

    public void addLineChart(int type) {
        if (type==1) chart_line1 = findViewById(R.id.line1);
        else if (type==2) chart_line2 = findViewById(R.id.line2);
        else if (type==3) chart_line3 = findViewById(R.id.line3);
        else if (type==4) chart_line4 = findViewById(R.id.line4);
        else if (type==5) chart_line5 = findViewById(R.id.line5);
        else if (type==6) chart_line6 = findViewById(R.id.line6);
        else if (type==7) chart_line7 = findViewById(R.id.line7);
        else return;
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

        LimitLine yLimitLine = new LimitLine(40f,"yLimit 测试");
        yLimitLine.setLineColor(Color.RED);
        yLimitLine.setTextColor(Color.RED);
        YAxis leftAxis;
        if (type==1) leftAxis = chart_line1.getAxisLeft();
        else if (type==2) leftAxis = chart_line2.getAxisLeft();
        else if (type==3) leftAxis = chart_line3.getAxisLeft();
        else if (type==4) leftAxis = chart_line4.getAxisLeft();
        else if (type==5) leftAxis = chart_line5.getAxisLeft();
        else if (type==6) leftAxis = chart_line6.getAxisLeft();
        else if (type==7) leftAxis = chart_line7.getAxisLeft();
        else return;

        leftAxis.addLimitLine(yLimitLine);
        yLimitLine.setLineWidth(10);

        ArrayList<String> labels = new ArrayList<>();
        for(int i=0; i<60; i++) labels.add("X"+i);

        LineData data = new LineData(labels, dataSetA);
        XAxis xAxis;
        if (type==1) {chart_line1.setData(data);xAxis = chart_line1.getXAxis();}
        else if (type==2) {chart_line2.setData(data);xAxis = chart_line2.getXAxis();}
        else if (type==3) {chart_line3.setData(data);xAxis = chart_line3.getXAxis();}
        else if (type==4) {chart_line4.setData(data);xAxis = chart_line4.getXAxis();}
        else if (type==5) {chart_line5.setData(data);xAxis = chart_line5.getXAxis();}
        else if (type==6) {chart_line6.setData(data);xAxis = chart_line6.getXAxis();}
        else if (type==7) {chart_line7.setData(data);xAxis = chart_line7.getXAxis();}
        else return;
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM); // 设置X轴的位置

        if (type==1) chart_line1.setVisibility(View.INVISIBLE);
        else if (type==2) chart_line2.setVisibility(View.INVISIBLE);
        else if (type==3) chart_line3.setVisibility(View.INVISIBLE);
        else if (type==4) chart_line4.setVisibility(View.INVISIBLE);
        else if (type==5) chart_line5.setVisibility(View.INVISIBLE);
        else if (type==6) chart_line6.setVisibility(View.INVISIBLE);
        else if (type==7) chart_line7.setVisibility(View.INVISIBLE);

    }

    public void addPieChart(int type) {
        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.rgb(255,81,81));
        colors.add(Color.rgb(121,255,121));

        if (type==1) {
            pieChart1 =  findViewById(R.id.pie1);
            pieChart1.setUsePercentValues(true);
            pieChart1.setDrawHoleEnabled(false);
        }
        else if (type==2) {
            pieChart2 = findViewById(R.id.pie2);
            pieChart2.setUsePercentValues(true);
            pieChart2.setDrawHoleEnabled(false);
        }
        else if (type==3) {
            pieChart3 = findViewById(R.id.pie3);
            pieChart3.setUsePercentValues(true);
            pieChart3.setDrawHoleEnabled(false);
        }
        else if (type==4) {
            pieChart4 = findViewById(R.id.pie4);
            pieChart4.setUsePercentValues(true);
            pieChart4.setDrawHoleEnabled(false);
        }
        else if (type==5) {
            pieChart5 = findViewById(R.id.pie5);
            pieChart5.setUsePercentValues(true);
            pieChart5.setDrawHoleEnabled(false);
        }
        else if (type==6) {
            pieChart6 = findViewById(R.id.pie6);
            pieChart6.setUsePercentValues(true);
            pieChart6.setDrawHoleEnabled(false);
        }
        else if (type==7) {
            pieChart7 = findViewById(R.id.pie7);
            pieChart7.setUsePercentValues(true);
            pieChart7.setDrawHoleEnabled(false);
        }
        else return;


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

        if (type==1) {
            pieChart1.setData(pData);
            pieChart1.setVisibility(View.INVISIBLE);
        }
        else if (type==2) {
            pieChart2.setData(pData);
            pieChart2.setVisibility(View.INVISIBLE);
        }
        else if (type==3) {
            pieChart3.setData(pData);
            pieChart3.setVisibility(View.INVISIBLE);
        }
        else if (type==4) {
            pieChart4.setData(pData);
            pieChart4.setVisibility(View.INVISIBLE);
        }
        else if (type==5) {
            pieChart5.setData(pData);
            pieChart5.setVisibility(View.INVISIBLE);
        }
        else if (type==6) {
            pieChart6.setData(pData);
            pieChart6.setVisibility(View.INVISIBLE);
        }
        else if (type==7) {
            pieChart7.setData(pData);
            pieChart7.setVisibility(View.INVISIBLE);
        }
    }

}