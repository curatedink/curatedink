package com.curatedink.repositories;

import com.curatedink.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagesDao extends JpaRepository<Image, Long> {

}
