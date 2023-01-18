//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.20 at 07:21:05 PM MESZ 
//


package org.matsim.jaxb.signalcontrol20;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signalSystemControllerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signalSystemControllerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controllerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signalPlan" type="{http://www.matsim.org/files/dtd}signalPlanType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signalSystemControllerType", propOrder = {
    "controllerIdentifier",
    "signalPlan"
})
public final class XMLSignalSystemControllerType {

    @XmlElement(required = true)
    private String controllerIdentifier;
    private List<XMLSignalPlanType> signalPlan;

    /**
     * Gets the value of the controllerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerIdentifier() {
        return controllerIdentifier;
    }

    /**
     * Sets the value of the controllerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerIdentifier(String value) {
        this.controllerIdentifier = value;
    }

    /**
     * Gets the value of the signalPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signalPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignalPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLSignalPlanType }
     * 
     * 
     */
    public List<XMLSignalPlanType> getSignalPlan() {
        if (signalPlan == null) {
            signalPlan = new ArrayList<XMLSignalPlanType>();
        }
        return this.signalPlan;
    }

}
