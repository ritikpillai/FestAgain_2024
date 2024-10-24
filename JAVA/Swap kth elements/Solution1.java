// Given an array arr of size n, swap the kth element from the beginning with kth element from the end.



public class Solution1 {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 8;
        int k = 3;

        int temp = 0 ;
        temp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp ;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    };

}
