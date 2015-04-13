package ru.greatbit.cropper.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.greatbit.cropper.beans.StringData;
import ru.greatbit.cropper.services.PluginsService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by azee on 13.04.15.
 */
@Component
@Path("/plugins")
public class PluginsRestService {

    @Autowired
    PluginsService pluginsService;

    @GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public StringData getAllPlugins(){
        StringData stringData = new StringData();
        stringData.getStrings().addAll(pluginsService.getAllPlugins());
        return stringData;
    }
}
