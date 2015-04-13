package ru.greatbit.cropper.plugin;

/**
 * Created by azee on 13.04.15.
 */
public interface CropperPlugin {
    public boolean urlRecognized(String url);
    public String createUrl(String sourceUrl, long startTime, long stopTime);
}
