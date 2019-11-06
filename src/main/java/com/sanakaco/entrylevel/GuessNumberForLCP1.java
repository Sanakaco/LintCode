package com.sanakaco.entrylevel;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.random;

/**
 * @author pandas
 * @ClassName GuessNumberForLCP1
 * @Description
 *小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。
 * 他们一共进行三次这个游戏，请返回 小A 猜对了几次？

 * 输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。

 * 示例 1：
 *
 * 输入：guess = [1,2,3], answer = [1,2,3]
 * 输出：3
 * 解释：小A 每次都猜对了。

 * 示例 2：
 *
 * 输入：guess = [2,2,3], answer = [3,2,1]
 * 输出：1
 * 解释：小A 只猜对了第二次。

 * 限制：
 * guess的长度 = 3
 * answer的长度 = 3
 * guess的元素取值为 {1, 2, 3} 之一。
 * answer的元素取值为 {1, 2, 3} 之一。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/guess-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019/11/5 20:28
 */
public class GuessNumberForLCP1 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] guess = new int[3];
        int[] answer = new int[3];
        for (int num=0;num<10;num++) {
            for (int i = 0; i < guess.length; i++) {
                answer[i] = (int)(Math.random() * 3+1);
                guess[i] =(int)(Math.random() * 3+1);
            }

            int res = game(guess, answer);
            System.out.println(Arrays.toString(guess));
            System.out.println(Arrays.toString(answer));
            System.out.println(res);
        }
    }

    public static int game(int[]guess,int[]answer){
        int res=0;
        if (guess.length!=3||answer.length!=3||guess.length!=answer.length){
            return -1;
        }
        for (int i=0;i<answer.length;i++){
            if (guess[i]==answer[i]){
                res++;
            }
        }
        return res;
    }
}
