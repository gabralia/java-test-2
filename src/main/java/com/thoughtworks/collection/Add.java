package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        int start = leftBorder < rightBorder ? leftBorder :rightBorder;
        int end = leftBorder < rightBorder ? rightBorder : leftBorder;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        int start = leftBorder < rightBorder ? leftBorder :rightBorder;
        int end = leftBorder < rightBorder ? rightBorder : leftBorder;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
       return arrayList.stream().reduce(0,(result,item)->result+item*3+2);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item->{
            if(item % 2 == 1) return item*3+2;
            return item;
        }).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(item->item % 2 == 1).reduce(0,(result,item)->result+item*3+5);
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
