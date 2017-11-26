package com.gamasoft.category.monoid;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EndofunctionMonoidTest {

    Monoid<Function<Integer, Integer>> endoMonoid = new Monoid<>(){

        @Override
        public Function<Integer, Integer> mAppend(Function<Integer, Integer> value1, Function<Integer, Integer> value2) {
            return x -> value2.apply( value1.apply(x));
        }

        @Override
        public Function<Integer, Integer> mEmpty() {
            return x -> x;
        }
    };

    @Test
    void compose() {
        Function<Integer, Integer> plus3 = x -> x + 3;
        Function<Integer, Integer> minus4 = x -> x - 4;
        Function<Integer, Integer> plus12 = x -> x + 12;

        List<Function<Integer, Integer>> l = List.of(plus3, minus4, plus12);

        Function<Integer, Integer> tot = endoMonoid.combine(l);

        assertThat(tot.apply(5)).isEqualTo(16);
        assertThat(tot.apply(-11)).isEqualTo(0);


    }
}
