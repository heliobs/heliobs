import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: appointment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AppointmentServiceGrpc {

  private AppointmentServiceGrpc() {}

  public static final String SERVICE_NAME = "AppointmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      AppointmentOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAppointment",
      requestType = AppointmentOuterClass.Appointment.class,
      responseType = AppointmentOuterClass.CreateAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      AppointmentOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod() {
    io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment, AppointmentOuterClass.CreateAppointmentResponse> getCreateAppointmentMethod;
    if ((getCreateAppointmentMethod = AppointmentServiceGrpc.getCreateAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getCreateAppointmentMethod = AppointmentServiceGrpc.getCreateAppointmentMethod) == null) {
          AppointmentServiceGrpc.getCreateAppointmentMethod = getCreateAppointmentMethod =
              io.grpc.MethodDescriptor.<AppointmentOuterClass.Appointment, AppointmentOuterClass.CreateAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.CreateAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("CreateAppointment"))
              .build();
        }
      }
    }
    return getCreateAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      AppointmentOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyAppointment",
      requestType = AppointmentOuterClass.Appointment.class,
      responseType = AppointmentOuterClass.ModifyAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment,
      AppointmentOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod() {
    io.grpc.MethodDescriptor<AppointmentOuterClass.Appointment, AppointmentOuterClass.ModifyAppointmentResponse> getModifyAppointmentMethod;
    if ((getModifyAppointmentMethod = AppointmentServiceGrpc.getModifyAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getModifyAppointmentMethod = AppointmentServiceGrpc.getModifyAppointmentMethod) == null) {
          AppointmentServiceGrpc.getModifyAppointmentMethod = getModifyAppointmentMethod =
              io.grpc.MethodDescriptor.<AppointmentOuterClass.Appointment, AppointmentOuterClass.ModifyAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.ModifyAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("ModifyAppointment"))
              .build();
        }
      }
    }
    return getModifyAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentOuterClass.CancelAppointmentRequest,
      AppointmentOuterClass.CancelAppointmentResponse> getCancelAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelAppointment",
      requestType = AppointmentOuterClass.CancelAppointmentRequest.class,
      responseType = AppointmentOuterClass.CancelAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentOuterClass.CancelAppointmentRequest,
      AppointmentOuterClass.CancelAppointmentResponse> getCancelAppointmentMethod() {
    io.grpc.MethodDescriptor<AppointmentOuterClass.CancelAppointmentRequest, AppointmentOuterClass.CancelAppointmentResponse> getCancelAppointmentMethod;
    if ((getCancelAppointmentMethod = AppointmentServiceGrpc.getCancelAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getCancelAppointmentMethod = AppointmentServiceGrpc.getCancelAppointmentMethod) == null) {
          AppointmentServiceGrpc.getCancelAppointmentMethod = getCancelAppointmentMethod =
              io.grpc.MethodDescriptor.<AppointmentOuterClass.CancelAppointmentRequest, AppointmentOuterClass.CancelAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.CancelAppointmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentOuterClass.CancelAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("CancelAppointment"))
              .build();
        }
      }
    }
    return getCancelAppointmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppointmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceStub>() {
        @Override
        public AppointmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceStub(channel, callOptions);
        }
      };
    return AppointmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppointmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceBlockingStub>() {
        @Override
        public AppointmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceBlockingStub(channel, callOptions);
        }
      };
    return AppointmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppointmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceFutureStub>() {
        @Override
        public AppointmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceFutureStub(channel, callOptions);
        }
      };
    return AppointmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<AppointmentOuterClass.Appointment> createAppointment(
        io.grpc.stub.StreamObserver<AppointmentOuterClass.CreateAppointmentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateAppointmentMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<AppointmentOuterClass.Appointment> modifyAppointment(
        io.grpc.stub.StreamObserver<AppointmentOuterClass.ModifyAppointmentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getModifyAppointmentMethod(), responseObserver);
    }

    /**
     */
    default void cancelAppointment(AppointmentOuterClass.CancelAppointmentRequest request,
        io.grpc.stub.StreamObserver<AppointmentOuterClass.CancelAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelAppointmentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AppointmentService.
   */
  public static abstract class AppointmentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return AppointmentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AppointmentService.
   */
  public static final class AppointmentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AppointmentServiceStub> {
    private AppointmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AppointmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<AppointmentOuterClass.Appointment> createAppointment(
        io.grpc.stub.StreamObserver<AppointmentOuterClass.CreateAppointmentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateAppointmentMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<AppointmentOuterClass.Appointment> modifyAppointment(
        io.grpc.stub.StreamObserver<AppointmentOuterClass.ModifyAppointmentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getModifyAppointmentMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void cancelAppointment(AppointmentOuterClass.CancelAppointmentRequest request,
        io.grpc.stub.StreamObserver<AppointmentOuterClass.CancelAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelAppointmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AppointmentService.
   */
  public static final class AppointmentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AppointmentServiceBlockingStub> {
    private AppointmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AppointmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public AppointmentOuterClass.CancelAppointmentResponse cancelAppointment(AppointmentOuterClass.CancelAppointmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelAppointmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AppointmentService.
   */
  public static final class AppointmentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AppointmentServiceFutureStub> {
    private AppointmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AppointmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AppointmentOuterClass.CancelAppointmentResponse> cancelAppointment(
        AppointmentOuterClass.CancelAppointmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelAppointmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CANCEL_APPOINTMENT = 0;
  private static final int METHODID_CREATE_APPOINTMENT = 1;
  private static final int METHODID_MODIFY_APPOINTMENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CANCEL_APPOINTMENT:
          serviceImpl.cancelAppointment((AppointmentOuterClass.CancelAppointmentRequest) request,
              (io.grpc.stub.StreamObserver<AppointmentOuterClass.CancelAppointmentResponse>) responseObserver);
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
        case METHODID_CREATE_APPOINTMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createAppointment(
              (io.grpc.stub.StreamObserver<AppointmentOuterClass.CreateAppointmentResponse>) responseObserver);
        case METHODID_MODIFY_APPOINTMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.modifyAppointment(
              (io.grpc.stub.StreamObserver<AppointmentOuterClass.ModifyAppointmentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              AppointmentOuterClass.Appointment,
              AppointmentOuterClass.CreateAppointmentResponse>(
                service, METHODID_CREATE_APPOINTMENT)))
        .addMethod(
          getModifyAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              AppointmentOuterClass.Appointment,
              AppointmentOuterClass.ModifyAppointmentResponse>(
                service, METHODID_MODIFY_APPOINTMENT)))
        .addMethod(
          getCancelAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              AppointmentOuterClass.CancelAppointmentRequest,
              AppointmentOuterClass.CancelAppointmentResponse>(
                service, METHODID_CANCEL_APPOINTMENT)))
        .build();
  }

  private static abstract class AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppointmentServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return AppointmentOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppointmentService");
    }
  }

  private static final class AppointmentServiceFileDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier {
    AppointmentServiceFileDescriptorSupplier() {}
  }

  private static final class AppointmentServiceMethodDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppointmentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppointmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppointmentServiceFileDescriptorSupplier())
              .addMethod(getCreateAppointmentMethod())
              .addMethod(getModifyAppointmentMethod())
              .addMethod(getCancelAppointmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
