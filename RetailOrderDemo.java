class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

public class RetailOrderDemo {
    public static void main(String[] args) {
        Order o = new Order(101, "2025-09-20");
        System.out.println(o.getOrderStatus());

        ShippedOrder s = new ShippedOrder(102, "2025-09-21", "TRK12345");
        System.out.println(s.getOrderStatus());

        DeliveredOrder d = new DeliveredOrder(103, "2025-09-22", "TRK54321", "2025-09-24");
        System.out.println(d.getOrderStatus());
    }
}
