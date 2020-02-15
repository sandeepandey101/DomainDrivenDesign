package com.org.jdevexperts.ddd;

import java.math.BigDecimal;

/**
 * // TODO Comment
 */
public enum OrderItemOperations implements OrderItemOperation {

  DISCOUNT {
    @Override
    public OrderItem apply(OrderItem orderItem) {
      return OrderItem.of(orderItem.getProduct(), orderItem.getQuantity(), orderItem.getAmount().multiply(BigDecimal.TEN));
    }
  }
}
