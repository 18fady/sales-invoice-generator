package model;

import conntroller.FileOperation;

public class Invoiceline  extends FileOperation {
  private String itemname;
  private double itemprice;
  private int count;
  private Invoiceheader invoice;

  public Invoiceline(String itemname, double itemprice, int count) {
    this.itemname = itemname;
    this.itemprice = itemprice;
    this.count = count;
    //this.invoice = invoice;
  }



  public String getItemname() {
    return itemname;
  }

  public void setItemname(String itemname) {
    this.itemname = itemname;
  }

  public double getItemprice() {
    return itemprice;
  }

  public void setItemprice(double itemprice) {
    this.itemprice = itemprice;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public Invoiceheader getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoiceheader invoice) {
    this.invoice = invoice;
  }

  public double gettot() {
    return getCount() * getItemprice();
  }
}

