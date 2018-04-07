package com.nvankhoiws.singlylinkedlist.component;

public interface IList<T> {

    /**
     *
     * @return the size of the list
     */
    int size();

    /**
     * Append an element to the existing list
     * @param data
     * @return size of the list after appending
     */
    int append(T data);

    /**
     * Remove the last element (or tail) in the existing list
     * @return the size of list after remove the tail
     */
    int removeTail();

    /**
     * Remove any element which has value greater than (not equal) value of parameter
     * @param data
     * @return the size of list after remove such element
     */
    int removeIfGreaterThan(T data);
}
