class BinarySearchRecursive{
    static int search(int arr[], int left, int right, int item){
        if(left<=right){
            int mid = (left + right )/2;
            
            if(item == arr[mid])
            return mid;
            
            if(item < arr[mid])
            return search(arr, left, mid-1, item);
            
            else
            return search(arr, mid+1, right, item);
        }
        else
        return -1;
    }
    
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60,70,80};
        int item = 60;
        int n = arr.length;
        int result = search(arr,0,n-1,item);
        
        if(result == -1)
        System.out.println("Element not found in array.");
        else
        System.out.println("Element found at index: " +result);
    }
}
