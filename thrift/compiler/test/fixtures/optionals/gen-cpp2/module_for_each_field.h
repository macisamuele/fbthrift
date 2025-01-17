/**
 * Autogenerated by Thrift for src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#pragma once

#include "thrift/compiler/test/fixtures/optionals/gen-cpp2/module_metadata.h"
#include <thrift/lib/cpp2/visitation/for_each.h>

namespace apache {
namespace thrift {
namespace detail {

template <>
struct ForEachField<::cpp2::Color> {
  template <typename F, typename... T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, FOLLY_MAYBE_UNUSED T&&... t) const {
    f(0, static_cast<T&&>(t).red_ref()...);
    f(1, static_cast<T&&>(t).green_ref()...);
    f(2, static_cast<T&&>(t).blue_ref()...);
    f(3, static_cast<T&&>(t).alpha_ref()...);
  }
};

template <>
struct ForEachField<::cpp2::Vehicle> {
  template <typename F, typename... T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, FOLLY_MAYBE_UNUSED T&&... t) const {
    f(0, static_cast<T&&>(t).color_ref()...);
    f(1, static_cast<T&&>(t).licensePlate_ref()...);
    f(2, static_cast<T&&>(t).description_ref()...);
    f(3, static_cast<T&&>(t).name_ref()...);
    f(4, static_cast<T&&>(t).hasAC_ref()...);
  }
};

template <>
struct ForEachField<::cpp2::Person> {
  template <typename F, typename... T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, FOLLY_MAYBE_UNUSED T&&... t) const {
    f(0, static_cast<T&&>(t).id_ref()...);
    f(1, static_cast<T&&>(t).name_ref()...);
    f(2, static_cast<T&&>(t).age_ref()...);
    f(3, static_cast<T&&>(t).address_ref()...);
    f(4, static_cast<T&&>(t).favoriteColor_ref()...);
    f(5, static_cast<T&&>(t).friends_ref()...);
    f(6, static_cast<T&&>(t).bestFriend_ref()...);
    f(7, static_cast<T&&>(t).petNames_ref()...);
    f(8, static_cast<T&&>(t).afraidOfAnimal_ref()...);
    f(9, static_cast<T&&>(t).vehicles_ref()...);
  }
};
} // namespace detail
} // namespace thrift
} // namespace apache
