/**
 * ConstantOperandConstantType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

public class ConstantOperandConstantType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConstantOperandConstantType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BOOLEAN = "BOOLEAN";
    public static final java.lang.String _DOUBLE = "DOUBLE";
    public static final java.lang.String _LONG = "LONG";
    public static final java.lang.String _STRING = "STRING";
    public static final ConstantOperandConstantType BOOLEAN = new ConstantOperandConstantType(_BOOLEAN);
    public static final ConstantOperandConstantType DOUBLE = new ConstantOperandConstantType(_DOUBLE);
    public static final ConstantOperandConstantType LONG = new ConstantOperandConstantType(_LONG);
    public static final ConstantOperandConstantType STRING = new ConstantOperandConstantType(_STRING);
    public java.lang.String getValue() { return _value_;}
    public static ConstantOperandConstantType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConstantOperandConstantType enumeration = (ConstantOperandConstantType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConstantOperandConstantType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConstantOperandConstantType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ConstantOperand.ConstantType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
