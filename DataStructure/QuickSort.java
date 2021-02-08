package quicksort;

public class QuickSort{  
    
    static void PrintArray(int a[],int n){
        int i = 0;
        for(;i<n;){
        System.out.print(a[i++]+" ");
        }
        System.out.println();
    }
    static int PartitionFunction(int a[],int l,int h){
        int pivot = a[l];
        int i = l, j = h;
        do{
        while(a[i]<=pivot){i++;}
        while(a[j]>pivot){j--;}
        if(i<j){
        int temp;
        temp = a[j];
        a[j] = a[i];
        a[i] = temp;
        }
        }while(i<j);
        int temp;
        temp = a[j];
        a[j] = a[l];
        a[l] = temp;
        return j;
    }
    static void QuickSort(int a[],int l,int h){
        int PartitionValue;
        if(l<h){
        PartitionValue = PartitionFunction(a,l,h);
        QuickSort(a,l,PartitionValue-1);
        QuickSort(a,PartitionValue+1,h);
        }
    }
    
public static void main(String args[]){  
    int arr[] = {2,5,1,9,6,4};
    System.out.println("Initial Array");
    PrintArray(arr,arr.length);
    QuickSort(arr,0,arr.length-1);
    System.out.println("After sorting");
    PrintArray(arr,arr.length);
 }
} 
