package com.puppycrawl.tools.checkstyle.checks.coding.prefermethodreference;

import java.util.function.BiFunction;
import java.util.function.Function;
import javax.annotation.Nonnull;

/**
 * Config: default
 * Method calls cases
 */
public class InputPreferMethodReferenceMethodCallsDefault {

    Function<Long, Boolean> f4 = a -> super.equals(a); // violation
    Function<Object, Object> f5 = a -> this.method(a); // violation
    Function<String, String> f10 = a -> ((a)).trim(); // violation
    Function<String, String> f14 = a -> "das".concat(a); // violation
    Function<Object, Integer> func = (@Nonnull Object obj) -> obj.hashCode(); // violation
    Function<String, String> f17 = (String String) -> String.trim(); // violation
    BiFunction<String, Long, Boolean> f19 =
        (String String, Long Long) -> String.equals(Long); // violation

    Object method(Object p){
        return p;
    }
}
