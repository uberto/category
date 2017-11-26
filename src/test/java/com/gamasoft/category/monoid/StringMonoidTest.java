package com.gamasoft.category.monoid;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringMonoidTest {

    Monoid<String> strM = new Monoid<String>(){
        @Override
        public String mAppend(String value1, String value2) {
            return value1 + value2;
        }

        @Override
        public String mEmpty() {
            return "";
        }
    };


    Monoid<String> notAstrM = new Monoid<String>(){
        @Override
        public String mAppend(String value1, String value2) {
            return value1 + "," + value2;
        }

        @Override
        public String mEmpty() {
            return "";
        }
    };

    @Test
    void compose() {
        List<String> l = List.of("It was a dark and stormy night".split(" "));

        assertThat(strM.combine(l)).isEqualTo("Itwasadarkandstormynight");

    }
}
