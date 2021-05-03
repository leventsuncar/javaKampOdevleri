package service.impl;

import entity.Discount;
import entity.Product;
import service.ProductService;

public class ProductServiceImpl implements ProductService {
    @Override
    public void add(Product product) {
        System.out.println("Oyun eklendi: "+product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Oyun silindi");
    }


}
