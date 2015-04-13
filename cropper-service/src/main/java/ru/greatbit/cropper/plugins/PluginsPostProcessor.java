package ru.greatbit.cropper.plugins;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import ru.greatbit.cropper.plugin.CropperPlugin;
import ru.greatbit.cropper.plugin.CropperPluginMeta;

import java.util.LinkedList;
import java.util.List;

import static org.springframework.util.StringUtils.isEmpty;

/**
 * Created by azee on 13.04.15.
 */
public class PluginsPostProcessor implements BeanPostProcessor {

    @Autowired
    private PluginsContainer pluginContainer;

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if (o instanceof CropperPlugin){
            String name;
            CropperPluginMeta annotation = o.getClass().getAnnotation(ru.greatbit.cropper.plugin.CropperPluginMeta.class);
            if (annotation != null && !isEmpty(annotation.name())){
                name = annotation.name();
            } else {
                name = o.getClass().getSimpleName().toLowerCase();
            }
            pluginContainer.getPlugins().put(name, (CropperPlugin) o);
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
