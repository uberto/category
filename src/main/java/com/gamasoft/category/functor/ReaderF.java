package com.gamasoft.category.functor;

import io.vavr.Function1;

import java.util.function.Function;

public class ReaderF<T> implements Functor<ReaderF, T> {
    @Override
    public <U> ReaderF<U> fMap(Function1<T, U> f) {
        return null;
    }
}
