package com.ruoyi.demoTest.leetcode;

public class Demo3 {
    public static void main(String[] args) {

        ListNode a = new ListNode(2);
        ListNode a2 = new ListNode(4) ;
        ListNode a3 = new ListNode(3) ;
        a.next = a2;
        a2.next = a3;


        ListNode b = new ListNode(5);
        ListNode b2 = new ListNode(6) ;
        ListNode b3 = new ListNode(4) ;
        ListNode b4 = new ListNode(1);
        b.next = b2;
        b2.next = b3;
        b3.next = b4;

        addTwoNumbers(a, b);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode cursor = listNode;
        int i = 0;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){

            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sum = l1Val+l2Val + carry;
            if(sum >=10 ){
                carry = 1;
                sum = sum%10;
            }else{
                carry = 0;
            }

            ListNode ss = new ListNode(sum);
            cursor = ss;
            cursor.next = ss;
            System.out.println(sum);
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return listNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
