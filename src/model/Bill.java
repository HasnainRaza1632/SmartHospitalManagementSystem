package model;

import interfaces.Billable;

public class Bill implements Billable {

    private String billId;
    private double roomCharges;
    private double medicineCharges;
    private double consultationFee;
    private boolean isPaid;

    public Bill(String billId, double roomCharges, double medicineCharges,
                double consultationFee) {}

    public double calculateBill() {
        return roomCharges + medicineCharges + consultationFee;
    }

    public void generateInvoice() {}

    public void markAsPaid() {}
}