package Task7;

public class Pair {
    private Product product;
    private int amount;

    public Pair(Product product, int amount)
    {
        this.product = product;
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
