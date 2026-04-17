package model;

import interfaces.Billable;

public class Bill implements Billable {

    private String billId;
    private double roomCharges;
    private double medicineCharges;
    private double consultationFee;
    private boolean isPaid;

    public Bill(String billId, double roomCharges, double medicineCharges,
                double consultationFee) {
        this.billId = billId;
        this.roomCharges = roomCharges;
        this.medicineCharges = medicineCharges;
        this.consultationFee = consultationFee;
        this.isPaid = false;
    }

    public double calculateBill() {
        return roomCharges + medicineCharges + consultationFee;
    }

    public void generateInvoice() {
        System.out.println("===== Bill Reciept =====");
        System.out.println("------------------------");
        System.out.println("  Bill ID : "+billId);
        System.out.println("  Room Charges : "+ roomCharges);
        System.out.println("  Medicine Charges : "+medicineCharges);
        System.out.println("  Consultaion Fee : "+consultationFee);
        System.out.println("  Total Bill : "+calculateBill());
        //System.out.println("  Status : "+ isPaid);
    }

    public void markAsPaid() {
        this.isPaid = true;
    }
}