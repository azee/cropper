package ru.greatbit.cropper.plugins;

import org.springframework.stereotype.Component;
import ru.greatbit.cropper.plugin.CropperPlugin;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by azee on 13.04.15.
 */
@Component
public class PluginsContainer {
    private Map<String, CropperPlugin> plugins;

    public Map<String, CropperPlugin> getPlugins() {
        if (plugins == null){
            plugins = new HashMap<>();
        }
        return plugins;
    }

}
