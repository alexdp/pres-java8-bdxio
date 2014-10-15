package com.seigneurin.bdxio.step2;

@FunctionalInterface
public interface Creator<T> {

    T create(String firstName, String lastName);

}