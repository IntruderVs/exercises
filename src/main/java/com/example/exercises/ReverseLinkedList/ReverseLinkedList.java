package com.example.exercises.ReverseLinkedList;

import org.springframework.stereotype.Component;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
@Component
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode start = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = start;
            start = head;
            head = temp;
        }
        return start;
    }
}