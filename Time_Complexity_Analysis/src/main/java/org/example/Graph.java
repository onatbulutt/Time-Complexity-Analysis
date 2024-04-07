package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel {

    private final DefaultCategoryDataset dataset;
    private final JFreeChart chart;
    private final ChartPanel chartPanel;

    public Graph(String title) {
        dataset = new DefaultCategoryDataset();
        chart = ChartFactory.createLineChart(
                title, // Grafiğin başlığı
                "Data Set Size", // X ekseni başlığı
                "Time(ns)", // Y ekseni başlığı
                dataset, // Veri kümesi
                PlotOrientation.VERTICAL, true, true, false
        );

        chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(1000, 770));
        add(chartPanel);
    }

    public void addDataPoint(int x, double y) {
        dataset.addValue(y, "Complexity Curve", Integer.toString(x));
    }
}


