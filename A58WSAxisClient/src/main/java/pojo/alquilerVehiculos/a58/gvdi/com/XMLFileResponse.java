/**
 * XMLFileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package pojo.alquilerVehiculos.a58.gvdi.com;

public class XMLFileResponse  implements java.io.Serializable {
    private pojo.alquilerVehiculos.a58.gvdi.com.XMLErrorDetail fileError;
    private pojo.alquilerVehiculos.a58.gvdi.com.XMLRecord[] registros;
    private boolean errorEmail;
    private int numRegistros;
    private java.lang.String emailErrores;

    public XMLFileResponse() {
    }

    public XMLFileResponse(
           pojo.alquilerVehiculos.a58.gvdi.com.XMLErrorDetail fileError,
           pojo.alquilerVehiculos.a58.gvdi.com.XMLRecord[] registros,
           boolean errorEmail,
           int numRegistros,
           java.lang.String emailErrores) {
           this.fileError = fileError;
           this.registros = registros;
           this.errorEmail = errorEmail;
           this.numRegistros = numRegistros;
           this.emailErrores = emailErrores;
    }


    /**
     * Gets the fileError value for this XMLFileResponse.
     * 
     * @return fileError
     */
    public pojo.alquilerVehiculos.a58.gvdi.com.XMLErrorDetail getFileError() {
        return fileError;
    }


    /**
     * Sets the fileError value for this XMLFileResponse.
     * 
     * @param fileError
     */
    public void setFileError(pojo.alquilerVehiculos.a58.gvdi.com.XMLErrorDetail fileError) {
        this.fileError = fileError;
    }


    /**
     * Gets the registros value for this XMLFileResponse.
     * 
     * @return registros
     */
    public pojo.alquilerVehiculos.a58.gvdi.com.XMLRecord[] getRegistros() {
        return registros;
    }


    /**
     * Sets the registros value for this XMLFileResponse.
     * 
     * @param registros
     */
    public void setRegistros(pojo.alquilerVehiculos.a58.gvdi.com.XMLRecord[] registros) {
        this.registros = registros;
    }

    public pojo.alquilerVehiculos.a58.gvdi.com.XMLRecord getRegistros(int i) {
        return this.registros[i];
    }

    public void setRegistros(int i, pojo.alquilerVehiculos.a58.gvdi.com.XMLRecord _value) {
        this.registros[i] = _value;
    }


    /**
     * Gets the errorEmail value for this XMLFileResponse.
     * 
     * @return errorEmail
     */
    public boolean isErrorEmail() {
        return errorEmail;
    }


    /**
     * Sets the errorEmail value for this XMLFileResponse.
     * 
     * @param errorEmail
     */
    public void setErrorEmail(boolean errorEmail) {
        this.errorEmail = errorEmail;
    }


    /**
     * Gets the numRegistros value for this XMLFileResponse.
     * 
     * @return numRegistros
     */
    public int getNumRegistros() {
        return numRegistros;
    }


    /**
     * Sets the numRegistros value for this XMLFileResponse.
     * 
     * @param numRegistros
     */
    public void setNumRegistros(int numRegistros) {
        this.numRegistros = numRegistros;
    }


    /**
     * Gets the emailErrores value for this XMLFileResponse.
     * 
     * @return emailErrores
     */
    public java.lang.String getEmailErrores() {
        return emailErrores;
    }


    /**
     * Sets the emailErrores value for this XMLFileResponse.
     * 
     * @param emailErrores
     */
    public void setEmailErrores(java.lang.String emailErrores) {
        this.emailErrores = emailErrores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XMLFileResponse)) return false;
        XMLFileResponse other = (XMLFileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileError==null && other.getFileError()==null) || 
             (this.fileError!=null &&
              this.fileError.equals(other.getFileError()))) &&
            ((this.registros==null && other.getRegistros()==null) || 
             (this.registros!=null &&
              java.util.Arrays.equals(this.registros, other.getRegistros()))) &&
            this.errorEmail == other.isErrorEmail() &&
            this.numRegistros == other.getNumRegistros() &&
            ((this.emailErrores==null && other.getEmailErrores()==null) || 
             (this.emailErrores!=null &&
              this.emailErrores.equals(other.getEmailErrores())));
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
        if (getFileError() != null) {
            _hashCode += getFileError().hashCode();
        }
        if (getRegistros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isErrorEmail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNumRegistros();
        if (getEmailErrores() != null) {
            _hashCode += getEmailErrores().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XMLFileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "XMLFileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileError");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "FileError"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "XMLErrorDetail"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registros");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "Registros"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "XMLRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "ErrorEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRegistros");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "NumRegistros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailErrores");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvdi.a58.alquilerVehiculos.pojo", "EmailErrores"));
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
