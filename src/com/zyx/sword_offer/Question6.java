package com.zyx.sword_offer;

import java.util.LinkedList;
import java.util.List;

/**
 * 从尾到头打印链表
 * 方法一：双指针方法
 * 方法二：递归方法
 */
public class Question6 {
    List<Integer> res = new LinkedList<>();

    public static void main(String[] args) {
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);
        node_1.next =node_2;
        node_2.next =node_3;
        node_3.next =node_4;
        node_4.next =node_5;
        node_5.next = null;

        //执行其中之一的方法需要注释另一个方法
        //方法一
        ListNode res = reverseLinkedList_1(node_1);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
        //方法二
        ListNode res_ = reverseLinkedList_2(node_1);
        while(res_ != null){
            System.out.println(res_.val);
            res_ = res_.next;
        }
    }

    public static ListNode reverseLinkedList_1(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static ListNode reverseLinkedList_2(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode res = reverseLinkedList_2(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }

}

class ListNode{
    int val;
    ListNode next;
    public ListNode(int x){
        val = x;
    }
}
