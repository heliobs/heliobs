package checkin;

import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class CheckinService extends CheckInServiceGrpc.VisitorsCheckInServiceImplBase{
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
     * @param request
     * @param responseObserver
     */
    @Override
    public void createNewVisitor(CheckinDefinition.CreateNewVisitorRequest request, StreamObserver<CheckinDefinition.CreateNewVisitorResponse> responseObserver) {
        super.createNewVisitor(request, responseObserver);
    }

    /**
     * @param responseObserver
     */
    @Override
    public StreamObserver<CheckinDefinition.VisitorStatusRequest> visitorStatus(StreamObserver<CheckinDefinition.VisitorStatusResponse> responseObserver) {
        return super.visitorStatus(responseObserver);
    }

    /**
     * @param responseObserver
     */
    @Override
    public StreamObserver<CheckinDefinition.InpatientVisitorRequest> inpatientVisitors(StreamObserver<CheckinDefinition.InpatientVisitorResponse> responseObserver) {
        return super.inpatientVisitors(responseObserver);
    }
}
