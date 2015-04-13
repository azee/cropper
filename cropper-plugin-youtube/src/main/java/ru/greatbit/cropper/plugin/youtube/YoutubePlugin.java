package ru.greatbit.cropper.plugin.youtube;

import ru.greatbit.cropper.plugin.CropperPlugin;
import ru.greatbit.cropper.plugin.CropperPluginMeta;

/**
 * Created by azee on 13.04.15.
 */
@CropperPluginMeta(name = "youtube")
public class YoutubePlugin implements CropperPlugin {
    @Override
    public boolean urlRecognized(String url) {
        return url.contains("youtube");
    }

    @Override
    public String createUrl(String sourceUrl, long startTime, long stopTime) {
        return sourceUrl;
    }
}
