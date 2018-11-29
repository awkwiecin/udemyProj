package pl.awkwiecin.udemy.solutions.homeworkClassAndObject;

import pl.awkwiecin.udemy.classAndObject.Client;

public class Invoice {
    private String product;
    private double price;
    private int quantity;
    private String bankAccountNumber;
    private Client client;

    private double totalPrice = calculateTotalPrice(price, quantity);
    private double taxToPay = calculateTax(totalPrice);
    private double profit = calculateProfit(totalPrice, taxToPay);

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTaxToPay() {
        return taxToPay;
    }

    public double getProfit() {
        return profit;
    }

    public Invoice(String product, double price, int quantity, String bankAccountNumber, Client client) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.bankAccountNumber = bankAccountNumber;
        this.client = client;
    }

    private double calculateTotalPrice(double price, int quantity) {
        return price * quantity;
    }

    private double calculateTax(double totalPrice) {
        return totalPrice * 0.18;
    }

    private double calculateProfit(double totalPrice, double taxToPay) {
        return totalPrice - taxToPay;
    }
}
