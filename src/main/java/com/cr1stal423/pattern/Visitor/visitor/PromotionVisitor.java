package com.cr1stal423.pattern.Visitor.visitor;

import com.cr1stal423.pattern.Visitor.model.Appliance;
import com.cr1stal423.pattern.Visitor.model.LaptopV;
import com.cr1stal423.pattern.Visitor.model.PhoneV;

public class PromotionVisitor implements ProductVisitor {

    @Override
    public void visit(PhoneV phone) {
        System.out.println("Телефон " + phone.getName() + " бере участь у акції: 1+1=3.");
    }

    @Override
    public void visit(LaptopV laptop) {
        System.out.println("Ноутбук " + laptop.getName() + " бере участь у акції: -20% при купівлі аксесуарів.");
    }

    @Override
    public void visit(Appliance appliance) {
        System.out.println("Побутова техніка " + appliance.getName() + " має акцію безкоштовної доставки.");
    }
}
