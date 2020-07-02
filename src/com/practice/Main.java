package com.practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int result = simpleArraySum(ar);
       // List<Integer> result = compareTriplets(a, b);
        //plusMinus(arr);
    }

    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum=0;
        for(int i = 0; i<ar.length;i++){
            sum+=ar[i];
        }
        return sum;

    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        System.out.println("Longitud "+a.size());
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < a.size(); i++){
            if(a.get(i)>b.get(i)){
                alice+=1;
            }else if (a.get(i)<b.get(i)){
                bob+=1;
            }else if(a.get(i) == b.get(i)){

            }
        }

        result.add(alice);
        result.add(bob);
        System.out.println("Resultado--> "+result);
        return result;

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        int diagonalTotal = 0;
        int x = arr.size()-1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    firstDiagonal += arr.get(i).get(j);
                }
            }
            if(x>=0){
                System.out.print("Position #" + i + x + ": " + arr.get(i).get(x) + "\n");
                secondDiagonal += arr.get(i).get(x);
                x-=1;
            }
        }
        diagonalTotal = Math.abs(firstDiagonal - secondDiagonal);
        System.out.println("Result firstDiagonal: " + firstDiagonal);
        System.out.println("Result secondDiagonal: " + secondDiagonal);
        System.out.println("Diagonals Sum: " + diagonalTotal);
        return diagonalTotal;
    }

    static void plusMinus(int[] arr) {
        DecimalFormat numberFormat = new DecimalFormat("0.000000");
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>0){
                positiveCount+=1;
            }else if(arr[i]<0){
                negativeCount+=1;
            }else if(arr[i]==0){
                zeroCount +=1;
            }
        }

        positiveCount = positiveCount/arr.length;
        negativeCount = negativeCount/arr.length;
        zeroCount = zeroCount/arr.length;
        float[] answer = new float[3];
        answer[0] = positiveCount;
        answer[1] = negativeCount;
        answer[2] = zeroCount;


        System.out.println(numberFormat.format(positiveCount) + "\n" + numberFormat.format(negativeCount) + "\n" + numberFormat.format(zeroCount));
    }

}
