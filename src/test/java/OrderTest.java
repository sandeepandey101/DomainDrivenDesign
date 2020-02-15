import com.org.jdevexperts.ddd.Order;
import com.org.jdevexperts.ddd.OrderItem;
import com.org.jdevexperts.ddd.OrderItemOperations;
import com.org.jdevexperts.ddd.OrderNumber;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * // TODO Comment
 */
public class OrderTest {

  @Test
  public void orderOf() {

    Order order = Order.of(OrderNumber.of(2));
    order.addOrderItem(OrderItem.of("abc", 2, BigDecimal.TEN));
    order.apply(OrderItemOperations.DISCOUNT);

  }
}
