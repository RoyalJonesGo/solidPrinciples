public class OrderTest{
    public static void main(String[] args){
        OrderCalculator calculator = new DefaultOrderCalculator();
        OrderPlacer placer = new DefaultOrderPlacer();
        InvoiceGenerator invoiceGenerator = new DefaultInvoiceGenerator();
        EmailNotifier emailNotifier = new DefaultEmailNotifier();

        OrderProcessor order = new OrderProcessor(calculator, placer, invoiceGenerator, emailNotifier);

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");
        order.generateInvoice("order_123.pdf");
        order.sendEmailNotification("johndoe@example.com");

        // example with no invoice and email
        OrderProcessor basicOrder = new OrderProcessor(calculator, placer, null, null);
        basicOrder.calculateTotal(15.0, 1);
        basicOrder.placeOrder("Jane Smith", "456 Oak Ave");
    }
}
