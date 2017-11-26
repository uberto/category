package com.gamasoft.category.applicative;

import com.gamasoft.category.functor.ListF;
import com.gamasoft.category.monoid.CommaStrM;
import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ListATest {

    @Test
    void fmap() {

        List<Integer> ints1 = List.of(1, 2, 3);
        List<Integer> ints2 = List.of(4, 5);
        List<Integer> ml = new ListA<>(ints1).map2r((x, y) -> x * y, ints2);

        assertThat(ml.length()).isEqualTo(6);
        assertThat(ml.toString()).isEqualTo("List(4, 5, 8, 10, 12, 15)");

    }

}