package com.gamasoft.category.functor;

import com.gamasoft.category.monoid.Monoid;
import io.vavr.collection.List;

import java.util.function.Function;

public class ListF<T> implements Functor<List, T> {

    private List<T> list;

    public ListF(List<T> list) {
        this.list = list;
    }

    public T combine(Monoid<T> monoid){
        return monoid.combine(list);
    }

    @Override
    public <U> List<U> fMap(Function<T, U> f) {
        //Java allows us to specify List<U> as result but not in the params
        return list.map(f);
    }

}
