package org.example.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Homework {

    public static void main(String[] args) {
        // 1. Создать список объектов типа Notebook
        // Отсортировать его тремя способами:
        // 1.1 по ОЗУ (ram)
        // 1.2 по цене (price)
        // 1.3 сначала по ram, потом по price (если ram не равны, сортируем по ним; если равны, то по цене)


        List<Notebook> noteBooks = new ArrayList<>();

        Notebook noteBook1 = new Notebook("Asus", 10, 100);
        noteBooks.add(noteBook1);
        Notebook noteBook2 = new Notebook("Huawei",5, 150);
        noteBooks.add(noteBook2);
        Notebook noteBook3 = new Notebook("Apple", 15, 200);
        noteBooks.add(noteBook3);
        Notebook noteBook4 = new Notebook("HP", 20, 200);
        noteBooks.add(noteBook4);
        Notebook noteBook5 = new Notebook("Samsung",20, 190);
        noteBooks.add(noteBook5);
        
        // 1.1
        Comparator<Notebook> RamComparator = new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                if (o1.getRam() - o2.getRam() != 0){
                    return o1.getRam() - o2.getRam();
                } else{
                return 0;
                }
            }   
        };

        // 1.2
        Comparator<Notebook> PriceComparator = new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                if (o1.getPrice() - o2.getPrice() != 0){
                    return (int)o1.getPrice() - (int)o2.getPrice();
                } else{
                return 0;
                }
            }   
        };
     
        // 1.3
        Comparator<Notebook> RamPriceComparator = new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                if (o1.getRam() - o2.getRam() != 0) {
                    return o1.getRam() - o2.getRam();
                }
                else{
                    return (int)o1.getPrice() - (int)o2.getPrice();
                }
            }   
        };

        Collections.sort(noteBooks, RamComparator);
        for (Notebook notebook : noteBooks) {
            System.out.println(notebook.getCompany() + " -  Ram: " + notebook.getRam() + 
            "; Price: "  + notebook.getPrice());
        }

        System.out.println("\n");

        Collections.sort(noteBooks, PriceComparator);
        for (Notebook notebook : noteBooks) {
            System.out.println(notebook.getCompany() + " -  Ram: " + notebook.getRam() + 
            "; Price: "  + notebook.getPrice());
        }
        
        System.out.println("\n");

        Collections.sort(noteBooks, RamPriceComparator);
        for (Notebook notebook : noteBooks) {
            System.out.println(notebook.getCompany() + " -  Ram: " + notebook.getRam() + 
            "; Price: "  + notebook.getPrice());
        }
             

    //     // 2. Реализовать итератор для массива
        int[] source = {1, 2, 3, 4, 5, 6, 7};
        
        Iterator<Integer> intArrayIterator = new IntArrayIterator(source);
        while (intArrayIterator.hasNext()) {
            // FIXME: 20.01.2023 Должно работать!
            System.out.println(intArrayIterator.next());
        }
    }


    private static class IntArrayIterator implements Iterator<Integer> {

        private final int[] source;
        private int cursor = 0;

        public IntArrayIterator(int[] source) {
        this.source = source;
    }

        @Override
        public boolean hasNext() {
            return cursor <= source.length - 1;
        }

        @Override
        public Integer next() {
            int nextInteger = source[cursor];
            cursor ++;
            return nextInteger;
        }
    }
}

        





