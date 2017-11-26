package com.gamasoft.category.functor;


import io.vavr.Function1;

import java.util.function.Function;

public class StateF<T> implements Functor<StateF, T> {
    @Override
    public <U> StateF fMap(Function1<T, U> f) {
        return null;
    }
}
