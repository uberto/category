package com.gamasoft.category.functor;

import java.util.function.Function;

public class MaybeF<T> implements Functor<MaybeF, T> {

    private T value;

    private MaybeF(T value) {
        this.value = value;
    }

    static <T> MaybeF<T> some(T value){
        return new MaybeF<>(value);
    }

    static <T> MaybeF<T> nothing(){
        return new MaybeF<>(null);
    }

    @Override
    public <U> MaybeF<U> fMap(Function<T, U> f) {

        if (value != null)
            return some(f.apply(value));
        else
            return nothing();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaybeF<?> maybeF = (MaybeF<?>) o;

        return value != null ? value.equals(maybeF.value) : maybeF.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
