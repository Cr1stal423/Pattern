package com.cr1stal423.pattern.Visitor.visitor;

import com.cr1stal423.pattern.Visitor.model.Appliance;
import com.cr1stal423.pattern.Visitor.model.LaptopV;
import com.cr1stal423.pattern.Visitor.model.PhoneV;

public interface ProductVisitor {
    void visit(PhoneV phone);
    void visit(LaptopV laptop);
    void visit(Appliance appliance);
}
