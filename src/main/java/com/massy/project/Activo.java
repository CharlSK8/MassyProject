//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.02.03 a las 03:14:58 PM COT 
//


package com.massy.project;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para activo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="activo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoVehiculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activo", propOrder = {
    "placa",
    "tipoVehiculo",
    "activo"
})
public class Activo {

    @XmlElement(required = true)
    protected String placa;
    @XmlElement(required = true)
    protected String tipoVehiculo;
    protected boolean activo;

    /**
     * Obtiene el valor de la propiedad placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define el valor de la propiedad placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoVehiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * Define el valor de la propiedad tipoVehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVehiculo(String value) {
        this.tipoVehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad activo.
     * 
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * Define el valor de la propiedad activo.
     * 
     */
    public void setActivo(boolean value) {
        this.activo = value;
    }

}
