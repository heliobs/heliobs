import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceDiscovery implements Runnable {

    @Override
    public void run() {
        Logger logger = Logger.getLogger(ServiceDiscovery.class.getName());

        try {
            JmDNS jmdns = JmDNS.create();
            ServiceInfo appointment = ServiceInfo.create("_grpc._tcp.local.", "Appointment Service", 1234, "path=/appointment");
            ServiceInfo checkin = ServiceInfo.create("_grpc._tcp.local.", "Checkin Service", 5678, "path=/checkin");
            ServiceInfo triage = ServiceInfo.create("_grpc._tcp.local.", "Triage Service", 9012, "path=/triage");

            jmdns.registerService(appointment);
            jmdns.registerService(checkin);
            jmdns.registerService(triage);
        } catch (IOException e){
            logger.log(Level.SEVERE, e.getMessage());
        }
    }
}
