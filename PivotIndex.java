public class PivotIndex {

  public static void main(String args[]) {
    int[] nums = { -1, -1, -1, -1, 0, 0 };
    System.out.println(pivotIndex(nums));
  }

  public static int pivotIndex(int[] nums) {
    int[] ps = new int[nums.length];
    ps[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      ps[i] = nums[i] + ps[i - 1];
    }
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        int left = 0;
        int right = ps[nums.length - 1] - ps[i];
        if (left == right) {
          return i;
        }
      } else if (i == nums.length - 1) {
        int left = ps[i - 1];
        int right = 0;
        if (left == right) {
          return i;
        }
      } else {
        int left = ps[i - 1];
        int right = ps[nums.length - 1] - ps[i];
        if (left == right) {
          return i;
        }
      }
    }
    return -1;
  }
}
