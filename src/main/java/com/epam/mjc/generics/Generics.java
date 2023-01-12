package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1 Refactor boxingMethod to use only parameterized lists.
    public List boxingMethod(String name) {
        List <String> firstList = new ArrayList<>();
        firstList.add(name);
        List <Object> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2 Refactor genericMethod, it should take any specific object and return it.
    public <T> T genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3 Refactor cloneMethod, it should take two lists and be able to place objects from producer to consumer list.
    public void cloneMethod(List <? extends Generics> consumer, List producer) {
        consumer.addAll(producer);
    }

}
