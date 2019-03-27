
public class Day01 {

    public static int findPosition(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length;
        int i=0 ;
        while (start + 1 < end) {
            i++;
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] x = new int[]{2,2,2,2,5,6};
        int position  =  findPosition(x, 2);
        System.out.println(position);

    }
}
