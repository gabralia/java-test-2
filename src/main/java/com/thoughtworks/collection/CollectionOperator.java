package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {

    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int currNumber = left;
        while (currNumber != right){
            list.add(currNumber);
            currNumber = currNumber + (left < right ? 1 : -1);
        }
        list.add(right);
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = getListByInterval(left , right);
        return list.stream().filter(item->item%2==0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
       return Arrays.stream(array).filter(item->item%2==0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> secondList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        return Arrays.stream(firstArray).filter(t-> secondList.contains(t))
                .boxed().collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> list = Arrays.stream(firstArray).collect(Collectors.toList());
        List<Integer> diff = Arrays.stream(secondArray).filter(t-> !Arrays.asList(firstArray).contains(t))
                .collect(Collectors.toList());
        list.addAll(diff);
        return list;

    }
}
