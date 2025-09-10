public class LC75_SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int low = 0, mid = 0, high = arr.length - 1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                Swap(arr, mid++, low++);
            }
            else if(arr[mid] == 1) {
                mid++;
            }

            else if(arr[mid] == 2) {
                Swap(arr, mid, high--);
            }
        }
    }

    public static void Swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
