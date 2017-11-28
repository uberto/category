package com.gamasoft.category.monad;

import com.gamasoft.category.applicative.ListA;
import io.vavr.Function1;
import io.vavr.collection.List;

public class ListM<T> extends ListA<T> implements Monad<List, T> {

    public <U> List<U> bindK(Function1<T, List<U>> f, List<T> ma) {
        return ma.flatMap(x -> f.apply(x));
    }

    @Override
    public <U> List<U> bind(Function1<T, List> f, List ma) {
        Function1<T, List<U>> ff = x -> f.apply(x);
        return bindK(ff, ma);
    }
}
