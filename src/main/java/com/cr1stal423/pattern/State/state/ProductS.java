package com.cr1stal423.pattern.State.state;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class ProductS {
    private ProductState state;

    public void request() {
        state.handleRequest();
    }
}
