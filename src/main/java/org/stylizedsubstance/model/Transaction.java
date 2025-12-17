package org.stylizedsubstance.model;

import java.util.UUID;

public class Transaction {
    private String id;
    private int amount; // Monetary amount in cents
    /*
        TODO finish timestamp
        timestamp
    */
    private String reference;

    public Transaction(int amount, String reference) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.reference = reference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
