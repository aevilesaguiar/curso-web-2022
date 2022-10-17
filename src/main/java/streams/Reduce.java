package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma= (ac,n)-> ac+n;

        int total = nums.stream().reduce(soma).get();

        System.out.println(total);

       Integer tota2=  nums.stream().reduce(10,soma);
        System.out.println(tota2);

        //O resultado foi um Optional de <Integer> por que pode ou não ter
        nums.stream()
                .filter(n->n>5)
                .reduce(soma)
                .ifPresent(System.out::println);

    }
}
