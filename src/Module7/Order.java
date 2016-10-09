package Module7;

import java.util.Currency;

public class Order {
    private long ID;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(long ID, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.ID = ID;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Order order = (Order) obj;

        if (ID != order.ID) return false;
        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (itemName != order.itemName) return false;
        if (shopIdentificator != order.shopIdentificator) return false;
        return user!=null;

    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + ID +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public long getId() {
        return ID;
    }

    public void setId(long id) {
        this.ID = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
