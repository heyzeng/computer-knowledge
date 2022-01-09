package LinkedList;
/**
 * Author:Jude
 * Date:2022-01-09 上午10:32
 */

/**
   leetcode 反转链表
   1->2->3->4->null
   null<-1<-2<-3<-4
 */

//迭代的方法
//1. temp  保存临时变量
//2. change 改变链表
//3. next   迭代当前指向

public class ReverseList {

      public ListNode reverseList(ListNode head) {
            ListNode pre = null; // 前指针节点
            ListNode cur = head;  // 当前指针节点

            //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
            if (cur != null) {
                  ListNode temp = cur.next;//临时节点，暂存当前节点的下一节点，用于后移
                  cur.next = pre;//将当前节点指向它前面的节点
                  pre = cur;//前指针后移
                  cur = temp;//当前指针后移
            }
            return pre;
      }
}

// Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
