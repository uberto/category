package com.gamasoft.category.applicative;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ListATest {

    ListA<Integer> intAppli = new ListA<>();

    @Test
    void fmap() {

        List<Integer> ints1 = List.of(1, 2, 3);
        List<Integer> ints2 = List.of(4, 5);
        List<Integer> ml = intAppli.map2K((x, y) -> x * y, ints2, ints1);

        assertThat(ml.length()).isEqualTo(6);
        assertThat(ml.toString()).isEqualTo("List(4, 8, 12, 5, 10, 15)");

    }

}