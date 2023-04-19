import appointment.AppointmentService;
import checkin.CheckinService;
import triage.TriageService;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Logger;

public class App implements ServiceListener {
    static Logger logger = Logger.getLogger(App.class.getName());
    // Create a JmDNS instance
    JmDNS jmdns;


    private CheckinService checkinService;
    private AppointmentService appointmentService;
    private TriageService triageService;

    public App() throws IOException {
        checkinService = new CheckinService();
        appointmentService = new AppointmentService();
        triageService = new TriageService();
        try {
            jmdns = JmDNS.create(InetAddress.getLocalHost());
        } catch (IOException e) {
            logger.warning("Cannot get local host");
            System.exit(1);
        }

        jmdns.addServiceListener("_grpc._tcp.local.", this);


    }

    public static void main(String[] args) {
        // Add service Listeners
        // Define the services
        Thread serviceDiscovery = new Thread(new ServiceDiscovery());
        serviceDiscovery.start();
        logger.info("SERVICES REGISTERED");
        logger.info("BINDING SERVICES");

    }

    /**
     * A service has been added.<br/>
     * <b>Note:</b>This event is only the service added event. The service info associated with this event does not include resolution information.<br/>
     * To get the full resolved information you need to listen to {@link #serviceResolved(ServiceEvent)} or call {@link JmDNS#getServiceInfo(String, String, long)}
     *
     * <pre>
     *  ServiceInfo info = event.getDNS().getServiceInfo(event.getType(), event.getName())
     * </pre>
     * <p>
     * Please note that service resolution may take a few second to resolve.
     * </p>
     *
     * @param event The ServiceEvent providing the name and fully qualified type of the service.
     */
    @Override
    public void serviceAdded(ServiceEvent event) {
        logger.info("Service added: " + event.getName());
    }

    /**
     * A service has been removed.
     *
     * @param event The ServiceEvent providing the name and fully qualified type of the service.
     */
    @Override
    public void serviceRemoved(ServiceEvent event) {

    }

    /**
     * A service has been resolved. Its details are now available in the ServiceInfo record.<br/>
     * <b>Note:</b>This call back will never be called if the service does not resolve.<br/>
     *
     * @param event The ServiceEvent providing the name, the fully qualified type of the service, and the service info record.
     */
    @Override
    public void serviceResolved(ServiceEvent event) {

    }
}
