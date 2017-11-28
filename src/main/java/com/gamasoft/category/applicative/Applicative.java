package com.gamasoft.category.applicative;

import com.gamasoft.category.functor.Functor;
import io.vavr.Function2;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface Applicative<TC, T> extends Functor<TC, T> {

    TC pure(T value);

    TC apply(TC f, TC a);  //TC<B> apply(TC<Function<T, B> f)

    <U,V> TC map2(Function2<T,U,V> f, TC a, TC b);
}
