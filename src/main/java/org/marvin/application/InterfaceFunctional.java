package org.marvin.application;

import org.marvin.entities.Product;
import org.marvin.services.MyComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Interface funcional
public class InterfaceFunctional {
    public static void main(String[] args) {
        Product p1 = new Product("Tv", 499.0);
        Product p2 = new Product("Mesa", 299.0);
        Product p3 = new Product("Violão", 500.0);

        List<Product> products = Arrays.asList(p1, p2, p3);

        for(Product p : products) {
            System.out.println(p);
        }

//        form of not comparator interface
//        Collections.sort(products);

//        order by name of product
        products.sort(new MyComparator());

        System.out.println("Depois do Sort");

        for(Product p : products) {
            System.out.println(p);
        }
    }
}
