package com.octopus.shared1;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Dmitrii Ponomarev
 */
public class Shared1 {

    public String  transform(String input){
        return StringUtils.abbreviate(input,input.length()/2);
    }
}
