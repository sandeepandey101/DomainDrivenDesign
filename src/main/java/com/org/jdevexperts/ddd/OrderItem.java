package com.org.jdevexperts.ddd;

import com.google.common.base.Preconditions;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * // TODO Comment
 */
public class OrderItem implements Serializable {
  private String product;
  private Integer quantity;
  private BigDecimal amount;


  private OrderItem(String product, Integer quantity, BigDecimal amount) {
    this.product = product;
    this.quantity = quantity;
    this.amount = amount;
  }


  public static OrderItem of(String product, Integer quantity, BigDecimal amount) {
    Objects.requireNonNull(product);
    Objects.requireNonNull(quantity);
    Objects.requireNonNull(amount);
    Preconditions.checkArgument(quantity > 0);
    return new OrderItem(product, quantity, amount);
  }

  public String getProduct() {
    return product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public BigDecimal getAmount() {
    return amount;
  }
}
