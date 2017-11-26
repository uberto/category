package com.gamasoft.category.monoid;

import io.vavr.collection.List;

public interface Monoid<T> {

    T mAppend(T value1, T value2);

    T mEmpty();

    default T combine(List<T> xs){
        return combine2(xs, mEmpty());
    }

    default T combine2(List<T> xs, T initial){

        if (xs.isEmpty())
            return initial;

        return combine2(xs.tail(), mAppend(initial, xs.head()));
    }
}
