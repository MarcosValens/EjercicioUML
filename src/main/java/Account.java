import java.util.Date;
import java.util.List;

public class Account {
    String id;
    Address billing_address;
    boolean is_closed;
    Date open;
    Date closed;
    List<Order> orders;
    List<Payment>payments;
}
