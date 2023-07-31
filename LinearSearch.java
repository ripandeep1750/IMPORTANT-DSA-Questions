class LinearSearch{
    static int search(int arr[],int item){
        for(int i=0;i<=arr.length;i++){
        if(arr[i]==item)
        return i;
        }
        return -1;
    }
    
    public static void main(String args[]){
        int arr[]={3,7,4,1,8,9};
        int item=8;
        int result=search(arr,item);
        
        if (result==-1)
        System.out.println("Element not found in array.");
        else
        System.out.println("Element found at index: " +result);
    }
}
// Space Complexity : O(N)
// Time Complexity : O(N)
