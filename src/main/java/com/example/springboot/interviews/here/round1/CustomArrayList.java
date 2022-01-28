package com.example.springboot.interviews.here.round1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * Implementation of custom Array List
 * @param <E>
 */
public class CustomArrayList<E> implements Iterable<E> {
    private Object[] array;
    private static final int INITIAL_CAPACITY = 16;
    private int size;
    private static final int MAX_CAPACITY = Integer.MAX_VALUE;
    private static final double LOAD_FACTOR = 0.75d;
    private static int modCount = 0;

    public CustomArrayList() {
        array = new Object[INITIAL_CAPACITY];
    }

    /** Adds element in Custom Array List
     * @param element element to be added
     * @return true if element is added
     */
    public boolean add(E element) {
        modCount++;
        if ((int)(array.length * LOAD_FACTOR) == size) {
            array = growArraySize();
        }
        array[size] = element;
        size++;
        return true;
    }

    private E[] growArraySize() {
        int currentSize = array.length;
        int newSize = currentSize + (currentSize / 2);
        if (newSize >= MAX_CAPACITY) {
            throw new OutOfMemoryError();
        }
        return (E[]) Arrays.copyOf(array, newSize);
    }

    /**
     * Returns iterator for the custom Array List
     * @return
     */
    @Override
    public Iterator<E> iterator() {
        return new CustomIterator();
    }

    /**
     * Removes element at specified index only if index is valid
     * @param index
     * @return element removed from list
     */
    public E remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        E item = null;
        if (index <= size - 1) {
            item = (E) array[index];
            removeGracefully(index);
            size--;
        }
        if (size < (array.length - (array.length / 2))) {
            array = shrinkArraySize();
        }
        modCount++;
        return item;
    }

    /**
     * Returns element at the specified index
     * @param index valid index
     * @return Element at specified index
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) array[index];
    }

    private E[] shrinkArraySize() {
        int oldSize = array.length;
        int newSize = array.length - (array.length / 2);
        return (E[]) Arrays.copyOf(array, newSize);
    }

    private void removeGracefully(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
    }

    /**
     * Returns Size of the List
     * @return size
     */
    public int size() {
        return size;
    }

    private class CustomIterator implements Iterator<E> {
        int currentIndex;
        int initialSize = modCount;
        int lastIndex = -1;

        CustomIterator() {

        }

        @Override
        public boolean hasNext() {
            return currentIndex != size;
        }

        @Override
        public E next() {
            int i = currentIndex;
            if (i >= size) {
                throw new NoSuchElementException();
            }
            lastIndex=currentIndex;
            currentIndex=i+1;
            return (E)array[i];
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super E> action) {
            Iterator.super.forEachRemaining(action);
        }
    }
}
