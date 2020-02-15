package com.org.jdevexperts.ddd;

import com.google.common.collect.ForwardingList;

import java.util.List;

/**
 * // TODO Comment
 */
public class OrderItems extends ForwardingList<OrderItem> {

  private final List<OrderItem> items;

  private OrderItems(List<OrderItem> items) {
    this.items = items;
  }


  public static OrderItems of(List<OrderItem> items) {
    return new OrderItems(items);
  }


  @Override
  protected List<OrderItem> delegate() {
    return items;
  }
}
