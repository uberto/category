package com.gamasoft.category.functor;


import java.util.function.Function;

public class StateF<T> implements Functor<StateF, T> {
    @Override
    public <U> StateF fMap(Function<T, U> f) {
        return null;
    }
}
