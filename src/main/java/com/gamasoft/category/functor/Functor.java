package com.gamasoft.category.functor;

import io.vavr.collection.List;

import java.util.function.Function;


public interface Functor<TC, T> {  //T<?> or TC<T> don't compile

    <U> TC fMap(Function<T, U> f);

}


