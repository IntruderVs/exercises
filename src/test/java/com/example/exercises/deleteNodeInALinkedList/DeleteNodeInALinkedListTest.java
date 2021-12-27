package com.example.exercises.deleteNodeInALinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DeleteNodeInALinkedListTest {
    private ListNode listNode1;

    @Autowired
    DeleteNodeInALinkedList deleteNodeInALinkedList;

    @BeforeEach
    void beforeEach() {
        listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
    }

    @Test
    void deleteNodeMiddle() {
        deleteNodeInALinkedList.deleteNode(listNode1.next);

        ListNode expected1 = new ListNode(1);
        expected1.next = new ListNode(3);

        assertEquals(expected1, listNode1);
    }

    @Test
    void deleteNodeLast() {
        assertThrows(NullPointerException.class, () -> deleteNodeInALinkedList.deleteNode(listNode1.next.next));
    }

    @Test
    void deleteNodeFirst() {
        deleteNodeInALinkedList.deleteNode(listNode1);

        ListNode expected1 = new ListNode(2);
        expected1.next = new ListNode(3);

        assertEquals(expected1, listNode1);
    }
}