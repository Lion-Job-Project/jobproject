package com.likelion.likelionjob.repository;

import com.likelion.likelionjob.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends JpaRepository<Resume,Integer> {
}
