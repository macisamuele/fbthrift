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
public class MyStruct implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MyStruct");
  private static final TField MY_INCLUDED_FIELD_FIELD_DESC = new TField("MyIncludedField", TType.STRUCT, (short)1);
  private static final TField MY_OTHER_INCLUDED_FIELD_FIELD_DESC = new TField("MyOtherIncludedField", TType.STRUCT, (short)2);
  private static final TField MY_INCLUDED_INT_FIELD_DESC = new TField("MyIncludedInt", TType.I64, (short)3);

  public final one.two.three.Included MyIncludedField;
  public final one.two.three.Included MyOtherIncludedField;
  public final Long MyIncludedInt;
  public static final int MYINCLUDEDFIELD = 1;
  public static final int MYOTHERINCLUDEDFIELD = 2;
  public static final int MYINCLUDEDINT = 3;

  public MyStruct(
    one.two.three.Included MyIncludedField,
    one.two.three.Included MyOtherIncludedField,
    Long MyIncludedInt)
  {
    this.MyIncludedField = MyIncludedField;
    this.MyOtherIncludedField = MyOtherIncludedField;
    this.MyIncludedInt = MyIncludedInt;
  }

  public static class Builder {
    private one.two.three.Included MyIncludedField;
    private one.two.three.Included MyOtherIncludedField;
    private Long MyIncludedInt;

    public Builder() {
        this.MyIncludedField = new one.two.three.Included();
    this.MyIncludedField.setMyIntField(2L);
    Foo tmp0 = new Foo();
    tmp0.setA(2L);

    this.MyIncludedField.setMyTransitiveField(tmp0);

        this.MyIncludedInt = 42L;

    }

    public Builder setMyIncludedField(final one.two.three.Included MyIncludedField) {
      this.MyIncludedField = MyIncludedField;
      return this;
    }

    public Builder setMyOtherIncludedField(final one.two.three.Included MyOtherIncludedField) {
      this.MyOtherIncludedField = MyOtherIncludedField;
      return this;
    }

    public Builder setMyIncludedInt(final Long MyIncludedInt) {
      this.MyIncludedInt = MyIncludedInt;
      return this;
    }

    public MyStruct build() {
      return new MyStruct(
        this.MyIncludedField,
        this.MyOtherIncludedField,
        this.MyIncludedInt
      );
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyStruct(MyStruct other) {
    if (other.isSetMyIncludedField()) {
      this.MyIncludedField = TBaseHelper.deepCopy(other.MyIncludedField);
    } else {
      this.MyIncludedField = null;
    }
    if (other.isSetMyOtherIncludedField()) {
      this.MyOtherIncludedField = TBaseHelper.deepCopy(other.MyOtherIncludedField);
    } else {
      this.MyOtherIncludedField = null;
    }
    if (other.isSetMyIncludedInt()) {
      this.MyIncludedInt = TBaseHelper.deepCopy(other.MyIncludedInt);
    } else {
      this.MyIncludedInt = null;
    }
  }

  public MyStruct deepCopy() {
    return new MyStruct(this);
  }

  public one.two.three.Included getMyIncludedField() {
    return this.MyIncludedField;
  }

  // Returns true if field MyIncludedField is set (has been assigned a value) and false otherwise
  public boolean isSetMyIncludedField() {
    return this.MyIncludedField != null;
  }

  public one.two.three.Included getMyOtherIncludedField() {
    return this.MyOtherIncludedField;
  }

  // Returns true if field MyOtherIncludedField is set (has been assigned a value) and false otherwise
  public boolean isSetMyOtherIncludedField() {
    return this.MyOtherIncludedField != null;
  }

  public Long getMyIncludedInt() {
    return this.MyIncludedInt;
  }

  // Returns true if field MyIncludedInt is set (has been assigned a value) and false otherwise
  public boolean isSetMyIncludedInt() {
    return this.MyIncludedInt != null;
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MyStruct)
      return this.equals((MyStruct)that);
    return false;
  }

  public boolean equals(MyStruct that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_MyIncludedField = true && this.isSetMyIncludedField();
    boolean that_present_MyIncludedField = true && that.isSetMyIncludedField();
    if (this_present_MyIncludedField || that_present_MyIncludedField) {
      if (!(this_present_MyIncludedField && that_present_MyIncludedField))
        return false;
      if (!TBaseHelper.equalsNobinary(this.MyIncludedField, that.MyIncludedField))
        return false;
    }

    boolean this_present_MyOtherIncludedField = true && this.isSetMyOtherIncludedField();
    boolean that_present_MyOtherIncludedField = true && that.isSetMyOtherIncludedField();
    if (this_present_MyOtherIncludedField || that_present_MyOtherIncludedField) {
      if (!(this_present_MyOtherIncludedField && that_present_MyOtherIncludedField))
        return false;
      if (!TBaseHelper.equalsNobinary(this.MyOtherIncludedField, that.MyOtherIncludedField))
        return false;
    }

    boolean this_present_MyIncludedInt = true && this.isSetMyIncludedInt();
    boolean that_present_MyIncludedInt = true && that.isSetMyIncludedInt();
    if (this_present_MyIncludedInt || that_present_MyIncludedInt) {
      if (!(this_present_MyIncludedInt && that_present_MyIncludedInt))
        return false;
      if (!TBaseHelper.equalsNobinary(this.MyIncludedInt, that.MyIncludedInt))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {MyIncludedField, MyOtherIncludedField, MyIncludedInt});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static MyStruct deserialize(TProtocol iprot) throws TException {
    one.two.three.Included tmp_MyIncludedField = null;
    one.two.three.Included tmp_MyOtherIncludedField = null;
    Long tmp_MyIncludedInt = null;
    TField __field;
    iprot.readStructBegin();
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case MYINCLUDEDFIELD:
          if (__field.type == TType.STRUCT) {
            tmp_MyIncludedField = one.two.three.Included.deserialize(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case MYOTHERINCLUDEDFIELD:
          if (__field.type == TType.STRUCT) {
            tmp_MyOtherIncludedField = one.two.three.Included.deserialize(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case MYINCLUDEDINT:
          if (__field.type == TType.I64) {
            tmp_MyIncludedInt = iprot.readI64();
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

    MyStruct _that;
    _that = new MyStruct(
      tmp_MyIncludedField
      ,tmp_MyOtherIncludedField
      ,tmp_MyIncludedInt
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.MyIncludedField != null) {
      oprot.writeFieldBegin(MY_INCLUDED_FIELD_FIELD_DESC);
      this.MyIncludedField.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.MyOtherIncludedField != null) {
      oprot.writeFieldBegin(MY_OTHER_INCLUDED_FIELD_FIELD_DESC);
      this.MyOtherIncludedField.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.MyIncludedInt != null) {
      oprot.writeFieldBegin(MY_INCLUDED_INT_FIELD_DESC);
      oprot.writeI64(this.MyIncludedInt);
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
    return TBaseHelper.toStringHelper(this, indent, prettyPrint);
  }

  public void validate() throws TException {
    // check for required fields
  }

}

