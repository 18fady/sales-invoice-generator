package model;

import conntroller.FileOperation;

import javax.sound.sampled.Line;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Invoiceheader extends FileOperation {
    private int invoicenum;
    private String invoiceDate;
    private String customerName;
    //  private ArrayList<Invoiceline> lines;

    public int getInvoicenum() {
        return invoicenum;
    }

    public Invoiceheader(int invoicenumber, String invoiceDate, String customerName) {
        this.invoicenum = invoicenumber;
        this.invoiceDate = invoiceDate;
        this.customerName = customerName;
    }


    public void setInvoicenum(int invoicenum) {
        this.invoicenum = invoicenum;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


}

