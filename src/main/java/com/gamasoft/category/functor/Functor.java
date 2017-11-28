package com.gamasoft.category.functor;

import io.vavr.Function1;


public interface Functor<TC, T> {  //T<?> or TC<T> don't compile

    <U> TC fMap(Function1<T, U> f, TC container);

}


