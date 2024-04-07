package org.example;

import java.util.Random;
import javax.swing.*;


public class MeasureTimeAndOperationCount extends Algorithms{

    long startTime1=0;
    long endTime1=0;
    long executionTime1=0;
    long averageTime1=0;

    long startTime2=0;
    long endTime2=0;
    long executionTime2=0;
    long averageTime2=0;

    long startTime3=0;
    long endTime3=0;
    long executionTime3=0;
    long averageTime3=0;

    long startTime4=0;
    long endTime4=0;
    long executionTime4=0;
    long averageTime4=0;

    //int[] arraySet={100,300,500,800,1000,2000,3000,5000,6000,8000,9000,10000,11000,12000,13000};
    int[] arraySet = {4500,5000, 5500, 6000,6500,7000,7500,8000,8500,9000,9500,10000,10500,11000,11500};
    public int[] generateRandomArray(int size)
    {
        int[] data = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(1000);
        }
        return data;
    }
    public int generateRandomInteger()
    {
        Random random=new Random();
        return random.nextInt();
    }
    public void measureBubbleSort()
    {

        JFrame frame = new JFrame("Grafik Örneği");
        Graph graph1 = new Graph("Bubble Sort Complexity");
        frame.add(graph1);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("Execution times and operation count for bubble sort algorithm: ");
        System.out.println("----------------------------");
        for(int i=0;i<arraySet.length;i++)
        {
            int[] data= generateRandomArray(arraySet[i]);
            for(int j=0;j<10;j++)
            {
                startTime1 = System.nanoTime();
                bubbleSort(data);
                endTime1 = System.nanoTime();
                executionTime1 += (endTime1 - startTime1);
            }
            averageTime1= executionTime1/10;
            System.out.println("Execution time for an array with "+arraySet[i]+ " elements: " + averageTime1 + " nanosecond");
            System.out.println("Total operation for an array with "+arraySet[i]+ " elements: "+(comparison+swap));
            System.out.println("----------------------------");
            graph1.addDataPoint(arraySet[i], averageTime1);
            comparison=0;
            swap=0;
        }
        executionTime1=0;
        startTime1=0;
        endTime1=0;
        averageTime1=0;
    }

    public void measureLinearSearch()
    {
        JFrame frame = new JFrame("Grafik Örneği");
        Graph graph2 = new Graph("Linear Search Complexity");
        frame.add(graph2);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("Execution times and operation count for linear search algorithm: ");
        System.out.println("----------------------------");
        for (int i = 0; i < arraySet.length; i++) {
            int[] data = generateRandomArray(arraySet[i]);

            for (int j = 0; j < 400; j++) {
                startTime2 = System.nanoTime();
                linearSearch(data, generateRandomInteger());
                endTime2 = System.nanoTime();
                executionTime2 += (endTime2 - startTime2);
            }
            averageTime2 = executionTime2 / 400;
            graph2.addDataPoint(arraySet[i], averageTime2);
            System.out.println("Execution time for an array with "+arraySet[i]+ " elements: " + averageTime2 + " nanosecond");
            System.out.println("Total operation for an array with "+arraySet[i]+ " elements: "+(comparison+swap));
            System.out.println("----------------------------");

        }
        executionTime2=0;
        startTime2=0;
        endTime2=0;
        averageTime2=0;
    }

    public void measureBinarySearch()
    {
        JFrame frame = new JFrame("Grafik Örneği");
        Graph graph3 = new Graph("Binary Search Complexity");
        frame.add(graph3);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("Execution times and operation count for binary search algorithm: ");
        System.out.println("----------------------------");
        for(int i=0;i<arraySet.length;i++)
        {
            int[] data1= generateRandomArray(arraySet[i]);

            for(int j=0;j<100;j++)
            {
                startTime3 = System.nanoTime();
                binarySearch(data1,generateRandomInteger());
                endTime3 = System.nanoTime();
                executionTime3 += (endTime3 - startTime3);
                startTime3=0;
                endTime3=0;
            }
            averageTime3= executionTime3/100;
            graph3.addDataPoint(arraySet[i], averageTime3);
            System.out.println("Execution time for an array with "+arraySet[i]+ " elements: " + averageTime3 + " nanosecond");
            System.out.println("Total operation for an array with "+arraySet[i]+ " elements: "+(comparison+swap));
            System.out.println("----------------------------");
            comparison=0;
        }
        executionTime3=0;
        startTime3=0;
        endTime3=0;
        averageTime3=0;
    }

    public void measuredNestedLoop()
    {
        JFrame frame = new JFrame("Grafik Örneği");
        Graph graph4 = new Graph("Nested Loop Complexity");
        frame.add(graph4);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("Execution times and operation count for nested loop algorithm: ");
        System.out.println("----------------------------");
        for(int i=0;i<arraySet.length;i++)
        {
            for(int j=0;j<10;j++)
            {
                startTime4 = System.nanoTime();
                nestedLoop(arraySet[i]);
                endTime4 = System.nanoTime();
                executionTime4 += (endTime4 - startTime4);
            }
            averageTime4= executionTime4/10;
            System.out.println("Execution time for an array with "+arraySet[i]+ " elements: " + averageTime4 + " nanosecond");
            System.out.println("Total operation for an array with "+arraySet[i]+ " elements: "+loopCount);
            System.out.println("----------------------------");
            graph4.addDataPoint(arraySet[i], averageTime4);
            loopCount=0;
        }
        executionTime4=0;
        startTime4=0;
        endTime4=0;
        averageTime4=0;
    }

}
