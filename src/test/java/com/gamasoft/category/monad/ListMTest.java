package com.gamasoft.category.monad;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ListMTest {

    ListM<Integer> listIntMonad = new ListM<>();


    List<Integer> countDown(Integer start){
        List<Integer> res = List.of(start);
        //res.fold(start, )
        int x = start - 1;
        while (x > 0){
            res = res.append(x);
            x--;
        }
        return res;
    }

    @Test
    void bind() {
        List<Integer> ints = List.of(3, 10);
        List<Integer> multiCountDown = listIntMonad.bind(this::countDown, ints);

        assertThat(multiCountDown.toString()).isEqualTo("List(3, 2, 1, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)");

    }


}