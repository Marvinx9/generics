package org.marvin.application;

import org.marvin.entities.Product;
import org.marvin.utils.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

// consumer
public class ProgramConsumer {

        public static void main(String[] args) {
            Product p1 = new Product("Tv", 499.0);
            Product p2 = new Product("Mesa", 99.0);
            Product p3 = new Product("Violão", 500.0);

            List<Product> products = new ArrayList<>();

            products.add(p1);
            products.add(p2);
            products.add(p3);

//          using implementation consumer
//          products.forEach(new PriceUpdate());

//          invocation method by reference
            products.forEach(Product::staticPriceUpdate);

            products.forEach(System.out::println);
        }
}


