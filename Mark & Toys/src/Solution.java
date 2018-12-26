/*Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There are a 
 * number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to spend, and he wants 
 * to maximize the number of toys he buys with this money.
 * 
 * Given a list of prices and an amount to spend, what is the maximum number of toys Mark can buy? 
 * For example, if prices = [1,2,3,4] and Mark has k = 7 to spend, he can buy items [1,2,3] for 6, or [3,4] for 7 units of currency. 
 * He would choose the first group of 3 items.
 */

public class Solution {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        int high = prices.length - 1;
        int low = 0; 
        int cost = 0; 
        int toyCount = 0;

        sort(prices, low, high); 

        for(int i=0; i<prices.length; i++){ 
            if(k - prices[i] >= 0) { 
                toyCount++; 
                k -= prices[i];
            }
            else {
                break;
            }
        }
            return toyCount;
    }


    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            /*
             * pi is partitioning index, arr[pi] is now at right place
             */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}