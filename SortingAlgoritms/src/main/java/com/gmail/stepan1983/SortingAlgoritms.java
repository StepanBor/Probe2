package com.gmail.stepan1983;

public class SortingAlgoritms {

    public static void main(String[] args) {

        int[] arr=new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+", ");

        }
        System.out.println();
        System.out.println("selection sort");
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");

        }
        System.out.println();
        System.out.println("bubble sort");
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");

        }
        System.out.println();
        System.out.println("insertion sort");
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");

        }
    }

    public  static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index=i;
            int min=arr[i];
            for (int j = i; j < arr.length; j++) {
                if(min>arr[j]){
                    min=arr[j];
                    index=j;
                }
            }
            int k=arr[index];
            arr[index]=arr[i];
            arr[i]=k;
        }
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int k=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=k;
                }
            }
        }

    }

    public static void insertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    int k=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=k;
                }
            }
        }
    }


}


