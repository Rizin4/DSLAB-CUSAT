import java.util.*; class binary { 
    public static void binarySearch(int array[],int first,int last,int key) 
    { 
     int mid=(first+last)/2;    while(first<=last) 
     { 
       if(array[mid]<key) 
       { 
         first=mid+1; 
       } 
       else if(array[mid]==key) 
       { 
        System.out.print("Element is found at index:"+mid);       break;      }      else{ 
         last=mid-1; 
         } 
       mid=(first+last)/2; 
     }    if(first>last) 
     { 
      System.out.print("Elemet not found"); 
     } 
    } 
    public static void main(String args[]){     Scanner in=new Scanner(System.in);     int i,n,key,array[]; 
      System.out.println("Enter the number of elements:");     n=in.nextInt();     array=new int[n]; 
      System.out.println("Enter those"+n+"elements"); 
      for(i=0;i<n;i++) 
      { 
       array[i]=in.nextInt(); 
      } 
      System.out.println("Enter the value to find:");     key=in.nextInt();     int last=array.length-1;     binarySearch(array,0,last,key); 
     } 
   } 
  