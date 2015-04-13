package ru.greatbit.cropper.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.greatbit.cropper.error.PluginNotFoundException;
import ru.greatbit.cropper.plugin.CropperPlugin;
import ru.greatbit.cropper.plugins.PluginsContainer;

import java.util.Set;

/**
 * Created by azee on 13.04.15.
 */
@Service
public class PluginsService {

    @Autowired
    private PluginsContainer pluginContainer;

    public Set<String> getAllPlugins(){
        return pluginContainer.getPlugins().keySet();
    }

    public CropperPlugin getPlugin(String pluginId){
        return pluginContainer.getPlugins().get(pluginId);
    }

    public CropperPlugin getPluginByUrl(String url){
        for (String pluginId : pluginContainer.getPlugins().keySet()){
            CropperPlugin plugin = pluginContainer.getPlugins().get(pluginId);
            if (plugin.urlRecognized(url)){
                return plugin;
            }
        }
        throw new PluginNotFoundException();
    }
}
