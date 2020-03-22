package org.chessequality.helidon.mp.helidon.microprofile.starter;


import org.chessequality.helidon.mp.helidon.microprofile.starter.secure.ProtectedController;
import org.eclipse.microprofile.auth.LoginConfig;
import javax.annotation.security.DeclareRoles;


import org.chessequality.helidon.mp.helidon.microprofile.starter.client.ServiceController;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
@ApplicationPath("/data")

@LoginConfig(authMethod = "MP-JWT")
@DeclareRoles({"protected"})

@ApplicationScoped
public class HelidonmicroprofilestarterRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // resources
        
        classes.add(ServiceController.class);
        
        
        classes.add(ProtectedController.class);
        

        return classes;
    }
}
