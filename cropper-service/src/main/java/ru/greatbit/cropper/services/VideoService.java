package ru.greatbit.cropper.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.greatbit.cropper.beans.Video;
import ru.greatbit.cropper.plugin.CropperPlugin;
import ru.greatbit.cropper.repositories.VideoRepository;

/**
 * Created by azee on 5/5/14.
 */
@Service
public class VideoService {

    @Autowired
    VideoRepository videoRepository;

    @Autowired
    PluginsService pluginsService;

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
        return save(pluginsService.getPluginByUrl(video.getOriginUurl()), video);
    }

    /**
     * Create a Video
     * @param video
     * @return
     */
    public Video createVideo(String pluginId, Video video) {
        return save(pluginsService.getPlugin(pluginId), video);
    }

    /**
     * Persist a video
     * @param plugin
     * @param video
     * @return
     */
    private Video save(CropperPlugin plugin, Video video) {
        String url = plugin.createUrl(video.getUrl(), video.getStartTime(), video.getStopTime());
        video.setUrl(url);
        return videoRepository.save(video);
    }

}
