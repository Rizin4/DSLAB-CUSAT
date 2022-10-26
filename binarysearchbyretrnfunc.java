import java.util.Scanner;
public class binarysearchbyretrnfunc {
     public static int binarysearch(int[] a,int first,int last,int key){
        while(first<=last)
        {
            int mid=(first+last)/2;
            if(a[mid]>key)
            return binarysearch(a,first,mid-1,key);
            else if(a[mid]==key)
            return mid;
            else
            return binarysearch(a,mid+1,last,key);
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int num=in.nextInt();
        int[] arr=new int[num];
        int last=num-1;
        System.out.println("Enter the elements:");
        for(int i=0;i<num;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the key to be searched:");
        int key=in.nextInt();
        int result=binarysearch(arr,0,last,key);
        if(result==-1)
        System.out.println("Element not found");
        else
        System.out.println(key+" is present at index at "+result);
    }
}
