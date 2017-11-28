package com.gamasoft.category.structure;

import com.gamasoft.category.functor.MaybeF;

public class Maybe<T> {
    final public T value;

    private Maybe(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Maybe<?> maybe = (Maybe<?>) o;

        return value != null ? value.equals(maybe.value) : maybe.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    public static <T> Maybe<T> some(T value){
        return new Maybe<>(value);
    }

    public static <T> Maybe<T> nothing(){
        return new Maybe<>(null);
    }


}
