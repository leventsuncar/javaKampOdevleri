package service.impl;

import entity.Discount;
import entity.Product;
import service.DiscountService;

public class DiscountServiceImpl implements DiscountService {
    @Override
    public void add(Discount discount) {
        System.out.println("İndirim eklendi");
    }

    @Override
    public void delete(Discount discount) {
        System.out.println("İndirim kaldırıldı");
    }

    @Override
    public void update(Discount discount) {
        System.out.println("İndirim düzenlendi");
    }
    @Override
    public void applyDiscount(Discount discount, Product product) {
        product.setLastPrice(product.getPrice()-(product.getPrice()* discount.getDiscountAmount()/100));
        System.out.println( product.getName()+" Ürüne yüzde "+discount.getDiscountAmount()+" indirim uygulandı.");
        System.out.println("Eski fiyat: "+product.getPrice());
        System.out.println("Yeni fiyat: "+product.getLastPrice());
    }
}
