package com.nvankhoiws.singlylinkedlist.component.implement;

import com.nvankhoiws.singlylinkedlist.component.Node;
import com.nvankhoiws.singlylinkedlist.component.IList;

public class SinglyLinkedList <T extends Comparable<T>> implements IList<T> {

    private Node root;
    private int size;

    @Override
    public final int size() {
        return this.size;
    }

    @Override
    public final int append(T data) {
        size++;
        if (root == null) {
            this.root = new Node(data);
        } else {
            insertDataAtEnd(data, root);
        }
        return size();
    }

    private final void insertDataAtEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertDataAtEnd(data, node.getNextNode());
        } else {
            Node newNode = new Node(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public final int removeTail() {
        if (size() > 0) {
            if (size() == 1) {
                root = null;
            } else {
                deleteDataAtEnd(root, root.getNextNode());
            }
            size--;
        }
        return size();
    }

    private final void deleteDataAtEnd(Node node, Node nextNode) {
        if (nextNode.getNextNode() == null){
            node.setNextNode(null);
        } else {
            deleteDataAtEnd(nextNode, nextNode.getNextNode());
        }
    }

    @Override
    public final int removeIfGreaterThan(T data) {
        if (root != null) {
            if (root.getData().compareTo(data) > 0) {
                size--;
                Node removed  = root;
                root = root.getNextNode();
                removeIfGreaterThan(data);
            } else {
                removeByTraversing(data, root, root.getNextNode());
            }
        }
        return size();
    }

    private final void removeByTraversing(T data, Node previousNode, Node currentNode) {
        if (currentNode != null) {
            Node nextNode = currentNode.getNextNode();
            if (currentNode.getData().compareTo(data ) > 0) {
                previousNode.setNextNode(nextNode);
                size--;
                removeByTraversing(data, previousNode, nextNode);
            } else {
                removeByTraversing(data, currentNode, nextNode);
            }
        }
        return;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        appendToString(sb, root);
        sb.append("]");
        return sb.toString();
    }

    private void appendToString(StringBuilder sb, Node node) {
        if (node == null) return;
        sb.append(node.getData()).append(" ");
        appendToString(sb, node.getNextNode());
    }
}
