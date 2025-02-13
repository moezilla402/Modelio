/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>Java class for tItemDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tItemDefinition">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement">
 * &lt;attribute name="structureRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;attribute name="isCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 * &lt;attribute name="itemKind" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tItemKind" default="Information" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("f1901f39-10ba-4dee-9d88-834af6734940")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tItemDefinition")
public class TItemDefinition extends TRootElement {
    @objid ("60355746-5d6a-45bd-a505-2650b737e34e")
    @XmlAttribute(name = "isCollection")
    protected Boolean isCollection;

    @objid ("e648074f-722e-4941-a092-b5c883a4857f")
    @XmlAttribute(name = "itemKind")
    protected TItemKind itemKind;

    @objid ("625fc69e-429f-4a82-b97f-abc77eb1c0c3")
    @XmlAttribute(name = "structureRef")
    protected QName structureRef;

    /**
     * Gets the value of the structureRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("88e4e082-4963-4313-b0d2-05c4934f6064")
    public QName getStructureRef() {
        return this.structureRef;
    }

    /**
     * Sets the value of the structureRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("5396563c-d347-4113-ae0d-d1b7ac29f2be")
    public void setStructureRef(QName value) {
        this.structureRef = value;
    }

    /**
     * Gets the value of the isCollection property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    @objid ("17f30dd1-2158-4562-9aed-177520aeb40c")
    public boolean isIsCollection() {
        if (this.isCollection == null) {
            return false;
        } else {
            return this.isCollection;
        }
        
    }

    /**
     * Sets the value of the isCollection property.
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("005c4f1a-e588-4b1b-a9ec-52c8e41c73e5")
    public void setIsCollection(Boolean value) {
        this.isCollection = value;
    }

    /**
     * Gets the value of the itemKind property.
     * @return
     * possible object is
     * {@link TItemKind }
     */
    @objid ("8c162fc8-f03b-44bc-af1d-cd3377e5403c")
    public TItemKind getItemKind() {
        if (this.itemKind == null) {
            return TItemKind.INFORMATION;
        } else {
            return this.itemKind;
        }
        
    }

    /**
     * Sets the value of the itemKind property.
     * @param value allowed object is
     * {@link TItemKind }
     */
    @objid ("6c9999e4-82a0-422b-8638-39272d5b2085")
    public void setItemKind(TItemKind value) {
        this.itemKind = value;
    }

}
