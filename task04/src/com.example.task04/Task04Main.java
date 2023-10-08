package com.example.task04;

import com.sun.security.auth.NTSidUserPrincipal;
import jdk.internal.joptsimple.internal.SimpleOptionNameMap;
import org.graalvm.compiler.hotspot.stubs.StubOptions;
import org.graalvm.compiler.phases.tiers.SuitesProvider;

public class Task04Main {
    public static void main(String[] args) {
        from0to10000();
    }

    static void from0to10000() {
        for (int i = 0; i < 10000; i++){
            System.out.println(i);
        }
    }

}