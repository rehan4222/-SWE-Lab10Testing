package edu.miu.cs425;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayFlattener {
    public int[] flattenArray(int[][] arr) {
        if (Objects.isNull(arr)){
            return null;
        }
        List<Integer> resultList = new ArrayList<>();
        for (int[] ints : arr) {
            for (int anInt : ints) {
                resultList.add(anInt);
            }
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
