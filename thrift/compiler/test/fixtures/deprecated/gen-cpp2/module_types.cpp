/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "thrift/compiler/test/fixtures/deprecated/gen-cpp2/module_types.h"
#include "thrift/compiler/test/fixtures/deprecated/gen-cpp2/module_types.tcc"

#include <thrift/lib/cpp2/gen/module_types_cpp.h>

#include "thrift/compiler/test/fixtures/deprecated/gen-cpp2/module_data.h"


namespace apache {
namespace thrift {
namespace detail {

void TccStructTraits<::cpp2::House>::translateFieldName(
    FOLLY_MAYBE_UNUSED folly::StringPiece _fname,
    FOLLY_MAYBE_UNUSED int16_t& fid,
    FOLLY_MAYBE_UNUSED apache::thrift::protocol::TType& _ftype) {
  if (false) {}
  else if (_fname == "id") {
    fid = 1;
    _ftype = apache::thrift::protocol::T_I64;
  }
  else if (_fname == "houseName") {
    fid = 2;
    _ftype = apache::thrift::protocol::T_STRING;
  }
  else if (_fname == "houseColors") {
    fid = 3;
    _ftype = apache::thrift::protocol::T_SET;
  }
}
void TccStructTraits<::cpp2::Field>::translateFieldName(
    FOLLY_MAYBE_UNUSED folly::StringPiece _fname,
    FOLLY_MAYBE_UNUSED int16_t& fid,
    FOLLY_MAYBE_UNUSED apache::thrift::protocol::TType& _ftype) {
  if (false) {}
  else if (_fname == "id") {
    fid = 1;
    _ftype = apache::thrift::protocol::T_I64;
  }
  else if (_fname == "fieldType") {
    fid = 2;
    _ftype = apache::thrift::protocol::T_I32;
  }
}

} // namespace detail
} // namespace thrift
} // namespace apache

namespace cpp2 {

House::House(apache::thrift::FragileConstructor,  ::cpp2::ColorID id__arg, ::std::string houseName__arg, ::std::set< ::cpp2::ColorID> houseColors__arg) :
    id(std::move(id__arg)),
    houseName(std::move(houseName__arg)),
    houseColors(std::move(houseColors__arg)) {}

void House::__clear() {
  // clear all fields
  id = 0;
  houseName = apache::thrift::StringTraits< std::string>::fromStringLiteral("");
  houseColors.reset();
}

bool House::operator==(const House& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.id == rhs.id)) {
    return false;
  }
  if (!(lhs.houseName == rhs.houseName)) {
    return false;
  }
  if (!(lhs.houseColors == rhs.houseColors)) {
    return false;
  }
  return true;
}

bool House::operator<(const House& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.id == rhs.id)) {
    return lhs.id < rhs.id;
  }
  if (!(lhs.houseName == rhs.houseName)) {
    return lhs.houseName < rhs.houseName;
  }
  if (!(lhs.houseColors == rhs.houseColors)) {
    return lhs.houseColors < rhs.houseColors;
  }
  return false;
}


void swap(House& a, House& b) {
  using ::std::swap;
  swap(a.id, b.id);
  swap(a.houseName, b.houseName);
  swap(a.houseColors, b.houseColors);
}

template void House::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t House::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t House::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t House::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void House::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t House::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t House::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t House::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // cpp2
namespace cpp2 {

Field::Field(apache::thrift::FragileConstructor,  ::cpp2::ColorID id__arg, int32_t fieldType__arg) :
    id(std::move(id__arg)),
    fieldType(std::move(fieldType__arg)) {}

void Field::__clear() {
  // clear all fields
  id = 0;
  fieldType = 5;
}

bool Field::operator==(const Field& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.id == rhs.id)) {
    return false;
  }
  if (!(lhs.fieldType == rhs.fieldType)) {
    return false;
  }
  return true;
}

bool Field::operator<(const Field& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.id == rhs.id)) {
    return lhs.id < rhs.id;
  }
  if (!(lhs.fieldType == rhs.fieldType)) {
    return lhs.fieldType < rhs.fieldType;
  }
  return false;
}


void swap(Field& a, Field& b) {
  using ::std::swap;
  swap(a.id, b.id);
  swap(a.fieldType, b.fieldType);
}

template void Field::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t Field::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t Field::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t Field::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void Field::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t Field::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t Field::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t Field::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // cpp2
