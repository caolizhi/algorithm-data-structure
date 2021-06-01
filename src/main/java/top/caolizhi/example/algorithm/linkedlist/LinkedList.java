package top.caolizhi.example.algorithm.linkedlist;


public class LinkedList {

    /**
     * 单向链表节点结构
     */
    public class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    /**
     * 双向链表节点结构
     */
    public class DoubleNode {
        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int data) {
            this.value = data;
        }
    }

    /**
     * 单向链表反转
     * @param head
     * @return
     */
    public static Node reverseLinkedList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;

            pre = head;
            head.next = pre;

            head = next;
        }
        return pre;
    }

    public static DoubleNode reverseDoubleList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;

            head.next = pre;
            head.last = next;
            pre = head;

            head = next;
        }
        return pre;
    }
}
