package com.org.jdevexperts.ddd;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * // TODO Comment
 */
public class Order implements Serializable {

  private Long orderId;

  private List<OrderItem> orderItems = Lists.newLinkedList();
  private OrderNumber orderNumber;

  private Order(OrderNumber orderNumber) {
    this.orderNumber = orderNumber;
  }

  public static Order of(OrderNumber orderNumber) {
    return new Order(orderNumber);
  }


  public void apply(OrderItemOperation orderItemOperation) {
    this.orderItems = orderItems.stream().map(orderItemOperation).collect(Collectors.toList());
  }

  public void addOrderItem(OrderItem item) {
    Preconditions.checkNotNull(item);
    orderItems.add(item);
  }

  public OrderItems items() {
    return OrderItems.of(orderItems);
  }


}
