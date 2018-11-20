package com.octopus.shared2;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;

/**
 * @author Dmitrii Ponomarev
 */
public class Shared2 {


    public ImmutableCollection<String> doSmth() {
        ImmutableCollection<String> c = ImmutableList.of("one", "two", "three");
        return c;
    }


}
