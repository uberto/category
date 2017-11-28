package com.gamasoft.category.applicative;

import com.gamasoft.category.functor.MaybeF;
import com.gamasoft.category.structure.Maybe;
import io.vavr.Function2;

public class MaybeA<T> extends MaybeF<T> implements Applicative<Maybe, T> {


    @Override
    public Maybe pure(T value) {
        if (value == null)
            return Maybe.nothing();
        return Maybe.some(value);
    }

    @Override
    public Maybe apply(Maybe f, Maybe a) {
        return null;
    }

    @Override
    public <U, V> Maybe map2(Function2<T, U, V> f, Maybe a, Maybe b) {
        return null;
    }
}
