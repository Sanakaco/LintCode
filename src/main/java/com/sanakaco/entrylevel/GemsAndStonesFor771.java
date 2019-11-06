package com.sanakaco.entrylevel;

import java.util.logging.Level;

/**
 * @author pandas
 * @ClassName GemsAndStonesFor771
 * @Description TODO
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
 * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 示例 1:
 *
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 示例 2:
 *
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 * 注意:
 *
 * S 和 J 最多含有50个字母。
 *  J 中的字符不重复。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jewels-and-stones
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019/11/5 21:00
 */
public class GemsAndStonesFor771 {
    public static void main(String[] args) {
        String J="AZaz";String S="aAAbbbb";
        int res=numJewelsInStones(J,S);
        System.out.println(res);
    }

    /**
     *@Method numJewelsInStones
     *@Description
     * 题目简单，解法很多，数组，map,hash都可以
     *这里只需要考虑字母，A-Z(65-90) a-z(97-122)
     * 第一次for将J对应的char转为对应的数组index，置1
     * 第二次for将S对应的char与temp对比，如果是1说明有个类型
     *
     *@author pandas
     *@create 2019/11/5 21:25
     *@Param [J, S]
     *@return int
     */
    public static int numJewelsInStones(String J, String S) {
        int res=0;int yy=0;
        int[] temp = new int[58];
        for(int i=0;i< J.length();i++){
            temp[(J.charAt(i)-65)]=1;
            yy=J.charAt(i);
            System.out.println(yy);
        }
        for (int j=0;j<S.length();j++){

            if (temp[(S.charAt(j)-65)]==1){
                res++;
                //如果题目要求只统计手中的宝石种类数目，即相同的不重复计数
                //temp[(S.charAt(j)-65)]=2;
            }
        }
        return res;
    }


}
