//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.28 at 02:15:42 PM CEST 
//


package com.ixopay.client.model.transaction;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gateway.ixopay.com/Schema/V2/Transaction}baseTransactionWithReferenceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://gateway.ixopay.com/Schema/V2/Transaction}amountableGroup"/>
 *         &lt;group ref="{http://gateway.ixopay.com/Schema/V2/Transaction}itemsGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundType", propOrder = {
    "amount",
    "currency",
    "items"
})
public class RefundType
    extends BaseTransactionWithReferenceType
{

    protected BigDecimal amount;
    protected String currency;
    protected ItemsType items;

    /**
     * Default no-arg constructor
     * 
     */
    public RefundType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RefundType(final String transactionToken, final String transactionId, final String additionalId1, final String additionalId2, final CustomerType customer, final CreditCardCustomerType creditCardCustomer, final IbanCustomerType ibanCustomer, final List<ExtraDataType> extraData, final RequestType request, final String referenceTransactionId, final String referenceCustomerId, final String referenceId2, final String referenceId3, final String referenceId4, final BigDecimal amount, final String currency, final ItemsType items) {
        super(transactionToken, transactionId, additionalId1, additionalId2, customer, creditCardCustomer, ibanCustomer, extraData, request, referenceTransactionId, referenceCustomerId, referenceId2, referenceId3, referenceId4);
        this.amount = amount;
        this.currency = currency;
        this.items = items;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ItemsType }
     *     
     */
    public ItemsType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemsType }
     *     
     */
    public void setItems(ItemsType value) {
        this.items = value;
    }

}