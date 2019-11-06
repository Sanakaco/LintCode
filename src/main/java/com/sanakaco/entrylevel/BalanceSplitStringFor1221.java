package com.sanakaco.entrylevel;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @author pandas
 * @ClassName BalanceSplitStringFor1221
 * @Description TODO
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * 返回可以通过分割得到的平衡字符串的最大数量。

 * 示例 1：
 *
 * 输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * 示例 2：
 *
 * 输入：s = "RLLLLRRRLR"
 * 输出：3
 * 解释：s 可以分割为 "RL", "LLLRRR", "LR", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * 示例 3：
 *
 * 输入：s = "LLLLRRRR"
 * 输出：1
 * 解释：s 只能保持原样 "LLLLRRRR".
 *  
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s[i] = 'L' 或 'R'
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019/11/6 8:17
 */
public class BalanceSplitStringFor1221 {
    public static void main(String[] args) {
        String str="RLLLLRRRLR";
        int res=balancedStringSplit(str);
        System.out.println(res);

    }
    /**
     *@Method balancedStringSplit
     *@Description
     * 最直观的感觉，只需要保证R与L的数目一致即可，那么遍历字符串，分别统计RL 的数量
     * 最后判断相等就算一个分割字符串。
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *@author pandas
     *@create 2019/11/6 8:57
     *@Param [s]
     *@return int
     */
    public static int balancedStringSplit(String s){
        char temp=s.charAt(0);
        int numR=0;int numL=0;
        int res=0;
        //for循环遍历的更优解使用迭代
        //for(char c:s.toCharArray())
        for (int i=0;i<s.length();i++){
            if (temp==s.charAt(i)){
                numR++;
            }
            else {
                numL++;
            }
            if (numR==numL){
                res++;
                numR=0;
                numL=0;
            }
        }
        return res;
    }

    /**
     *@Method balancedStringSplit2
     *@Description
     * 扩展思想：数字栈
     * 题目要求RL数量一致，所有只需要一个变量自增代表一个R，自减代表另一个L
     * 模拟栈的过程，第一个不关心是R还是L，入栈，下一个不相同则出栈，直到栈中为空即数量相等。
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *@author pandas
     *@create 2019/11/6 9:01
     *@Param [s]
     *@return int
     */
    public static int balancedStringSplit2(String s){
        char temp=s.charAt(0);
        int num=0;
        int res=0;
        for (int i=0;i<s.length();i++){
            if (temp==s.charAt(i)){
                num++;
            }
            else {
                num--;
            }
            if (num==0){
                temp=s.charAt(i+1);
                res++;
                num=0;
            }
        }
        return res;
    }
}
