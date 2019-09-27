import java.util.Date;
import java.util.List;

public class Order {
    String number;
    Date ordered;
    Date shipped;
    Address shipped_to;
    Order_Status order_status;
    Real total;
    List<Line_Item> line_items;
    List<Payment> payments;
}
