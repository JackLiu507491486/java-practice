package com.JAVASE_PRO.genericityDemo.interfaceDemo;

public interface  interfaceDemo<T> {
    void add(T t);
    void delete(int id);
    void update(T t);
    T search(int id);
}
