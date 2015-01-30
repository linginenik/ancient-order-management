package com.journaldev.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "Sales")
public class Sales implements Serializable {

    private static DateTimeFormatter dateFormat = DateTimeFormat.forPattern("yyyy-MM-dd");
    /**
     * 
     */
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 10002020L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String saleNo;
    private String invoiceNo;
    private String customerNo;
    private double cost;
    private double netPay;
    private double advance;
    private double amoutDue;
    private DateTime saleDate;

    private DateTime dueDate;

    private DateTime convertDate(String strDate) {
        return DateTime.parse(strDate, dateFormat);

    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public double getAmoutDue() {
        return amoutDue;
    }

    public void setAmoutDue(double amoutDue) {
        this.amoutDue = amoutDue;
    }

    public DateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(DateTime saleDate) {
        this.saleDate = saleDate;
    }

    @JsonProperty
    public void setSaleDate(String saleDate) {
        this.saleDate = convertDate(saleDate);
    }

    public DateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(DateTime dueDate) {
        this.dueDate = dueDate;
    }

    @JsonProperty
    public void setDueDate(String dueDate) {
        this.dueDate = convertDate(dueDate);
    }
}
