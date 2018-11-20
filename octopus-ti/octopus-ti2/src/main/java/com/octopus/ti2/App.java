package com.octopus.ti2;

import com.octopus.shared1.Shared1;
import com.octopus.shared2.Shared2;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Dmitrii Ponomarev
 */
@Slf4j
public class App
{
    public static void main(String[] args) {

        //the dependency for shared1 comes from ti-parent
        Shared1 shared = new Shared1();
        String transform = shared.transform("Just a long long long long long string...");
        log.info(transform);

        //the dependency for shared2 specify only for ti2
        Shared2 shared2 = new Shared2();
        shared2.doSmth().forEach(log::info);

    }
}