package com.company.leetcode_work;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        // 虚拟头节点，下一个节点指向L1,L2二者中较小的头节点
        ListNode preHead = new ListNode(-1);
        // 辅助节点引用
        ListNode pre = preHead;
        while (l1 != null && l2 != null) {
            // 辅助节点的下一个节点为值小的节点
            // 较小值的节点向后移动
            if (l1.val > l2.val) {
                pre.next = l2;
                l2 = l2.next;
            } else {
                pre.next = l1;
                l1 = l1.next;
            }
            // 辅助节点也同步向后移动
            pre = pre.next;
        }
        // 如果其中一个链表已经结束，则剩下节点接到后面即可
        pre.next = l1 == null ? l2 : l1;
        // 返回虚拟头节点的下一个节点
        return preHead.next;
    }
}
