package ru.greatbit.cropper.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.greatbit.cropper.beans.Video;
import ru.greatbit.cropper.repositories.VideoRepository;

/**
 * Created by azee on 5/5/14.
 */
@Service
public class VideoService {

    @Autowired
    VideoRepository videoRepository;

    /**
     * Find a Video by id
     * @param id
     * @return
     */
    public Video getVideo(String id){
        return videoRepository.findOne(id);
    }

    /**
     * Create a Video
     * @param video
     * @return
     */
    public Video createVideo(Video video){
        return videoRepository.save(video);
    }

}
