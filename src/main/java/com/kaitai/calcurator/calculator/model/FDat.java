package com.kaitai.calcurator.calculator.model;

public class FDat {
  private int num1=0;
  private int num2=0;
  private String ope="";
  private double ans=0;

  public int getNum1() {
    return num1;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public String getOpe() {
    return ope;
  }

  public void setOpe(String ope) {
    this.ope = ope;
  }

  public double getAns() {
    return ans;
  }

  public void setAns(double ans) {
    this.ans = ans;
  }
}
