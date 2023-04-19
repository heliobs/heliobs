package triage;
/**
 */

import static io.grpc.MethodDescriptor.generateFullMethodName;

@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TriageServiceGrpc {

  private TriageServiceGrpc() {}

  public static final String SERVICE_NAME = "TriageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<TriageDefinition.CheckInTriageProcedureRequest,
      TriageDefinition.CheckInTriageProcedureResponse> getCheckInTriageProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckInTriageProcedure",
      requestType = TriageDefinition.CheckInTriageProcedureRequest.class,
      responseType = TriageDefinition.CheckInTriageProcedureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TriageDefinition.CheckInTriageProcedureRequest,
      TriageDefinition.CheckInTriageProcedureResponse> getCheckInTriageProcedureMethod() {
    io.grpc.MethodDescriptor<TriageDefinition.CheckInTriageProcedureRequest, TriageDefinition.CheckInTriageProcedureResponse> getCheckInTriageProcedureMethod;
    if ((getCheckInTriageProcedureMethod = TriageServiceGrpc.getCheckInTriageProcedureMethod) == null) {
      synchronized (TriageServiceGrpc.class) {
        if ((getCheckInTriageProcedureMethod = TriageServiceGrpc.getCheckInTriageProcedureMethod) == null) {
          TriageServiceGrpc.getCheckInTriageProcedureMethod = getCheckInTriageProcedureMethod =
              io.grpc.MethodDescriptor.<TriageDefinition.CheckInTriageProcedureRequest, TriageDefinition.CheckInTriageProcedureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckInTriageProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TriageDefinition.CheckInTriageProcedureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TriageDefinition.CheckInTriageProcedureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriageServiceMethodDescriptorSupplier("CheckInTriageProcedure"))
              .build();
        }
      }
    }
    return getCheckInTriageProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TriageDefinition.SetStatusDiseasePatientRequest,
      TriageDefinition.SetStatusDiseasePatientResponse> getSetStatusDiseasePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetStatusDiseasePatient",
      requestType = TriageDefinition.SetStatusDiseasePatientRequest.class,
      responseType = TriageDefinition.SetStatusDiseasePatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<TriageDefinition.SetStatusDiseasePatientRequest,
      TriageDefinition.SetStatusDiseasePatientResponse> getSetStatusDiseasePatientMethod() {
    io.grpc.MethodDescriptor<TriageDefinition.SetStatusDiseasePatientRequest, TriageDefinition.SetStatusDiseasePatientResponse> getSetStatusDiseasePatientMethod;
    if ((getSetStatusDiseasePatientMethod = TriageServiceGrpc.getSetStatusDiseasePatientMethod) == null) {
      synchronized (TriageServiceGrpc.class) {
        if ((getSetStatusDiseasePatientMethod = TriageServiceGrpc.getSetStatusDiseasePatientMethod) == null) {
          TriageServiceGrpc.getSetStatusDiseasePatientMethod = getSetStatusDiseasePatientMethod =
              io.grpc.MethodDescriptor.<TriageDefinition.SetStatusDiseasePatientRequest, TriageDefinition.SetStatusDiseasePatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetStatusDiseasePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TriageDefinition.SetStatusDiseasePatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TriageDefinition.SetStatusDiseasePatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriageServiceMethodDescriptorSupplier("SetStatusDiseasePatient"))
              .build();
        }
      }
    }
    return getSetStatusDiseasePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TriageDefinition.ProcedureStep,
      TriageDefinition.AdjustProcedureStepsResponse> getAdjustProcedureStepsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustProcedureSteps",
      requestType = TriageDefinition.ProcedureStep.class,
      responseType = TriageDefinition.AdjustProcedureStepsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<TriageDefinition.ProcedureStep,
      TriageDefinition.AdjustProcedureStepsResponse> getAdjustProcedureStepsMethod() {
    io.grpc.MethodDescriptor<TriageDefinition.ProcedureStep, TriageDefinition.AdjustProcedureStepsResponse> getAdjustProcedureStepsMethod;
    if ((getAdjustProcedureStepsMethod = TriageServiceGrpc.getAdjustProcedureStepsMethod) == null) {
      synchronized (TriageServiceGrpc.class) {
        if ((getAdjustProcedureStepsMethod = TriageServiceGrpc.getAdjustProcedureStepsMethod) == null) {
          TriageServiceGrpc.getAdjustProcedureStepsMethod = getAdjustProcedureStepsMethod =
              io.grpc.MethodDescriptor.<TriageDefinition.ProcedureStep, TriageDefinition.AdjustProcedureStepsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustProcedureSteps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TriageDefinition.ProcedureStep.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TriageDefinition.AdjustProcedureStepsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriageServiceMethodDescriptorSupplier("AdjustProcedureSteps"))
              .build();
        }
      }
    }
    return getAdjustProcedureStepsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TriageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TriageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TriageServiceStub>() {
        @Override
        public TriageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TriageServiceStub(channel, callOptions);
        }
      };
    return TriageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TriageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TriageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TriageServiceBlockingStub>() {
        @Override
        public TriageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TriageServiceBlockingStub(channel, callOptions);
        }
      };
    return TriageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TriageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TriageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TriageServiceFutureStub>() {
        @Override
        public TriageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TriageServiceFutureStub(channel, callOptions);
        }
      };
    return TriageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TriageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkInTriageProcedure(TriageDefinition.CheckInTriageProcedureRequest request,
                                       io.grpc.stub.StreamObserver<TriageDefinition.CheckInTriageProcedureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckInTriageProcedureMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<TriageDefinition.SetStatusDiseasePatientRequest> setStatusDiseasePatient(
        io.grpc.stub.StreamObserver<TriageDefinition.SetStatusDiseasePatientResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSetStatusDiseasePatientMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<TriageDefinition.ProcedureStep> adjustProcedureSteps(
        io.grpc.stub.StreamObserver<TriageDefinition.AdjustProcedureStepsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAdjustProcedureStepsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckInTriageProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TriageDefinition.CheckInTriageProcedureRequest,
                TriageDefinition.CheckInTriageProcedureResponse>(
                  this, METHODID_CHECK_IN_TRIAGE_PROCEDURE)))
          .addMethod(
            getSetStatusDiseasePatientMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                TriageDefinition.SetStatusDiseasePatientRequest,
                TriageDefinition.SetStatusDiseasePatientResponse>(
                  this, METHODID_SET_STATUS_DISEASE_PATIENT)))
          .addMethod(
            getAdjustProcedureStepsMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                TriageDefinition.ProcedureStep,
                TriageDefinition.AdjustProcedureStepsResponse>(
                  this, METHODID_ADJUST_PROCEDURE_STEPS)))
          .build();
    }
  }

  /**
   */
  public static final class TriageServiceStub extends io.grpc.stub.AbstractAsyncStub<TriageServiceStub> {
    private TriageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TriageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TriageServiceStub(channel, callOptions);
    }

    /**
     */
    public void checkInTriageProcedure(TriageDefinition.CheckInTriageProcedureRequest request,
                                       io.grpc.stub.StreamObserver<TriageDefinition.CheckInTriageProcedureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckInTriageProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<TriageDefinition.SetStatusDiseasePatientRequest> setStatusDiseasePatient(
        io.grpc.stub.StreamObserver<TriageDefinition.SetStatusDiseasePatientResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSetStatusDiseasePatientMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<TriageDefinition.ProcedureStep> adjustProcedureSteps(
        io.grpc.stub.StreamObserver<TriageDefinition.AdjustProcedureStepsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAdjustProcedureStepsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TriageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TriageServiceBlockingStub> {
    private TriageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TriageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TriageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public TriageDefinition.CheckInTriageProcedureResponse checkInTriageProcedure(TriageDefinition.CheckInTriageProcedureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckInTriageProcedureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TriageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TriageServiceFutureStub> {
    private TriageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TriageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TriageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TriageDefinition.CheckInTriageProcedureResponse> checkInTriageProcedure(
        TriageDefinition.CheckInTriageProcedureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckInTriageProcedureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_IN_TRIAGE_PROCEDURE = 0;
  private static final int METHODID_SET_STATUS_DISEASE_PATIENT = 1;
  private static final int METHODID_ADJUST_PROCEDURE_STEPS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TriageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TriageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_IN_TRIAGE_PROCEDURE:
          serviceImpl.checkInTriageProcedure((TriageDefinition.CheckInTriageProcedureRequest) request,
              (io.grpc.stub.StreamObserver<TriageDefinition.CheckInTriageProcedureResponse>) responseObserver);
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
        case METHODID_SET_STATUS_DISEASE_PATIENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setStatusDiseasePatient(
              (io.grpc.stub.StreamObserver<TriageDefinition.SetStatusDiseasePatientResponse>) responseObserver);
        case METHODID_ADJUST_PROCEDURE_STEPS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.adjustProcedureSteps(
              (io.grpc.stub.StreamObserver<TriageDefinition.AdjustProcedureStepsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TriageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TriageServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return TriageDefinition.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TriageService");
    }
  }

  private static final class TriageServiceFileDescriptorSupplier
      extends TriageServiceBaseDescriptorSupplier {
    TriageServiceFileDescriptorSupplier() {}
  }

  private static final class TriageServiceMethodDescriptorSupplier
      extends TriageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TriageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TriageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TriageServiceFileDescriptorSupplier())
              .addMethod(getCheckInTriageProcedureMethod())
              .addMethod(getSetStatusDiseasePatientMethod())
              .addMethod(getAdjustProcedureStepsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
