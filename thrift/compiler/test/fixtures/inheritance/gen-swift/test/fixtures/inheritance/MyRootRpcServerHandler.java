/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.inheritance;

import java.util.*;
import org.apache.thrift.protocol.*;

public class MyRootRpcServerHandler 
  implements com.facebook.thrift.server.RpcServerHandler {

  private final java.util.Map<String, com.facebook.thrift.server.RpcServerHandler> _methodMap;

  private final MyRoot.Reactive _delegate;

  private final java.util.List<com.facebook.thrift.payload.Reader> _doRootReaders;

  private final java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers;

  public MyRootRpcServerHandler(MyRoot _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    this(new MyRootBlockingReactiveWrapper(_delegate), _eventHandlers);
  }

  public MyRootRpcServerHandler(MyRoot.Async _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    this(new MyRootAsyncReactiveWrapper(_delegate), _eventHandlers);
  }

  public MyRootRpcServerHandler(MyRoot.Reactive _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    
    this._methodMap = new java.util.HashMap<>();
    this._delegate = _delegate;
    this._eventHandlers = _eventHandlers;

    _methodMap.put("doRoot", this);
    _doRootReaders = _create_doRoot_request_readers();

  }

  private static java.util.List<com.facebook.thrift.payload.Reader> _create_doRoot_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();


    return _readerList;
  }

  private static com.facebook.thrift.payload.Writer _create_doRoot_response_writer(
      final Object _r,
      final com.facebook.swift.service.ContextChain _chain,
      final int _seqId) {
      return oprot -> {
      try {
        oprot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("doRoot", TMessageType.REPLY, _seqId));
        oprot.writeStructBegin(com.facebook.thrift.util.GeneratedUtil.TSTRUCT);

        

        oprot.writeFieldBegin(com.facebook.thrift.util.GeneratedUtil.VOID_FIELD);


        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        oprot.writeMessageEnd();

        _chain.postWrite(_r);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }


  private static reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload>
    _dodoRoot(
    MyRoot.Reactive _delegate,
    String _name,
    com.facebook.thrift.payload.ServerRequestPayload _payload,
    java.util.List<com.facebook.thrift.payload.Reader> _readers,
    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    final com.facebook.swift.service.ContextChain _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
          _chain.preRead();
          java.util.List<Object>_data = _payload.getData(_readers);
          java.util.Iterator<Object> _iterator = _data.iterator();


          _chain.postRead(_data);

          reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _internalResponse =
            _delegate
            .doRoot()
            .map(_response -> {
              _chain.preWrite(_response);
              com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                  _payload,
                  _create_doRoot_response_writer(_response, _chain, _payload.getMessageSeqId()));

                return _serverResponsePayload;
            })
            .switchIfEmpty(
              reactor.core.publisher.Mono.fromSupplier(
                () -> {
                  _chain.preWrite(null);
                  return com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                    _payload,
                    _create_doRoot_response_writer(null, _chain, _payload.getMessageSeqId()));
                }
              )
            )
            .<com.facebook.thrift.payload.ServerResponsePayload>onErrorResume(_t -> {
                _chain.preWriteException(_t);
                com.facebook.thrift.payload.Writer _exceptionWriter = null;

                // exception is not of user declared type
                String _errorMessage = String.format("Internal error processing doRoot: %s", _t.getMessage() == null ? "<null>" : _t.getMessage());
                org.apache.thrift.TApplicationException _tApplicationException =
                    new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, _errorMessage);
                _tApplicationException.initCause(_t);
                _exceptionWriter = com.facebook.thrift.util.GeneratedUtil.getTApplicationExceptionWriter("doRoot", _tApplicationException, _chain, _payload.getMessageSeqId());
                com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                    com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                        _payload,
                        _exceptionWriter);

                return reactor.core.publisher.Mono.just(_serverResponsePayload);
            });
          if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
            _internalResponse = _internalResponse.publishOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
          }

          return _internalResponse;
  }

  @Override
  public reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> singleRequestSingleResponse(com.facebook.thrift.payload.ServerRequestPayload _payload) {
    final String _name = _payload.getRequestRpcMetadata().getName();

    reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _result;
    try {
      switch (_name) {
        case "doRoot":
          _result = _dodoRoot(_delegate, _name, _payload, _doRootReaders, _eventHandlers);
        break;
        default: {
          _result = reactor.core.publisher.Mono.error(new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.UNKNOWN_METHOD, "no method found with name " + _name));
        }
      }
    } catch (Throwable _t) {
      _result = reactor.core.publisher.Mono.error(_t);
    }

    return _result;
  }

  public java.util.Map<String, com.facebook.thrift.server.RpcServerHandler> getMethodMap() {
      return _methodMap;
  }

}
