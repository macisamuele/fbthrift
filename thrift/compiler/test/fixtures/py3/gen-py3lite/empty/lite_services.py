#
# Autogenerated by Thrift
#
# DO NOT EDIT
#  @generated
#
from abc import ABCMeta
import typing as _typing

import folly.iobuf as _fbthrift_iobuf

from thrift.py3lite.serializer import serialize_iobuf, deserialize, Protocol
from thrift.py3lite.server import ServiceInterface, oneway, PythonUserException

import empty.lite_types

class NullServiceInterface(
    ServiceInterface,
    metaclass=ABCMeta
):

    @staticmethod
    def service_name() -> bytes:
        return b"NullService"

    # pyre-ignore[3]: it can return anything
    def getFunctionTable(self) -> _typing.Mapping[bytes, _typing.Callable[..., _typing.Any]]:
        functionTable = {
        }
        return {**super().getFunctionTable(), **functionTable}


