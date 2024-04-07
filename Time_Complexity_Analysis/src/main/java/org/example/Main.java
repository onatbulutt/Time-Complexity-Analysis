package org.example;

public class Main {
    public static void main(String[] args) {
        MeasureTimeAndOperationCount measureTime = new MeasureTimeAndOperationCount();
        measureTime.measureBinarySearch();
        measureTime.measureBubbleSort();
        measureTime.measureLinearSearch();
        measureTime.measuredNestedLoop();

    }
}