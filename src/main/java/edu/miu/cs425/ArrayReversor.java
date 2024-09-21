package edu.miu.cs425;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ArrayReversor {
    private final ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService){
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] arr) {
        if (Objects.isNull(arr)){
            return null;
        }
        int[] flattenedArray = arrayFlattenerService.flattenArray(arr);
        List<Integer> resultList;
        resultList = Arrays.stream(flattenedArray).boxed().collect(Collectors.toList());
        Collections.reverse(resultList);
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
