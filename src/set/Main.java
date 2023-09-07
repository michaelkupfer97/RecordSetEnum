package set;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246

import static set.SetUtils.*;

public class Main {
    public static void main(String[] args) {
        SimpleSet<Integer> numbers1 = new SimpleSet<Integer>(5);
        SimpleSet<Integer> numbers2 = new SimpleSet<Integer>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(7);
        System.out.println(numbers1.contains(1));
        System.out.println(numbers2.remove(5));
        System.out.println(numbers1.isEmpty());
        System.out.println(numbers2.size());
        SimpleSet<Integer> numbers3 =union(numbers1,numbers2);
        print(numbers1);
        print(numbers2);
        print(numbers3);
        SimpleSet<Integer> numbers4 =intersection(numbers1,numbers2);
        SimpleSet<Integer> numbers5 =difference(numbers1,numbers2);
        SimpleSet<Integer> numbers6 =symmetricDifference(numbers1,numbers2);
        print(numbers4);
        print(numbers5);
        print(numbers6);
    }

    public static void print(SimpleSet set){
        for (int i =0; i<set.getElements().length && set.getElements()[i] != null;i++ ){
            System.out.print(set.getElements()[i]+",");
        }
        System.out.println();
    }
}