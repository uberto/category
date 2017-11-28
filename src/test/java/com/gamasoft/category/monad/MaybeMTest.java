package com.gamasoft.category.monad;

import com.gamasoft.category.structure.Maybe;

import io.vavr.collection.HashMap;
import io.vavr.collection.Map;

class MaybeMTest {

    MaybeM<Integer> maybeIntMonad = new MaybeM<>();

    Map<Integer, String> users = HashMap.of(1, "Joe", 2, "Fred", 3, "Mary");

    Maybe<String> getUser(Integer userId) {

        if (users.containsKey(userId)) {
            return Maybe.some(users.get(userId).getOrNull());
        } else {
            return Maybe.nothing();
        }
    }

}