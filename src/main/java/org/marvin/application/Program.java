package org.marvin.application;

import org.marvin.entities.Product;
import org.marvin.services.CalculationService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product a = new Product("sapato", 155.99);
        Product b = new Product("camiseta", 45.99);

        List<Product> list = Arrays.asList(a, b);

        Product x = CalculationService.max(list);
        System.out.println("Max:");
        System.out.println(x);
    }
}
