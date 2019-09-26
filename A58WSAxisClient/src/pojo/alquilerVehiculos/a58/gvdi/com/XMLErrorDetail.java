/**
 * XMLErrorDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package pojo.alquilerVehiculos.a58.gvdi.com;

public class XMLErrorDetail  implements java.io.Serializable {
    private java.lang.String codError;
    private java.lang.String descEs;
    private java.lang.String descEu;

    public XMLErrorDetail() {
    }

    public XMLErrorDetail(
           java.lang.String codError,
           java.lang.String descEs,
           java.lang.String descEu) {
           this.codError = codError;
           this.descEs = descEs;
           this.descEu = descEu;
    }


    /**
     * Gets the codError value for this XMLErrorDetail.
     * 
     * @return codError
     */
    public java.lang.String getCodError() {
        return codError;
    }


    /**
     * Sets the codError value for this XMLErrorDetail.
     * 
     * @param codError
     */
    public void setCodError(java.lang.String codError) {
        this.codError = codError;
    }


    /**
     * Gets the descEs value for this XMLErrorDetail.
     * 
     * @return descEs
     */
    public java.lang.String getDescEs() {
        return descEs;
    }


    /**
     * Sets the descEs value for this XMLErrorDetail.
     * 
     * @param descEs
     */
    public void setDescEs(java.lang.String descEs) {
        this.descEs = descEs;
    }


    /**
     * Gets the descEu value for this XMLErrorDetail.
     * 
     * @return descEu
     */
    public java.lang.String getDescEu() {
        return descEu;
    }


    /**
     * Sets the descEu value for this XMLErrorDetail.
     * 
     * @param descEu
     */
    public void setDescEu(java.lang.String descEu) {
        this.descEu = descEu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMLErrorDetail)) return false;
        XMLErrorDetail other = (XMLErrorDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codError==null && other.getCodError()==null) || 
             (this.codError!=null &&
              this.codError.equals(other.getCodError()))) &&
            ((this.descEs==null && other.getDescEs()==null) || 
             (this.descEs!=null &&
              this.descEs.equals(other.getDescEs()))) &&
            ((this.descEu==null && other.getDescEu()==null) || 
             (this.descEu!=null &&
              this.descEu.equals(other.getDescEu())));
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
        if (getCodError() != null) {
            _hashCode += getCodError().hashCode();
        }
        if (getDescEs() != null) {
            _hashCode += getDescEs().hashCode();
        }
        if (getDescEu() != null) {
            _hashCode += getDescEu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMLErrorDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "XMLErrorDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codError");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "CodError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descEs");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "DescEs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descEu");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "DescEu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
