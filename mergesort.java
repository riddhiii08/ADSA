import java.util.*;

public class mergesort {

    static void mergesort(int arr[] , int l, int u){
        if(l<u){
            int mid = l+(u - 1)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, u);
            merge(arr , l , mid , u);
        }

    }

    static void merge(int arr[], int l, int mid, int u){
        int i = l;
        int j = mid+1;
        int k = 0;

        int temp[] = new int[u - l + 1];

        while (true) {
            if (i > mid) {
                break;
            }

            if (j > u) {
                break;
            }
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while( i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= u) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int m = 0; m < temp.length; m++) {
            arr[l + m] = temp[m];
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " +n+ " elements") ;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Orignal array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mergesort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}