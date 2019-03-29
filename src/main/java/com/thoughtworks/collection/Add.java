package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.LinkedList;
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
        List<Integer> list =  arrayList.stream().filter(item->item % 2 == 0).collect(Collectors.toList());
        if(list.size() % 2 == 1) return list.get((list.size()-1)/2);
        return (list.get((list.size()-1)/2) + list.get((list.size()-1)/2 + 1))/2;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        List<Integer> evenList= arrayList.stream().filter(item->item % 2 == 0).collect(Collectors.toList());
        int sum = evenList.stream().reduce(0,(result,item)->result+item);
        return sum / evenList.size();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> evenList= arrayList.stream().filter(item->item % 2 == 0).collect(Collectors.toList());
        return evenList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(item->item % 2 == 0).distinct().collect(Collectors.toList());

    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> list= arrayList.stream().filter(item->item % 2 == 0).sorted().collect(Collectors.toList());
        List<Integer> oddList= arrayList.stream().filter(item->item % 2 == 1).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        list.addAll(oddList);
        return list;

    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < arrayList.size()-1; i++) {
            list.add((arrayList.get(i)+arrayList.get(i+1))*3);
        }
        return list;
    }
}
