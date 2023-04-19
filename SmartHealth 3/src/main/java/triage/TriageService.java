package triage;

import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class TriageService extends TriageServiceGrpc.TriageServiceImplBase{

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
    public void checkInTriageProcedure(TriageDefinition.CheckInTriageProcedureRequest request, StreamObserver<TriageDefinition.CheckInTriageProcedureResponse> responseObserver) {
        super.checkInTriageProcedure(request, responseObserver);
    }

    /**
     * @param responseObserver
     */
    @Override
    public StreamObserver<TriageDefinition.SetStatusDiseasePatientRequest> setStatusDiseasePatient(StreamObserver<TriageDefinition.SetStatusDiseasePatientResponse> responseObserver) {
        return super.setStatusDiseasePatient(responseObserver);
    }

    /**
     * @param responseObserver
     */
    @Override
    public StreamObserver<TriageDefinition.ProcedureStep> adjustProcedureSteps(StreamObserver<TriageDefinition.AdjustProcedureStepsResponse> responseObserver) {
        return super.adjustProcedureSteps(responseObserver);
    }
}
