import java.util.Scanner;
public class insertionSort{
public static void insertionSort(int array[])
{
int n = array.length;
for(int j=1;j<n;j++){
int key = array[j];
int i = j-1;
while((i>-1)&&(array[i]>key)){
array[i+1] = array[i];
i--;
}
array[i+1] = key;
}
}

public static void main(String[] args){
Scanner in = new Scanner(System.in);
int c,n, arr[];
System.out.println("Enter the number of elements:");
n = in.nextInt();
arr = new int[n];
System.out.println("Enter those "+n+" elements:");
for(c=0; c<n; c++)
{
arr[c] = in.nextInt();
}
System.out.println("Before insertion sort:");
for(int i:arr){
System.out.print(i+" ");
}
System.out.println();
insertionSort(arr);
System.out.println("After insertion sort");
for(int i:arr){
System.out.print(i+" ");
}
}
}