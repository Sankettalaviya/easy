public class MergeSortJ {

  public static void main(String args[]) {
    int[] nums1 = { 1, 2, 3,10};
    int[] nums2 = { 1,2,3,3,3,9 };
    mergeArray(nums1, 4, nums2, 6);
  }

  public static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
    int[] ans = new int[m + n];
    int s1 = 0, s2 = 0;
    int t = 0;
    while (s1 < m && s2 < n) {
      if (nums1[s1] <= nums2[s2]) {
        ans[t] = nums1[s1];
        s1++;
        t++;
      } else {
        ans[t] = nums2[s2];
        s2++;
        t++;
      }
    }
    while (s1 < m) {
      ans[t] = nums1[s1];
      s1++;
      t++;
    }
    while (s2 < n) {
      ans[t] = nums2[s2];
      s2++;
      t++;
    }
    for (int i = 0; i < ans.length; i++) {
      System.out.println(ans[i]);
    }
  }
}
