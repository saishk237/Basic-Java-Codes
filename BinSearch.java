import java.util.Scanner;

class BinSearch
{
    public static int binSearch(int arr[], int x, int low, int high)
    {
        if(low>high)
            return -1;
            
        int mid=(low+high)/2;
        if(x==arr[mid])
        {
            return mid;
        }
        else if(x>arr[mid])
        {
            return binSearch(arr,x,mid+1,high);
        }
        else
        {
            return binSearch(arr,x,low,mid-1);
        }
        
    }
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        int N=10;
        int X=40;
        int l=0;
        int h=N-1;
        int ans=binSearch(a,X,l,h);
        if(ans==-1)
            System.out.println("Element not Found");
        else
            System.out.println("Element found at Position "+ans);
    }
}
