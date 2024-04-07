package org.example;

public class Algorithms {

    int comparison=0;
    int swap=0;
    int loopCount=0;
    public void bubbleSort(int[] data1) //n^2
    {

        for(int i=0;i< data1.length;i++)
        {
            for(int j=0;j< data1.length-1;j++)
            {
                comparison++;
                if(data1[j+1]<data1[j])
                {
                    int temp=data1[j];
                    data1[j]=data1[j+1];
                    data1[j+1]=temp;
                    swap++;
                }
            }
        }
    }
    public int linearSearch(int[] data2,int target)//n
    {
        for(int i=0;i<data2.length;i++)
        {
            comparison++;
            if(target==data2[i])
            {
                return i;
            }
        }
        return -1;
    }

    public void nestedLoop(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<n;k=k*2)
            {
                loopCount++;
            }
        }
    }

    public int binarySearch(int[] data3,int target)//logn
    {
        int left=0;//low
        int right=data3.length-1;//high
        while(left<right)
        {
            int mid= (right+left)/2;
            comparison++;
            if(target==data3[mid])
            {
                return mid;
            }
            else if (target<data3[mid])
            {
                comparison++;
                left=mid+1;
            }
            else
            {
                comparison++;
                right=mid-1;
            }
        }
        return -1;
    }

    public void factorial(int n)
    {
        int number=n;
        int result = 1;
        for(int i=1;i<=number;i++)
        {
            result=result*i;
        }
    }

}
