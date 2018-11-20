package com.octopus.ti3;

import com.octopus.shared1.Shared1;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Dmitrii Ponomarev
 */
@Slf4j
public class App {
    public static void main(String[] args) {

        //the dependency for shared1 comes from ti-parent
        Shared1 shared = new Shared1();
        String transform = shared.transform("Just a long long long long long string...");
        log.info(transform);



    }
}
