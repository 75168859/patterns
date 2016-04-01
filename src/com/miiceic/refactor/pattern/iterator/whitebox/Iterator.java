package com.miiceic.refactor.pattern.iterator.whitebox;
public interface Iterator
{
    void first();

    void next();

    boolean isDone();

    Object currentItem();
}