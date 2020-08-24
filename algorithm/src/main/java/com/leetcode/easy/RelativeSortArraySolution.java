package com.leetcode.easy;


/**
 * 给你两个数组，arr1 和 arr2，
 * <p>
 * arr2 中的元素各不相同
 * arr2 中的每个元素都出现在 arr1 中
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * 输出：[2,2,2,1,4,3,3,9,6,7,19]
 *  
 * <p>
 * 提示：
 * arr1.length, arr2.length <= 1000
 * 0 <= arr1[i], arr2[i] <= 1000
 * arr2 中的元素 arr2[i] 各不相同
 * arr2 中的每个元素 arr2[i] 都出现在 arr1 中
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/relative-sort-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * todo: 不太懂
 */
public class RelativeSortArraySolution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // 示例 arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
        //由于arr1的可能取值为0-1000，共1001个取值，不算一个很大的取值范围，所以可以利用桶式排序
        // bucket [0,0,0,0,0,0,0,0,0,......0]
        // index   0 1 2 3 4 5 6 7 8 ......1000
        int[] bucket = new int[1001];
        //计数每个桶有多少个数，也就是每个值在数组中有几个
        for (int num : arr1) {
            bucket[num]++;
        }
        // bucket [0,1,3,2,1,0,1,1,0,1 ...1...0]
        // index   0 1 2 3 4 5 6 7 8 9...19...1000
        //由于重新排序不会改变数组的长度，所以可以利用原数组，可以节省空间复杂度
        int i = 0;
        //由于排序是按照相对顺序进行排序，所以，首先根据arr2中的桶的顺序，依次从对应的桶中取数到arr1中
        //并注意，每拿出一个数，需要将对桶中的数的个数进行-1操作
        for (int num : arr2) {
            while (bucket[num]-- > 0) {
                arr1[i++] = num;
            }
        }
        //未在arr2中的桶中的数，按照桶号升序进行输出，所以进行二次遍历
        for (int j = 0; j < 1001; ++j) {
            while (bucket[j]-- > 0) {
                arr1[i++] = j;
            }
        }
        return arr1;
    }

}
