package com.org.jdevexperts.ddd;

import java.io.Serializable;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Objects;

/**
 *  // minimize mutability
 */
public class OrderNumber implements Serializable, Formattable {

  private final Integer value;


  private OrderNumber(Integer value) {
    this.value = value;
  }


  public static OrderNumber of(Integer value) {
    return new OrderNumber(value);
  }

  // dont use method getValue as it may expose internal of OrderNumber class
  // prefer to have 
  public Integer toInteger() {
    return value;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof OrderNumber) {
      OrderNumber other = (OrderNumber) obj;
      return Objects.equals(this.value,other.value);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }

  @Override
  public String toString() {
    return "OrderNumber{" +
        "value=" + value +
        '}';
  }

  @Override
  public void formatTo(Formatter formatter, int flags, int width, int precision) {
    formatter.format("%d",this.value);
  }
}
