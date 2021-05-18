package com.ds;

import java.util.*;
import java.util.function.Function;

public class Collectionstest {

    public static void main(String[] str){
        Comparator <Book> compareByAuthor = ( o1, o2)->{return o1.author.compareTo(o2.author);};
        Comparator <Book> compareByPrice = ( o1, o2)->{return Integer.compare(o1.price,o2.price);};
        Comparator<Book> comparatorByField = Comparator.comparing(obj->obj.author);
        Book b1= new Book();
        List<Book> list = new ArrayList<Book>();
        list.add(b1);
        list.sort(Comparator.comparing((Book obj)->obj.author).thenComparing((Book obj)->obj.price));
        Function<String, String>  functionalInterface = (name)->{return name.toUpperCase();};
        Function<String, String>  concat = (name)->{return name.concat("default").toUpperCase();};
        System.out.print(functionalInterface.andThen(concat).apply("java9"));
    }

    static class Book implements Comparable<Book>{
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return id == book.id &&
                    price == book.price &&
                    Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, author, price);
        }

        int id;
        String author;
        int price;

        @Override
        public int compareTo(Book o) {
            return 0;
        }
    }
}

