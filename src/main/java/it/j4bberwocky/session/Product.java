package it.j4bberwocky.session;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Product implements Serializable {
	
	private static final long serialVersionUID = -7258002018513999822L;
	
	private String description;
    private BigDecimal price;

    public Product(String description, BigDecimal price) {
        this.description = description;
        this.price = price;
    }
}
