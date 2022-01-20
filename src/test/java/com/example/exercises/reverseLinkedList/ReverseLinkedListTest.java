package com.example.exercises.reverseLinkedList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReverseLinkedListTest {

    @Autowired
    private ReverseLinkedList reverseLinkedList;

    @Test
    void reverseList() {
        ListNode actual = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode expected = new ListNode(3, new ListNode(2, new ListNode(1)));

        ListNode listNode = reverseLinkedList.reverseList(actual);

        assertEquals(expected, listNode);
    }

    @Test
    void reverseListCount1() {
        ListNode actual = new ListNode(1);
        ListNode expected = new ListNode(1);

        ListNode listNode = reverseLinkedList.reverseList(actual);

        assertEquals(expected, listNode);
    }

    @Test
    void reverseListCount2() {
        ListNode actual = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(2, new ListNode(1));

        ListNode listNode = reverseLinkedList.reverseList(actual);

        assertEquals(expected, listNode);
    }

    @Test
    void reverseListCountEmpty() {
        assertNull(reverseLinkedList.reverseList(null));
    }
}