package application.program2.entities;

public class OrderItem {

    private Product product;
    private Integer quantity;

    public OrderItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    /**
     * METHODS
     */
    public Double subTotal() {
        return quantity * product.getPrice().doubleValue();
    }
}
