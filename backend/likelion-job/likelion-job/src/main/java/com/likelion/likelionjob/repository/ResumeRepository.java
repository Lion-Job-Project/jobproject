package com.likelion.likelionjob.repository;

import com.likelion.likelionjob.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeRepository extends JpaRepository<Resume,Integer> {
//    @Query("select r from Resume r where r.user.name= :name and r.jobPosting.companyName= :companyName")
//    public List<Resume> findResumeByNameAndCompanyname(@Param("name") String name, @Param("companyName") String companyName);

    @Query("select r from Resume r where r.user.name= :name")
    public List<Resume> findResumeByName(@Param("name") String name);
}
