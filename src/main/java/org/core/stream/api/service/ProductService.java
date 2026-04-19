package org.core.stream.api.service;


import org.core.stream.api.model.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductService {
    public static void main(String[] args) {

        // Sample product list (like DB data)
        List<Product> products = Arrays.asList(
                new Product(1, "iPhone", "Electronics", 80000),
                new Product(2, "Laptop", "Electronics", 60000),
                new Product(3, "Shoes", "Fashion", 3000),
                new Product(4, "T-Shirt", "Fashion", 1500),
                new Product(5, "Watch", "Accessories", 7000)
        );

        // 1️⃣ Filter expensive products (> 5000)
        List<Product> expensive =
                products.stream()
                        .filter(p -> p.getPrice() > 5000) // filter condition
                        .toList();

        System.out.println("Expensive Products: " + expensive);

        // 2️⃣ Convert to product names (map transformation)
        List<String> names =
                products.stream()
                        .map(Product::getName) // extract only names
                        .toList();

        System.out.println("Product Names: " + names);

        // 3️⃣ Group products by category
        Map<String, List<Product>> grouped =
                products.stream()
                        .collect(Collectors.groupingBy(Product::getCategory));

        System.out.println("Grouped by Category: " + grouped);

        // 4️⃣ Calculate total price (aggregation)
        double totalPrice =
                products.stream()
                        .mapToDouble(Product::getPrice) // convert to double stream
                        .sum();

        System.out.println("Total Price: " + totalPrice);

        // 5️⃣ Sort products by price
        List<Product> sorted =
                products.stream()
                        .sorted(Comparator.comparing(Product::getPrice))
                        .toList();

        System.out.println("Sorted by Price: " + sorted);

        // 6️⃣ Find first expensive product
        Optional<Product> firstExpensive =
                products.stream()
                        .filter(p -> p.getPrice() > 5000)
                        .findFirst();

        firstExpensive.ifPresent(p ->
                System.out.println("First Expensive Product: " + p)
        );

        // 7️⃣ Convert to Map (id → name)
        Map<Integer, String> idNameMap =
                products.stream()
                        .collect(Collectors.toMap(
                                Product::getId,
                                Product::getName
                        ));

        System.out.println("ID → Name Map: " + idNameMap);

        // 8️⃣ Count products per category
        Map<String, Long> countByCategory =
                products.stream()
                        .collect(Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.counting()
                        ));

        System.out.println("Count by Category: " + countByCategory);
    }
}
