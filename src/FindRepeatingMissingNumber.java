import java.util.Hashtable;

public class FindRepeatingMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 5, 7};
        int[] nums = findMissingRepeatingNum(arr);

        for(int j : nums)
        {
            System.out.print(j + " ");
        }
    }

    public static int[] findMissingRepeatingNum(int[] arr)
    {
        int max = 0;
        Hashtable<Integer, Integer> htable = new Hashtable<>();
        int repeatingNum = -1;
        int missingNum = -1;

        for (int j : arr) {
            max = Math.max(max, j);
            int count = htable.getOrDefault(j, 0) + 1;
            htable.put(j, count);

            if (count == 2)
                repeatingNum = j;
        }

        for (int i = 1; i <= max; i++) {
            if(!htable.containsKey(i))
                missingNum = i;
        }

        return new int[]{repeatingNum, missingNum};
    }
}
