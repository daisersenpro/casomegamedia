package com.anyelo.repository;

import com.anyelo.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
    List<PostEntity> findByUserId(Long userId);
    List<PostEntity> findByTitleContainingIgnoreCase(String title);
}
