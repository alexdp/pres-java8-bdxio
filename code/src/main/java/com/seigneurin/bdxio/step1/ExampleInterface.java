package com.seigneurin.bdxio.step1;

@FunctionalInterface
public interface ExampleInterface {

    void doSomething();

    default int methodWithDefaultImpl() {
        return 0;
    }

}