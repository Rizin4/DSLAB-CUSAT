import java.util.*; class bubble{ 
 static void bubbleSort(int array[]) 
 {    int i,j,n,temp=0;    n=array.length; 
   for(i=0;i<n;i++) 
   { 
     for(j=1;j<n-i;j++) 
     { 
        if(array[j-1]>array[j]) 
        { 
          temp=array[j-1];           array[j-1]=array[j];           array[j]=temp; 
        } 
      } 
   }  } 
public static void main(String args[]) 
{   int c,n,arr[]; 
  Scanner in=new Scanner(System.in); 
  System.out.println("Enter the number of elements:"); 
  n=in.nextInt();   arr=new int[n]; 
  System.out.println("Enter those"+n+"elements");   for(c=0;c<n;c++) 
  { 
    arr[c]=in.nextInt(); 
  } 
  System.out.println("Array Before bubble sort"); 
  for(int i=0;i<arr.length;i++) 
  { 
    System.out.println(arr[i]+""); 
  }   bubbleSort(arr); 
  System.out.println("Array after sort"); 
  for(int i=0;i<arr.length;i++) 
  { 
   System.out.println(arr[i]+""); 
   } 
  } 
} 
 
