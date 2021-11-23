package com.zyx.sword_offer;

public class Question18 {
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

        ListNode head = removeNode(node_1,3);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode removeNode(ListNode head, int val){
        if(head == null) return null;
        if(head.val == val) return head.next;
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
                cur.next = null;
            }
            cur = cur.next;
            pre = pre.next;
        }
        return head;
    }
}

