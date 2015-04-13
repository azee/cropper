package ru.greatbit.cropper.plugin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by azee on 13.04.15.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface CropperPluginMeta{
    String name() default "";
}
