package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_accountant_officer;

public class payroll {
    private int baseHour;
    private Float baseRate;
    private Float overTime;
    private Float overTimeRate;
    private Float Total;
    private Float annualBudgetCap;

    public payroll(int baseHour, Float baseRate, Float overTime, Float overTimeRate, Float total, Float annualBudgetCap) {
        this.baseHour = baseHour;
        this.baseRate = baseRate;
        this.overTime = overTime;
        this.overTimeRate = overTimeRate;
        Total = total;
        this.annualBudgetCap = annualBudgetCap;
    }

    public int getBaseHour() {
        return baseHour;
    }

    public void setBaseHour(int baseHour) {
        this.baseHour = baseHour;
    }

    public Float getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Float baseRate) {
        this.baseRate = baseRate;
    }

    public Float getOverTime() {
        return overTime;
    }

    public void setOverTime(Float overTime) {
        this.overTime = overTime;
    }

    public Float getOverTimeRate() {
        return overTimeRate;
    }

    public void setOverTimeRate(Float overTimeRate) {
        this.overTimeRate = overTimeRate;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float total) {
        Total = total;
    }

    public Float getAnnualBudgetCap() {
        return annualBudgetCap;
    }

    public void setAnnualBudgetCap(Float annualBudgetCap) {
        this.annualBudgetCap = annualBudgetCap;
    }

    @Override
    public String toString() {
        return "payroll{" +
                "baseHour=" + baseHour +
                ", baseRate=" + baseRate +
                ", overTime=" + overTime +
                ", overTimeRate=" + overTimeRate +
                ", Total=" + Total +
                ", annualBudgetCap=" + annualBudgetCap +
                '}';
    }
}
