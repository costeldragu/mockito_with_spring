package com.mdc.tx;

public interface FooService {

    Foo getFoo(String fooName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);
}
