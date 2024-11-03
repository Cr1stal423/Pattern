package com.cr1stal423.pattern.Visitor.service;

import com.cr1stal423.pattern.Visitor.model.ProductV;
import com.cr1stal423.pattern.Visitor.visitor.DiscountVisitor;
import com.cr1stal423.pattern.Visitor.visitor.PromotionVisitor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceV {

    public void applyDiscounts(List<ProductV> products) {
        DiscountVisitor discountVisitor = new DiscountVisitor();
        products.forEach(product -> product.accept(discountVisitor));
    }

    public void applyPromotions(List<ProductV> products) {
        PromotionVisitor promotionVisitor = new PromotionVisitor();
        products.forEach(product -> product.accept(promotionVisitor));
    }
}
