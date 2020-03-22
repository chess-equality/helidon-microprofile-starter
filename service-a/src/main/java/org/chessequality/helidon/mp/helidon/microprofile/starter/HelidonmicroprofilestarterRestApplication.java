package org.chessequality.helidon.mp.helidon.microprofile.starter;


import org.chessequality.helidon.mp.helidon.microprofile.starter.config.ConfigTestController;


import org.chessequality.helidon.mp.helidon.microprofile.starter.resilient.ResilienceController;


import org.chessequality.helidon.mp.helidon.microprofile.starter.metric.MetricController;


import org.chessequality.helidon.mp.helidon.microprofile.starter.secure.TestSecureController;


import org.chessequality.helidon.mp.helidon.microprofile.starter.client.ClientController;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
@ApplicationPath("/data")
@ApplicationScoped
public class HelidonmicroprofilestarterRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // resources
        classes.add(HelloController.class);
        
        classes.add(ConfigTestController.class);
        
        
        classes.add(ResilienceController.class);
        
        
        classes.add(MetricController.class);
        
        
        classes.add(ClientController.class);
        
        
        classes.add(TestSecureController.class);
        
        return classes;
    }
}
