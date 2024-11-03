package com.cr1stal423.pattern.Visitor.visitor;

import com.cr1stal423.pattern.Visitor.model.Appliance;
import com.cr1stal423.pattern.Visitor.model.LaptopV;
import com.cr1stal423.pattern.Visitor.model.PhoneV;

public class DiscountVisitor implements ProductVisitor {

    @Override
    public void visit(PhoneV phone) {
        System.out.println("Знижка на телефон: " + phone.getName() + " - " + (phone.getPrice() * 0.1) + " грн");
    }

    @Override
    public void visit(LaptopV laptop) {
        System.out.println("Знижка на ноутбук: " + laptop.getName() + " - " + (laptop.getPrice() * 0.15) + " грн");
    }

    @Override
    public void visit(Appliance appliance) {
        System.out.println("Знижка на побутову техніку: " + appliance.getName() + " - " + (appliance.getPrice() * 0.05) + " грн");
    }
}

