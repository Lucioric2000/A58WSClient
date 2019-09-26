/**
 * XMLRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package pojo.alquilerVehiculos.a58.gvdi.com;

public class XMLRecord  implements java.io.Serializable {
    private java.lang.String numRegistro;
    private java.lang.String numParte;
    private pojo.alquilerVehiculos.a58.gvdi.com.XMLErrorDetail[] errores;

    public XMLRecord() {
    }

    public XMLRecord(
           java.lang.String numRegistro,
           java.lang.String numParte,
           pojo.alquilerVehiculos.a58.gvdi.com.XMLErrorDetail[] errores) {
           this.numRegistro = numRegistro;
           this.numParte = numParte;
           this.errores = errores;
    }


    /**
     * Gets the numRegistro value for this XMLRecord.
     * 
     * @return numRegistro
     */
    public java.lang.String getNumRegistro() {
        return numRegistro;
    }


    /**
     * Sets the numRegistro value for this XMLRecord.
     * 
     * @param numRegistro
     */
    public void setNumRegistro(java.lang.String numRegistro) {
        this.numRegistro = numRegistro;
    }


    /**
     * Gets the numParte value for this XMLRecord.
     * 
     * @return numParte
     */
    public java.lang.String getNumParte() {
        return numParte;
    }


    /**
     * Sets the numParte value for this XMLRecord.
     * 
     * @param numParte
     */
    public void setNumParte(java.lang.String numParte) {
        this.numParte = numParte;
    }


    /**
     * Gets the errores value for this XMLRecord.
     * 
     * @return errores
     */
    public pojo.alquilerVehiculos.a58.gvdi.com.XMLErrorDetail[] getErrores() {
        return errores;
    }


    /**
     * Sets the errores value for this XMLRecord.
     * 
     * @param errores
     */
    public void setErrores(pojo.alquilerVehiculos.a58.gvdi.com.XMLErrorDetail[] errores) {
        this.errores = errores;
    }

    public pojo.alquilerVehiculos.a58.gvdi.com.XMLErrorDetail getErrores(int i) {
        return this.errores[i];
    }

    public void setErrores(int i, pojo.alquilerVehiculos.a58.gvdi.com.XMLErrorDetail _value) {
        this.errores[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMLRecord)) return false;
        XMLRecord other = (XMLRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numRegistro==null && other.getNumRegistro()==null) || 
             (this.numRegistro!=null &&
              this.numRegistro.equals(other.getNumRegistro()))) &&
            ((this.numParte==null && other.getNumParte()==null) || 
             (this.numParte!=null &&
              this.numParte.equals(other.getNumParte()))) &&
            ((this.errores==null && other.getErrores()==null) || 
             (this.errores!=null &&
              java.util.Arrays.equals(this.errores, other.getErrores())));
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
        if (getNumRegistro() != null) {
            _hashCode += getNumRegistro().hashCode();
        }
        if (getNumParte() != null) {
            _hashCode += getNumParte().hashCode();
        }
        if (getErrores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMLRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "XMLRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "NumRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numParte");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "NumParte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errores");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "Errores"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "XMLErrorDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
