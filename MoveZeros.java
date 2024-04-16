public class MoveZeros {

  public static void main(String args[]) {
    int[] nums = { 0, 1, 0, 3, 12 };
    moveZeros(nums);
  }

  public static void moveZeros(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[j] != 0) {
            // swap(i,j,nums);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            break;
          }
        }
      }
    }
  }
}
