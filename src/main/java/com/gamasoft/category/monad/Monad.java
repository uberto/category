package com.gamasoft.category.monad;

import com.gamasoft.category.applicative.Applicative;
import io.vavr.Function1;

public interface Monad<TC, T> extends Applicative<TC, T> {

    <U> TC bind(Function1<T, TC> f, TC ma); // TC<B> bind(Function1<T, TC<B>>, TC<T>)

}
