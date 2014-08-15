package ru.greatbit.cropper.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.greatbit.cropper.beans.Video;

/**
 * Created by IntelliJ IDEA.
 * User: azee
  */
public interface VideoRepository extends PagingAndSortingRepository<Video, String> {
}
