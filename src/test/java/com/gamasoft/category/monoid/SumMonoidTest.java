package com.gamasoft.category.monoid;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SumMonoidTest {

    private SumM sumMonoid = new SumM();

    @Test
    void monoidSum() {

        List<Integer> l = List.of(1,2,3,4);

        assertThat(sumMonoid.combine(l)).isEqualTo(10);

    }

    @Test
    void mEmpty() {

        for (int x = 0; x < 100; x++) {

            assertThat(sumMonoid.mAppend(x, sumMonoid.mEmpty())).isEqualTo(x);
        }

    }

    @Test
    void associativity() {

        for (int x = 0; x < 100; x++) {

            int y = x * 2 + 1;
            int z = x + 3;

            int z1 = sumMonoid.mAppend(x, sumMonoid.mAppend(y, z));
            int z2 = sumMonoid.mAppend(sumMonoid.mAppend(x, y), z);

            assertThat(z1).isEqualTo(z2);
        }

    }
}