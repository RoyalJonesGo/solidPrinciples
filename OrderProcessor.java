public class OrderProcessor{
    private OrderCalculator calculator;
    private OrderPlacer placer;
    private InvoiceGenerator invoiceGenerator;
    private EmailNotifier emailNotifier;

    public OrderProcessor(OrderCalculator calculator, OrderPlacer placer, InvoiceGenerator invoiceGenerator, EmailNotifier emailNotifier){
        this.calculator = calculator;
        this.placer = placer;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    public void calculateTotal(double price, int quantity){
        calculator.calculateTotal(price, quantity);
    }

    public void placeOrder(String customerName, String address){
        placer.placeOrder(customerName, address);
    }

    public void generateInvoice(String fileName){
        if (invoiceGenerator != null) {
            invoiceGenerator.generateInvoice(fileName);
        }
    }

    public void sendEmailNotification(String email){
        if (emailNotifier != null){
            emailNotifier.sendEmailNotification(email);
        }
    }
}
