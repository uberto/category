package com.gamasoft.category.functor;

import com.gamasoft.category.monoid.CommaStrM;
import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ListFTest {


    @Test
    void fmap() {

        List<Integer> ints = List.of(1, 2, 3, 4, 5);
        List<String> strList = new ListF<>(ints).fMap(String::valueOf);

        ListF<String> strF = new ListF<>(strList);
        String all =   strF.combine(new CommaStrM());
        assertThat(all).isEqualTo("1, 2, 3, 4, 5");

    }



}