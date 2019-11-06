package com.sanakaco.entrylevel;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.util.List;

/**
 * @author pandas
 * @ClassName DeleteLinkNodeFor237
 * @Description TODO
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 *
 * 现有一个链表 -- head = [4,5,1,9]，它可以表示为:
    4->5->1->9
 * 示例 1:
 *
 * 输入: head = [4,5,1,9], node = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 *
 * 示例 2:
 *
 * 输入: head = [4,5,1,9], node = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 *  
 * 说明:
 *
 * 链表至少包含两个节点。
 * 链表中所有节点的值都是唯一的。
 * 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 * 不要从你的函数中返回任何结果。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/delete-node-in-a-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019/11/5 22:05
 */
public class DeleteLinkNodeFor237 {

    public static void main(String[] args) {

    }
    /**
     *@Method deleteNode
     *@Description
     *通常链表的题目都会给出头结点head,根据head遍历整个链表找出对应的值
     * 然后根据被删除的节点的前一个节点next指向被删除节点的next
     *
     * 但是本体并没有head，只提供被删除的节点，也就是不可能知道被删除节点的前一个节点
     * 思路，将被删除节点替换为下一个节点，被删除节点指向下下个节点
     *
     * 注意：这里的题目限制了不能删除尾节点，若是没有限制，就不能使用这种方法
     *
     *@author pandas
     *@create 2019/11/5 22:25
     *@Param [node]
     *@return void
     */
    public static void deleteNode(ListNode node) {
        //2->8->5->6 这里删除5
        //拷贝被删除节点的下一个节点的值，也就是有两个相同的下一个节点
        node.val=node.next.val;
        //2-8->6->6
        //删除相同节点的一个节点的
        node.next=node.next.next;
        //2->8->6
    }

}

class ListNode{
    int val;
    ListNode next;

    public ListNode(int num) {
        this.val=num;
    }
}