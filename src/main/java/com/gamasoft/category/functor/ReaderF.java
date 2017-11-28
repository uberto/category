package com.gamasoft.category.functor;

import io.vavr.Function1;

public class ReaderF<T> implements Functor<ReaderF, T> {

    @Override
    public <U> ReaderF fMap(Function1<T, U> f, ReaderF container) {
        return null;
    }
}
