package com.likelion.likelionjob.repository;

import com.likelion.likelionjob.entity.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostingRepository extends JpaRepository<JobPosting,Integer> {
    public JobPosting findJobPostingByCompanyName(String companyName);
}
