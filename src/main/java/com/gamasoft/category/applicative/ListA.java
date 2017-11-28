package com.gamasoft.category.applicative;

import com.gamasoft.category.functor.ListF;
import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.collection.List;


public class ListA<T> extends ListF<T> implements Applicative<List, T> {

    @Override
    public List<T> pure(T value) {
        return List.of(value);
    }

    @Override
    public List apply(List f, List a) {
        return applyK(f, a);
    }

    @Override
    public <U, V> List map2(Function2<T, U, V> f, List a, List b) {
        return map2K(f, a, b);
    }


    public <U> List<U> applyK(List<Function1<T, U>> fa, List<T> list) {

        List<U> res = List.empty();

        for (T x : list) {
            List<U> fl = fa.map(f -> f.apply(x));
            res = res.appendAll(fl);
        }
        return res;
    }

    public <U, V> List<V> map2K(Function2<T, U, V> f, List<T> a, List<U> b) {
        List<Function1<T, V>> lf = b.map( x -> f.reversed().curried().apply(x));
        return applyK(lf, a);
    }



}
