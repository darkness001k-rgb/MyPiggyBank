package com.learning;

public class PiggyBank {
    // Fields
    private String ownerName;
    private double money;

    // Constructor
    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0; // กระปุกใหม่เริ่มที่ 0
    }

    // Methods
    public void addMoney(double amount) {
        if (amount > 0) {
            money += amount;
            System.out.println("ยอดเงินใส่กระปุกของ " + ownerName +
                    " จำนวน " + amount + " บาท");
        } else {
            System.out.println("ไม่สามารถใส่จำนวนเงินที่ติดลบหรือศูนย์ได้");
        }
    }

    public void showMoney() {
        System.out.println("กระปุกของ " + ownerName +
                " มีเงินทั้งหมด " + money + " บาท");
    }
}
