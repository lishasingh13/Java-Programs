import java.util.*;
public class binarySearch {
    public static int search(int A[],int key)
    {
        int low=0,high=A.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(A[mid]==key)
            {
                return mid;
            }
            if(A[mid]<key)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int index=search(A,key);
        System.out.println("The index is : "+index);
    }
    
}
