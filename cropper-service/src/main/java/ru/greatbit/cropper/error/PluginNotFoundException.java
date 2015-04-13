package ru.greatbit.cropper.error;

/**
 * Created by azee on 13.04.15.
 */
public class PluginNotFoundException extends RuntimeException {

    public PluginNotFoundException() {
        super();
    }

    public PluginNotFoundException(String message) {
        super(message);
    }
}
