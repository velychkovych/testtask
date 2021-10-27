package main;

import java.io.IOException;

public interface MyArrayList {
    void addElem(String s);
    String getElemByIndex(int index);
    String deleteElemByIndex(int index);
    int deleteElemByValue(String elem) throws IOException;
    int findIndex(String elem);
    boolean exists(String elem);
    void print(String title);
}
