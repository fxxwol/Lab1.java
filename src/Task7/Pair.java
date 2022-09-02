package Task7;

public class Pair {
    private Product product;
    private int amount;

    public Pair(final Product product, final int amount)
    {
        this.product = product;
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }
}
