package com.gamasoft.category.applicative;

import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.collection.List;


public class ListA<T> implements Applicative<List, T> {

    List<T> list;

    public ListA(List<T> list) {
        this.list = list;
    }

    @Override
    public List<T> pure(T value) {
        return List.of(value);
    }

    @Override
    public List apply(List f) {
        return applyr(f);
    }


    public <U> List<U> applyr(List<Function1<T, U>> fa) {

        List<U> res = List.empty();

        for (T x : list) {
            List<U> fl = fa.map(f -> f.apply(x));
            res = res.appendAll(fl);
        }
        return res;
    }

    public <A, B> List<B> map2r(Function2<T, A, B> f, List<A> a) {
        List<Function1<T, B>> lf = a.map( x -> f.reversed().curried().apply(x));
        return applyr(lf);
    }


    @Override
    public <A, B> List<B> map2(Function2<T, A, B> f, List a) {
        return map2r(f, a);
    }



    @Override
    public <U> List<U> fMap(Function1<T, U> f) {
        return list.map(f);
    }
}
