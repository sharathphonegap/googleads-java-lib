/**
 * CustomParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;


/**
 * CustomParameter is used to map a custom parameter key to its value.
 */
public class CustomParameter  implements java.io.Serializable {
    /* The parameter key to be mapped.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 16, inclusive, in UTF-8 bytes,
     * (trimmed).</span> */
    private java.lang.String key;

    /* The value this parameter should be mapped to. It should be
     * null if isRemove is true.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 200, inclusive, in UTF-8 bytes,
     * (trimmed).</span> */
    private java.lang.String value;

    /* On SET operation, indicates that the parameter should be removed
     * from the existing parameters.
     *                 If set to true, the value field must be null. */
    private java.lang.Boolean isRemove;

    public CustomParameter() {
    }

    public CustomParameter(
           java.lang.String key,
           java.lang.String value,
           java.lang.Boolean isRemove) {
           this.key = key;
           this.value = value;
           this.isRemove = isRemove;
    }


    /**
     * Gets the key value for this CustomParameter.
     * 
     * @return key   * The parameter key to be mapped.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 16, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this CustomParameter.
     * 
     * @param key   * The parameter key to be mapped.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 16, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the value value for this CustomParameter.
     * 
     * @return value   * The value this parameter should be mapped to. It should be
     * null if isRemove is true.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 200, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this CustomParameter.
     * 
     * @param value   * The value this parameter should be mapped to. It should be
     * null if isRemove is true.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 200, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the isRemove value for this CustomParameter.
     * 
     * @return isRemove   * On SET operation, indicates that the parameter should be removed
     * from the existing parameters.
     *                 If set to true, the value field must be null.
     */
    public java.lang.Boolean getIsRemove() {
        return isRemove;
    }


    /**
     * Sets the isRemove value for this CustomParameter.
     * 
     * @param isRemove   * On SET operation, indicates that the parameter should be removed
     * from the existing parameters.
     *                 If set to true, the value field must be null.
     */
    public void setIsRemove(java.lang.Boolean isRemove) {
        this.isRemove = isRemove;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomParameter)) return false;
        CustomParameter other = (CustomParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.isRemove==null && other.getIsRemove()==null) || 
             (this.isRemove!=null &&
              this.isRemove.equals(other.getIsRemove())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getIsRemove() != null) {
            _hashCode += getIsRemove().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "CustomParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRemove");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "isRemove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
