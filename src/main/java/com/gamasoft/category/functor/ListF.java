package com.gamasoft.category.functor;

import com.gamasoft.category.monoid.Monoid;
import io.vavr.Function1;
import io.vavr.collection.List;

public class ListF<T> implements Functor<List, T> {

    public T combine(Monoid<T> monoid, List<T> container){
        return monoid.combine(container);
    }

    @Override
    public <U> List<U> fMap(Function1<T, U> f, List container) {
        //Java allows us to specify List<U> as result but not in the params
        return container.map(f);
    }

}
