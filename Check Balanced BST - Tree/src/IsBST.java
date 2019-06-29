
public class IsBST {
	
	//https://www.hackerrank.com/challenges/is-binary-search-tree/problem
	
	//Optimization: keep pointer of last value that was read in getInorderTraversal() 
	//& every time before adding root.data, we check if the value we are adding is bigger than the one before. Else -> false. 

	
	ArrayList<Integer> arr = new ArrayList<>();
    int isBST(Node root) {
        getInorderTraversal(root); 
        return isSorted(arr); 
    }

    void getInorderTraversal(Node root) {
        if(root == null) return; 
        getInorderTraversal(root.left);
        arr.add(root.data); 
        getInorderTraversal(root.right);
    }

    int isSorted(ArrayList<Integer> arr) {
        for(int i=0; i<arr.size()-1; i++) {
            if(arr.get(i) > arr.get(i+1)) return 0;
        }
        

}
