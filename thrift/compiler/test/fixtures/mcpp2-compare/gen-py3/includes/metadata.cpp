/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include "gen-py3/includes/metadata.h"

#include <thrift/lib/py3/metadata.h>

namespace a {
namespace different {
namespace ns {
::apache::thrift::metadata::ThriftMetadata includes_getThriftModuleMetadata() {
  ::apache::thrift::metadata::ThriftMetadata metadata;
  ::apache::thrift::metadata::ThriftServiceContext serviceContext;
  ::apache::thrift::detail::md::EnumMetadata<AnEnum>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<AStruct>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<AStructB>::gen(metadata);
  return metadata;
}
} // namespace a
} // namespace different
} // namespace ns