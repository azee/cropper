package ru.greatbit.cropper.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.greatbit.cropper.beans.Video;
import ru.greatbit.cropper.services.VideoService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by azee on 5/5/14.
 */
@Component
@Path("/video")
public class VideoRest {

    @Autowired
    VideoService videoService;

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/{id}")
    public Video getVideo(@PathParam("id") String id){
        return videoService.getVideo(id);
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/")
    public Video saveVideo(Video video){
        return videoService.createVideo(video);
    }
}
