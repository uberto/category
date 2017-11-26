package com.gamasoft.category.functor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaybeFTest {

    @Test
    void fmap() {

        MaybeF<Integer> five = MaybeF.some(5);
        MaybeF<Integer> nil = MaybeF.nothing();

        MaybeF<Integer> ten = five.fMap(x -> x * 2);
        MaybeF<Integer> nilnil = nil.fMap(x -> x * 2);

        assertThat(ten).isEqualTo(MaybeF.some(10));
        assertThat(nilnil).isEqualTo(MaybeF.nothing());
    }

}