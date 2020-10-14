package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream()
                .map(Integer::doubleValue)
                .reduce(Double::sum)
                .map(aDouble -> aDouble / arrayList.size())
                .orElse(0.0);
    }

    public int getMaxValue() {
        return arrayList.stream()
                .reduce(Math::max)
                .orElse(0);
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }
}
