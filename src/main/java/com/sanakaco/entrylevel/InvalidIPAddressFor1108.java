package com.sanakaco.entrylevel;

/**
 * @author pandas
 * @ClassName InvalidIPAddressFor1108
 * @Description TODO
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 *
 * 示例 1：
 *
 * 输入：address = "1.1.1.1"
 * 输出："1[.]1[.]1[.]1"
 * 示例 2：
 *
 * 输入：address = "255.100.50.0"
 * 输出："255[.]100[.]50[.]0"

 * 提示：
 *
 * 给出的 address 是一个有效的 IPv4 地址
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/defanging-an-ip-address
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019/11/5 21:53
 */
public class InvalidIPAddressFor1108 {

    public static void main(String[] args) {

        defangIPaddr("12.45.12.66");
    }

    /**
     *@Method defangIPaddr
     *@Description 最简洁的办法 replace,下面是另外一种办法，将字符一个个取出
     * 时间复杂度 n
     * 空间复杂度 n
     *@author pandas
     *@create 2019/11/5 22:00
     *@Param [address]
     *@return java.lang.String
     */
    public static String defangIPaddr(String address) {
//
//        String IP=address.replace(".","[.]");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c != '.') {
                sb.append(c);
            } else {
                sb.append('[').append(c).append(']');
            }
        }
        return sb.toString();

    }

}
