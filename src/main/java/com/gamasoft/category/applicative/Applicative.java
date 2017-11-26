package com.gamasoft.category.applicative;

import com.gamasoft.category.functor.Functor;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface Applicative<TC, T> extends Functor<TC, T> {

    TC pure(T value);

    TC apply(TC f, TC x );

    <A,B> TC map2(BiFunction<A,B,T> f, TC a, TC b);
}
