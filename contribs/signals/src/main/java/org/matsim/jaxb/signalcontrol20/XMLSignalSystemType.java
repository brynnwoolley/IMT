//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.20 at 07:21:05 PM MESZ 
//


package org.matsim.jaxb.signalcontrol20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signalSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signalSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.matsim.org/files/dtd}idRefType">
 *       &lt;sequence>
 *         &lt;element name="signalSystemController" type="{http://www.matsim.org/files/dtd}signalSystemControllerType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signalSystemType", propOrder = {
    "signalSystemController"
})
public final class XMLSignalSystemType extends XMLIdRefType {

    @XmlElement(required = true)
    private XMLSignalSystemControllerType signalSystemController;

    /**
     * Gets the value of the signalSystemController property.
     * 
     * @return
     *     possible object is
     *     {@link XMLSignalSystemControllerType }
     *     
     */
    public XMLSignalSystemControllerType getSignalSystemController() {
        return signalSystemController;
    }

    /**
     * Sets the value of the signalSystemController property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLSignalSystemControllerType }
     *     
     */
    public void setSignalSystemController(XMLSignalSystemControllerType value) {
        this.signalSystemController = value;
    }

}