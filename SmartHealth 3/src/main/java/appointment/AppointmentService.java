package appointment;

import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class AppointmentService  extends AppointmentServiceGrpc.AppointmentServiceImplBase{

    private Server server;
    public void startServer(String port) throws Exception{
        this.server = Grpc.newServerBuilderForPort(Integer.parseInt(port), InsecureServerCredentials.create())
                .addService(this)
                .build()
                .start();

    }


    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
    /**
     * @param responseObserver
     */
    @Override
    public StreamObserver<AppointmentDefinition.Appointment> createAppointment(StreamObserver<AppointmentDefinition.CreateAppointmentResponse> responseObserver) {
        return super.createAppointment(responseObserver);
    }

    /**
     * @param responseObserver
     */
    @Override
    public StreamObserver<AppointmentDefinition.Appointment> modifyAppointment(StreamObserver<AppointmentDefinition.ModifyAppointmentResponse> responseObserver) {
        return super.modifyAppointment(responseObserver);
    }

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void cancelAppointment(AppointmentDefinition.CancelAppointmentRequest request, StreamObserver<AppointmentDefinition.CancelAppointmentResponse> responseObserver) {
        super.cancelAppointment(request, responseObserver);
    }
}
