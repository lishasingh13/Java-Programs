import java.util.*;
public class Kadanes {
    public static void Kadanes(int A[])
    {
        int currsum=0;
        int maxsum=0;
        for(int i=0;i<A.length;i++)
        {
            currsum=currsum+A[i];
            if(currsum<0){
            currsum=0;}
            if(maxsum<currsum)
            maxsum=currsum;
        }
        System.out.println("Maximum Subarray sum is : "+ maxsum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int [n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        Kadanes(A);
    }
}
