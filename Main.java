package com.learning;

public class Main {
    public static void main(String[] args) {
        // สร้างกระปุกใหม่
        PiggyBank bank = new PiggyBank("น้องพอใจ");

        // ดูเงินครั้งแรก
        bank.showMoney();

        // หยอดเงิน 2–3 ครั้ง
        bank.addMoney(20);
        bank.addMoney(50);

        // ดูเงินอีกครั้ง
        bank.showMoney();
    }
}
