package Functions_Arrays;

public class firstAndLastIndex {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        int first = firstIndex(nums, target);
        int last = lastIndex(nums, target);
        result[0] = first;
        result[1] = last;
        return result;
    }
    
    public int firstIndex(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        int fI = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                fI = mid;
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return fI;
    }
    
    public int lastIndex(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        int lI = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                lI = mid;
                start = mid+1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return lI;
    }
}
