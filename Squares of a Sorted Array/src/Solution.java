class Solution {
    public int[] sortedSquares(int[] A) {
        
        //ArrayList<Integer> arr = new ArrayList<>();
        int[] arr = new int[A.length];
        
        for(int i=0; i<A.length; i++) {
            arr[i] = A[i] * A[i];
        }
        
        sort(arr, 0, arr.length-1);
        
        return arr;
        
        
    }
    
    public int partition(int[] arr, int low, int high) {
        
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
        
    }
    
    public void sort(int[] arr, int low, int high) {
        
        if(low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    
    
}