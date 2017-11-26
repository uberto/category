package com.gamasoft.category.monoid;

public class SumM implements Monoid<Integer> {

    @Override
    public Integer mAppend(Integer value1, Integer value2) {
        return value1 + value2;
    }

    @Override
    public Integer mEmpty() {
        return 0;
    }
}
