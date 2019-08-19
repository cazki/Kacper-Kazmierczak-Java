package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String productName;
    private BigDecimal price;

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product(String productName, BigDecimal price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getProductName(), product.getProductName()) &&
                Objects.equals(getPrice(), product.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getPrice());
    }
}
