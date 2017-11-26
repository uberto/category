package com.gamasoft.category.functor;

import java.util.function.Function;

public class ReaderF<T> implements Functor<ReaderF, T> {
    @Override
    public <U> ReaderF<U> fMap(Function<T, U> f) {
        return null;
    }
}
