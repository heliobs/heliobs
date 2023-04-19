package checkin;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: checkin.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CheckInServiceGrpc {

  private CheckInServiceGrpc() {}

  public static final String SERVICE_NAME = "VisitorsCheckInService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CheckinDefinition.CreateNewVisitorRequest,
      CheckinDefinition.CreateNewVisitorResponse> getCreateNewVisitorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNewVisitor",
      requestType = CheckinDefinition.CreateNewVisitorRequest.class,
      responseType = CheckinDefinition.CreateNewVisitorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CheckinDefinition.CreateNewVisitorRequest,
      CheckinDefinition.CreateNewVisitorResponse> getCreateNewVisitorMethod() {
    io.grpc.MethodDescriptor<CheckinDefinition.CreateNewVisitorRequest, CheckinDefinition.CreateNewVisitorResponse> getCreateNewVisitorMethod;
    if ((getCreateNewVisitorMethod = CheckInServiceGrpc.getCreateNewVisitorMethod) == null) {
      synchronized (CheckInServiceGrpc.class) {
        if ((getCreateNewVisitorMethod = CheckInServiceGrpc.getCreateNewVisitorMethod) == null) {
          CheckInServiceGrpc.getCreateNewVisitorMethod = getCreateNewVisitorMethod =
              io.grpc.MethodDescriptor.<CheckinDefinition.CreateNewVisitorRequest, CheckinDefinition.CreateNewVisitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNewVisitor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckinDefinition.CreateNewVisitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckinDefinition.CreateNewVisitorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisitorsCheckInServiceMethodDescriptorSupplier("CreateNewVisitor"))
              .build();
        }
      }
    }
    return getCreateNewVisitorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CheckinDefinition.VisitorStatusRequest,
      CheckinDefinition.VisitorStatusResponse> getVisitorStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VisitorStatus",
      requestType = CheckinDefinition.VisitorStatusRequest.class,
      responseType = CheckinDefinition.VisitorStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<CheckinDefinition.VisitorStatusRequest,
      CheckinDefinition.VisitorStatusResponse> getVisitorStatusMethod() {
    io.grpc.MethodDescriptor<CheckinDefinition.VisitorStatusRequest, CheckinDefinition.VisitorStatusResponse> getVisitorStatusMethod;
    if ((getVisitorStatusMethod = CheckInServiceGrpc.getVisitorStatusMethod) == null) {
      synchronized (CheckInServiceGrpc.class) {
        if ((getVisitorStatusMethod = CheckInServiceGrpc.getVisitorStatusMethod) == null) {
          CheckInServiceGrpc.getVisitorStatusMethod = getVisitorStatusMethod =
              io.grpc.MethodDescriptor.<CheckinDefinition.VisitorStatusRequest, CheckinDefinition.VisitorStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VisitorStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckinDefinition.VisitorStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckinDefinition.VisitorStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisitorsCheckInServiceMethodDescriptorSupplier("VisitorStatus"))
              .build();
        }
      }
    }
    return getVisitorStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CheckinDefinition.InpatientVisitorRequest,
      CheckinDefinition.InpatientVisitorResponse> getInpatientVisitorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InpatientVisitors",
      requestType = CheckinDefinition.InpatientVisitorRequest.class,
      responseType = CheckinDefinition.InpatientVisitorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<CheckinDefinition.InpatientVisitorRequest,
      CheckinDefinition.InpatientVisitorResponse> getInpatientVisitorsMethod() {
    io.grpc.MethodDescriptor<CheckinDefinition.InpatientVisitorRequest, CheckinDefinition.InpatientVisitorResponse> getInpatientVisitorsMethod;
    if ((getInpatientVisitorsMethod = CheckInServiceGrpc.getInpatientVisitorsMethod) == null) {
      synchronized (CheckInServiceGrpc.class) {
        if ((getInpatientVisitorsMethod = CheckInServiceGrpc.getInpatientVisitorsMethod) == null) {
          CheckInServiceGrpc.getInpatientVisitorsMethod = getInpatientVisitorsMethod =
              io.grpc.MethodDescriptor.<CheckinDefinition.InpatientVisitorRequest, CheckinDefinition.InpatientVisitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InpatientVisitors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckinDefinition.InpatientVisitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckinDefinition.InpatientVisitorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VisitorsCheckInServiceMethodDescriptorSupplier("InpatientVisitors"))
              .build();
        }
      }
    }
    return getInpatientVisitorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VisitorsCheckInServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VisitorsCheckInServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VisitorsCheckInServiceStub>() {
        @Override
        public VisitorsCheckInServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VisitorsCheckInServiceStub(channel, callOptions);
        }
      };
    return VisitorsCheckInServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VisitorsCheckInServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VisitorsCheckInServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VisitorsCheckInServiceBlockingStub>() {
        @Override
        public VisitorsCheckInServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VisitorsCheckInServiceBlockingStub(channel, callOptions);
        }
      };
    return VisitorsCheckInServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VisitorsCheckInServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VisitorsCheckInServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VisitorsCheckInServiceFutureStub>() {
        @Override
        public VisitorsCheckInServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VisitorsCheckInServiceFutureStub(channel, callOptions);
        }
      };
    return VisitorsCheckInServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class VisitorsCheckInServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createNewVisitor(CheckinDefinition.CreateNewVisitorRequest request,
                                 io.grpc.stub.StreamObserver<CheckinDefinition.CreateNewVisitorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNewVisitorMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CheckinDefinition.VisitorStatusRequest> visitorStatus(
        io.grpc.stub.StreamObserver<CheckinDefinition.VisitorStatusResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getVisitorStatusMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CheckinDefinition.InpatientVisitorRequest> inpatientVisitors(
        io.grpc.stub.StreamObserver<CheckinDefinition.InpatientVisitorResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getInpatientVisitorsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNewVisitorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                CheckinDefinition.CreateNewVisitorRequest,
                CheckinDefinition.CreateNewVisitorResponse>(
                  this, METHODID_CREATE_NEW_VISITOR)))
          .addMethod(
            getVisitorStatusMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                CheckinDefinition.VisitorStatusRequest,
                CheckinDefinition.VisitorStatusResponse>(
                  this, METHODID_VISITOR_STATUS)))
          .addMethod(
            getInpatientVisitorsMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                CheckinDefinition.InpatientVisitorRequest,
                CheckinDefinition.InpatientVisitorResponse>(
                  this, METHODID_INPATIENT_VISITORS)))
          .build();
    }
  }

  /**
   */
  public static final class VisitorsCheckInServiceStub extends io.grpc.stub.AbstractAsyncStub<VisitorsCheckInServiceStub> {
    private VisitorsCheckInServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VisitorsCheckInServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VisitorsCheckInServiceStub(channel, callOptions);
    }

    /**
     */
    public void createNewVisitor(CheckinDefinition.CreateNewVisitorRequest request,
                                 io.grpc.stub.StreamObserver<CheckinDefinition.CreateNewVisitorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNewVisitorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CheckinDefinition.VisitorStatusRequest> visitorStatus(
        io.grpc.stub.StreamObserver<CheckinDefinition.VisitorStatusResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getVisitorStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CheckinDefinition.InpatientVisitorRequest> inpatientVisitors(
        io.grpc.stub.StreamObserver<CheckinDefinition.InpatientVisitorResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getInpatientVisitorsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class VisitorsCheckInServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VisitorsCheckInServiceBlockingStub> {
    private VisitorsCheckInServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VisitorsCheckInServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VisitorsCheckInServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public CheckinDefinition.CreateNewVisitorResponse createNewVisitor(CheckinDefinition.CreateNewVisitorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNewVisitorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VisitorsCheckInServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VisitorsCheckInServiceFutureStub> {
    private VisitorsCheckInServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VisitorsCheckInServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VisitorsCheckInServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CheckinDefinition.CreateNewVisitorResponse> createNewVisitor(
        CheckinDefinition.CreateNewVisitorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNewVisitorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NEW_VISITOR = 0;
  private static final int METHODID_VISITOR_STATUS = 1;
  private static final int METHODID_INPATIENT_VISITORS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VisitorsCheckInServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VisitorsCheckInServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NEW_VISITOR:
          serviceImpl.createNewVisitor((CheckinDefinition.CreateNewVisitorRequest) request,
              (io.grpc.stub.StreamObserver<CheckinDefinition.CreateNewVisitorResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VISITOR_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.visitorStatus(
              (io.grpc.stub.StreamObserver<CheckinDefinition.VisitorStatusResponse>) responseObserver);
        case METHODID_INPATIENT_VISITORS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.inpatientVisitors(
              (io.grpc.stub.StreamObserver<CheckinDefinition.InpatientVisitorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class VisitorsCheckInServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VisitorsCheckInServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CheckinDefinition.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VisitorsCheckInService");
    }
  }

  private static final class VisitorsCheckInServiceFileDescriptorSupplier
      extends VisitorsCheckInServiceBaseDescriptorSupplier {
    VisitorsCheckInServiceFileDescriptorSupplier() {}
  }

  private static final class VisitorsCheckInServiceMethodDescriptorSupplier
      extends VisitorsCheckInServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VisitorsCheckInServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CheckInServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VisitorsCheckInServiceFileDescriptorSupplier())
              .addMethod(getCreateNewVisitorMethod())
              .addMethod(getVisitorStatusMethod())
              .addMethod(getInpatientVisitorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
