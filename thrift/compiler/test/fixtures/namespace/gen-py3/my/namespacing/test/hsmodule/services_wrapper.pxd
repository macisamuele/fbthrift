#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from cpython.ref cimport PyObject
from libcpp.memory cimport shared_ptr
from thrift.py3.server cimport cAsyncProcessorFactory
from folly cimport cFollyExecutor


cdef extern from "gen-py3/hsmodule/services_wrapper.h" namespace "::cpp2":
    shared_ptr[cAsyncProcessorFactory] cHsTestServiceInterface "::cpp2::HsTestServiceInterface"(PyObject *if_object, cFollyExecutor* Q) except *