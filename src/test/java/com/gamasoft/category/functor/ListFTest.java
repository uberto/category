package com.gamasoft.category.functor;

import com.gamasoft.category.monoid.CommaStrM;
import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ListFTest {


    ListF<Integer> listIntFunctor = new ListF<>();
    ListF<String> listStrFunctor = new ListF<>();

    @Test
    void fmap() {

        List<Integer> ints = List.of(1, 2, 3, 4, 5);
        List<String> strList = listIntFunctor.fMap(String::valueOf, ints);

        String all =  listStrFunctor.combine(new CommaStrM(), strList);
        assertThat(all).isEqualTo("1, 2, 3, 4, 5");

    }



}