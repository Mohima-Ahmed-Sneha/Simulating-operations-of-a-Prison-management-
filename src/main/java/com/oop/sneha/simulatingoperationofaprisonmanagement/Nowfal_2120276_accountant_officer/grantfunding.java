package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_accountant_officer;

public class grantfunding {
    private String refnum;
    private int amount;
    private String status;

    public grantfunding(String refnum, int amount, String status) {
        this.refnum = refnum;
        this.amount = amount;
        this.status = status;
    }

    public String getRefnum() {
        return refnum;
    }

    public void setRefnum(String refnum) {
        this.refnum = refnum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "grantfunding{" +
                "refnum='" + refnum + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
