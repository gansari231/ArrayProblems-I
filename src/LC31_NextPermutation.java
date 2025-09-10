public class LC31_NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1) {
            reverse(nums, 0, n-1);
        }
        else{
            for(int i = n-1; i > index; i--) {
                if(nums[i] > nums[index]) {
                    swap(nums, index, i);
                    break;
                }
            }
            reverse(nums, index+1, n-1);
        }
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverse(int[] arr, int left, int right) {
        while(left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        nextPermutation(arr);
    }
}
