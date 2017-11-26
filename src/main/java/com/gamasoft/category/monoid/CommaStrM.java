package com.gamasoft.category.monoid;

public class CommaStrM implements Monoid<String> {
    @Override
    public String mAppend(String value1, String value2) {
        if (mEmpty().equals(value1))
            return value2;
        if (mEmpty().equals(value2))
            return value1;
        return value1 + ", " + value2;
    }

    @Override
    public String mEmpty() {
        return "";
    }
}
