package com.gamasoft.category.functor;

import com.gamasoft.category.structure.Maybe;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaybeFTest {

    MaybeF<Integer> intFunctor = new MaybeF<>();

    @Test
    void fmap() {

        Maybe<Integer> five = Maybe.some(5);
        Maybe<Integer> nil = Maybe.nothing();

        Maybe<Integer> ten = intFunctor.fMap(x -> x * 2, five);
        Maybe<Integer> nilnil = intFunctor.fMap(x -> x * 2, nil);

        assertThat(ten).isEqualTo(Maybe.some(10));
        assertThat(nilnil).isEqualTo(Maybe.nothing());
    }

}