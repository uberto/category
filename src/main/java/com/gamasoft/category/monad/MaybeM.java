package com.gamasoft.category.monad;

import com.gamasoft.category.applicative.MaybeA;
import com.gamasoft.category.structure.Maybe;
import io.vavr.Function1;

public class MaybeM<T> extends MaybeA<T> implements Monad<Maybe, T> {

    public <U> Maybe<U> bindK(Function1<T, Maybe<U>> f, Maybe<T> ma) {
        if (ma == Maybe.nothing()) {
            return Maybe.nothing();
        }
        return f.apply(ma.value);
    }

    @Override
    public <U> Maybe<U> bind(Function1<T, Maybe> f, Maybe ma) {
        Function1<T, Maybe<U>> ff = x -> f.apply(x);
        return bindK(ff, ma);
    }
}
