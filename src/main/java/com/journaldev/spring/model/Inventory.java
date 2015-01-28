package com.journaldev.spring.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inventory implements Serializable {

    /**
     * 
     */
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 10002020L;

    private String serialNo;
    private String category;
    private String productName;
    private String certificate;
    private String productNumber;
    private String productType;
    private String batchId;
    private DateTime manufactureDate;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public DateTime getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(DateTime manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
