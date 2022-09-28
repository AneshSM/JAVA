package Array;
// Given an array arr[] of N integers which may contain duplicate elements, the index of an element of this array is given to us, the task is to find the final position of this element ( for which the index is given) in the array after the stable sort is applied on the array. 

import java.util.Arrays;
import java.util.Scanner;


class StableSortandPosition{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        int index=sc.nextInt();
        System.out.println(getIndexInSortedArray(a,n,index));
    }
    
    static long getIndexInSortedArray(long arr[], int n,int index)
    {
        long v=arr[index];
        n=0;
        for(int i=0;i<=index;i++){
            if(v==arr[i])
                n+=1;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(v==arr[i])
                n-=1;
            if(n==0){
                v=i;
                break;
            }
        }
        return v;
    }
}