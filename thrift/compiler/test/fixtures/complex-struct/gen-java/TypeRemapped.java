/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class TypeRemapped implements TBase, java.io.Serializable, Cloneable, Comparable<TypeRemapped> {
  private static final TStruct STRUCT_DESC = new TStruct("TypeRemapped");
  private static final TField LS_MAP_FIELD_DESC = new TField("lsMap", TType.MAP, (short)1);
  private static final TField IO_MAP_FIELD_DESC = new TField("ioMap", TType.MAP, (short)2);
  private static final TField BIG_INTEGER_FIELD_DESC = new TField("BigInteger", TType.I32, (short)3);
  private static final TField BINARY_TEST_BUFFER_FIELD_DESC = new TField("binaryTestBuffer", TType.STRING, (short)4);

  public Map<Long,String> lsMap;
  public Map<Integer,Map<Integer,Long>> ioMap;
  public int BigInteger;
  public byte[] binaryTestBuffer;
  public static final int LSMAP = 1;
  public static final int IOMAP = 2;
  public static final int BIGINTEGER = 3;
  public static final int BINARYTESTBUFFER = 4;

  // isset id assignments
  private static final int __BIGINTEGER_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(LSMAP, new FieldMetaData("lsMap", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I64), 
            new FieldValueMetaData(TType.STRING))));
    tmpMetaDataMap.put(IOMAP, new FieldMetaData("ioMap", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new MapMetaData(TType.MAP, 
                new FieldValueMetaData(TType.I32), 
                new FieldValueMetaData(TType.I64)))));
    tmpMetaDataMap.put(BIGINTEGER, new FieldMetaData("BigInteger", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(BINARYTESTBUFFER, new FieldMetaData("binaryTestBuffer", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(TypeRemapped.class, metaDataMap);
  }

  public TypeRemapped() {
  }

  public TypeRemapped(
    Map<Long,String> lsMap,
    Map<Integer,Map<Integer,Long>> ioMap,
    int BigInteger,
    byte[] binaryTestBuffer)
  {
    this();
    this.lsMap = lsMap;
    this.ioMap = ioMap;
    this.BigInteger = BigInteger;
    setBigIntegerIsSet(true);
    this.binaryTestBuffer = binaryTestBuffer;
  }

  public static class Builder {
    private Map<Long,String> lsMap;
    private Map<Integer,Map<Integer,Long>> ioMap;
    private int BigInteger;
    private byte[] binaryTestBuffer;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setLsMap(final Map<Long,String> lsMap) {
      this.lsMap = lsMap;
      return this;
    }

    public Builder setIoMap(final Map<Integer,Map<Integer,Long>> ioMap) {
      this.ioMap = ioMap;
      return this;
    }

    public Builder setBigInteger(final int BigInteger) {
      this.BigInteger = BigInteger;
      __optional_isset.set(__BIGINTEGER_ISSET_ID, true);
      return this;
    }

    public Builder setBinaryTestBuffer(final byte[] binaryTestBuffer) {
      this.binaryTestBuffer = binaryTestBuffer;
      return this;
    }

    public TypeRemapped build() {
      TypeRemapped result = new TypeRemapped();
      result.setLsMap(this.lsMap);
      result.setIoMap(this.ioMap);
      if (__optional_isset.get(__BIGINTEGER_ISSET_ID)) {
        result.setBigInteger(this.BigInteger);
      }
      result.setBinaryTestBuffer(this.binaryTestBuffer);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TypeRemapped(TypeRemapped other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetLsMap()) {
      this.lsMap = TBaseHelper.deepCopy(other.lsMap);
    }
    if (other.isSetIoMap()) {
      this.ioMap = TBaseHelper.deepCopy(other.ioMap);
    }
    this.BigInteger = TBaseHelper.deepCopy(other.BigInteger);
    if (other.isSetBinaryTestBuffer()) {
      this.binaryTestBuffer = TBaseHelper.deepCopy(other.binaryTestBuffer);
    }
  }

  public TypeRemapped deepCopy() {
    return new TypeRemapped(this);
  }

  public Map<Long,String> getLsMap() {
    return this.lsMap;
  }

  public TypeRemapped setLsMap(Map<Long,String> lsMap) {
    this.lsMap = lsMap;
    return this;
  }

  public void unsetLsMap() {
    this.lsMap = null;
  }

  // Returns true if field lsMap is set (has been assigned a value) and false otherwise
  public boolean isSetLsMap() {
    return this.lsMap != null;
  }

  public void setLsMapIsSet(boolean __value) {
    if (!__value) {
      this.lsMap = null;
    }
  }

  public Map<Integer,Map<Integer,Long>> getIoMap() {
    return this.ioMap;
  }

  public TypeRemapped setIoMap(Map<Integer,Map<Integer,Long>> ioMap) {
    this.ioMap = ioMap;
    return this;
  }

  public void unsetIoMap() {
    this.ioMap = null;
  }

  // Returns true if field ioMap is set (has been assigned a value) and false otherwise
  public boolean isSetIoMap() {
    return this.ioMap != null;
  }

  public void setIoMapIsSet(boolean __value) {
    if (!__value) {
      this.ioMap = null;
    }
  }

  public int getBigInteger() {
    return this.BigInteger;
  }

  public TypeRemapped setBigInteger(int BigInteger) {
    this.BigInteger = BigInteger;
    setBigIntegerIsSet(true);
    return this;
  }

  public void unsetBigInteger() {
    __isset_bit_vector.clear(__BIGINTEGER_ISSET_ID);
  }

  // Returns true if field BigInteger is set (has been assigned a value) and false otherwise
  public boolean isSetBigInteger() {
    return __isset_bit_vector.get(__BIGINTEGER_ISSET_ID);
  }

  public void setBigIntegerIsSet(boolean __value) {
    __isset_bit_vector.set(__BIGINTEGER_ISSET_ID, __value);
  }

  public byte[] getBinaryTestBuffer() {
    return this.binaryTestBuffer;
  }

  public TypeRemapped setBinaryTestBuffer(byte[] binaryTestBuffer) {
    this.binaryTestBuffer = binaryTestBuffer;
    return this;
  }

  public void unsetBinaryTestBuffer() {
    this.binaryTestBuffer = null;
  }

  // Returns true if field binaryTestBuffer is set (has been assigned a value) and false otherwise
  public boolean isSetBinaryTestBuffer() {
    return this.binaryTestBuffer != null;
  }

  public void setBinaryTestBufferIsSet(boolean __value) {
    if (!__value) {
      this.binaryTestBuffer = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case LSMAP:
      if (__value == null) {
        unsetLsMap();
      } else {
        setLsMap((Map<Long,String>)__value);
      }
      break;

    case IOMAP:
      if (__value == null) {
        unsetIoMap();
      } else {
        setIoMap((Map<Integer,Map<Integer,Long>>)__value);
      }
      break;

    case BIGINTEGER:
      if (__value == null) {
        unsetBigInteger();
      } else {
        setBigInteger((Integer)__value);
      }
      break;

    case BINARYTESTBUFFER:
      if (__value == null) {
        unsetBinaryTestBuffer();
      } else {
        setBinaryTestBuffer((byte[])__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case LSMAP:
      return getLsMap();

    case IOMAP:
      return getIoMap();

    case BIGINTEGER:
      return new Integer(getBigInteger());

    case BINARYTESTBUFFER:
      return getBinaryTestBuffer();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TypeRemapped)
      return this.equals((TypeRemapped)that);
    return false;
  }

  public boolean equals(TypeRemapped that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_lsMap = true && this.isSetLsMap();
    boolean that_present_lsMap = true && that.isSetLsMap();
    if (this_present_lsMap || that_present_lsMap) {
      if (!(this_present_lsMap && that_present_lsMap))
        return false;
      if (!TBaseHelper.equalsNobinary(this.lsMap, that.lsMap))
        return false;
    }

    boolean this_present_ioMap = true && this.isSetIoMap();
    boolean that_present_ioMap = true && that.isSetIoMap();
    if (this_present_ioMap || that_present_ioMap) {
      if (!(this_present_ioMap && that_present_ioMap))
        return false;
      if (!TBaseHelper.equalsNobinary(this.ioMap, that.ioMap))
        return false;
    }

    boolean this_present_BigInteger = true;
    boolean that_present_BigInteger = true;
    if (this_present_BigInteger || that_present_BigInteger) {
      if (!(this_present_BigInteger && that_present_BigInteger))
        return false;
      if (!TBaseHelper.equalsNobinary(this.BigInteger, that.BigInteger))
        return false;
    }

    boolean this_present_binaryTestBuffer = true && this.isSetBinaryTestBuffer();
    boolean that_present_binaryTestBuffer = true && that.isSetBinaryTestBuffer();
    if (this_present_binaryTestBuffer || that_present_binaryTestBuffer) {
      if (!(this_present_binaryTestBuffer && that_present_binaryTestBuffer))
        return false;
      if (!TBaseHelper.equalsSlow(this.binaryTestBuffer, that.binaryTestBuffer))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {lsMap, ioMap, BigInteger, binaryTestBuffer});
  }

  @Override
  public int compareTo(TypeRemapped other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLsMap()).compareTo(other.isSetLsMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(lsMap, other.lsMap);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetIoMap()).compareTo(other.isSetIoMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(ioMap, other.ioMap);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetBigInteger()).compareTo(other.isSetBigInteger());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(BigInteger, other.BigInteger);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetBinaryTestBuffer()).compareTo(other.isSetBinaryTestBuffer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(binaryTestBuffer, other.binaryTestBuffer);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case LSMAP:
          if (__field.type == TType.MAP) {
            {
              TMap _map350 = iprot.readMapBegin();
              this.lsMap = new HashMap<Long,String>(Math.max(0, 2*_map350.size));
              for (int _i351 = 0; 
                   (_map350.size < 0) ? iprot.peekMap() : (_i351 < _map350.size); 
                   ++_i351)
              {
                long _key352;
                String _val353;
                _key352 = iprot.readI64();
                _val353 = iprot.readString();
                this.lsMap.put(_key352, _val353);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case IOMAP:
          if (__field.type == TType.MAP) {
            {
              TMap _map354 = iprot.readMapBegin();
              this.ioMap = new HashMap<Integer,Map<Integer,Long>>(Math.max(0, 2*_map354.size));
              for (int _i355 = 0; 
                   (_map354.size < 0) ? iprot.peekMap() : (_i355 < _map354.size); 
                   ++_i355)
              {
                int _key356;
                Map<Integer,Long> _val357;
                _key356 = iprot.readI32();
                {
                  TMap _map358 = iprot.readMapBegin();
                  _val357 = new HashMap<Integer,Long>(Math.max(0, 2*_map358.size));
                  for (int _i359 = 0; 
                       (_map358.size < 0) ? iprot.peekMap() : (_i359 < _map358.size); 
                       ++_i359)
                  {
                    int _key360;
                    long _val361;
                    _key360 = iprot.readI32();
                    _val361 = iprot.readI64();
                    _val357.put(_key360, _val361);
                  }
                  iprot.readMapEnd();
                }
                this.ioMap.put(_key356, _val357);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case BIGINTEGER:
          if (__field.type == TType.I32) {
            this.BigInteger = iprot.readI32();
            setBigIntegerIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case BINARYTESTBUFFER:
          if (__field.type == TType.STRING) {
            this.binaryTestBuffer = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.lsMap != null) {
      oprot.writeFieldBegin(LS_MAP_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I64, TType.STRING, this.lsMap.size()));
        for (Map.Entry<Long, String> _iter362 : this.lsMap.entrySet())        {
          oprot.writeI64(_iter362.getKey());
          oprot.writeString(_iter362.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.ioMap != null) {
      oprot.writeFieldBegin(IO_MAP_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.MAP, this.ioMap.size()));
        for (Map.Entry<Integer, Map<Integer,Long>> _iter363 : this.ioMap.entrySet())        {
          oprot.writeI32(_iter363.getKey());
          {
            oprot.writeMapBegin(new TMap(TType.I32, TType.I64, _iter363.getValue().size()));
            for (Map.Entry<Integer, Long> _iter364 : _iter363.getValue().entrySet())            {
              oprot.writeI32(_iter364.getKey());
              oprot.writeI64(_iter364.getValue());
            }
            oprot.writeMapEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(BIG_INTEGER_FIELD_DESC);
    oprot.writeI32(this.BigInteger);
    oprot.writeFieldEnd();
    if (this.binaryTestBuffer != null) {
      oprot.writeFieldBegin(BINARY_TEST_BUFFER_FIELD_DESC);
      oprot.writeBinary(this.binaryTestBuffer);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("TypeRemapped");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("lsMap");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getLsMap() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getLsMap(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("ioMap");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getIoMap() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getIoMap(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("BigInteger");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getBigInteger(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("binaryTestBuffer");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getBinaryTestBuffer() == null) {
      sb.append("null");
    } else {
        int __binaryTestBuffer_size = Math.min(this.getBinaryTestBuffer().length, 128);
        for (int i = 0; i < __binaryTestBuffer_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getBinaryTestBuffer()[i]).length() > 1 ? Integer.toHexString(this.getBinaryTestBuffer()[i]).substring(Integer.toHexString(this.getBinaryTestBuffer()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getBinaryTestBuffer()[i]).toUpperCase());
        }
        if (this.getBinaryTestBuffer().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

