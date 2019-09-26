/**
 * EnviarFichero.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.gvdi.a58.alquilerVehiculos.negocio.ws;

public class EnviarFichero  implements java.io.Serializable {
    private java.lang.String fichero;

    public EnviarFichero() {
    }

    public EnviarFichero(
           java.lang.String fichero) {
           this.fichero = fichero;
    }


    /**
     * Gets the fichero value for this EnviarFichero.
     * 
     * @return fichero
     */
    public java.lang.String getFichero() {
        return fichero;
    }


    /**
     * Sets the fichero value for this EnviarFichero.
     * 
     * @param fichero
     */
    public void setFichero(java.lang.String fichero) {
        this.fichero = fichero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnviarFichero)) return false;
        EnviarFichero other = (EnviarFichero) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fichero==null && other.getFichero()==null) || 
             (this.fichero!=null &&
              this.fichero.equals(other.getFichero())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFichero() != null) {
            _hashCode += getFichero().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnviarFichero.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gvdi.com/a58/alquilerVehiculos/negocio/ws", ">enviarFichero"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fichero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gvdi.com/a58/alquilerVehiculos/negocio/ws", "fichero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
