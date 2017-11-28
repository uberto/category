package com.gamasoft.category.functor;

import com.gamasoft.category.structure.Maybe;
import io.vavr.Function1;


public class MaybeF<T> implements Functor<Maybe, T> {


    @Override
    public <U> Maybe<U> fMap(Function1<T, U> f, Maybe container) {

        if (container.value != null)
            return Maybe.some(f.apply((T) container.value));
        else
            return Maybe.nothing();
    }


}
