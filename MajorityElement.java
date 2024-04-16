public class MajorityElement {

  public static void main(String args[]) {
    int[] nums = { 3, 2, 3 };
    System.out.println(majorityelementment(nums));
  }

  public static int majorityelementment(int[] nums) {
    int n = nums.length;
    int element = nums[0];
    int frequncy = 1;
    for (int i = 1; i < n; i++) {
      if (frequncy == 0) {
        element = nums[i];
        frequncy = 1;
        continue;
      }
      if (nums[i] != element) {
        frequncy--;
      } else {
        frequncy++;
      }
    }
    return element;
  }
}
