package com.application_tracking_api.application_tracking_api.repository;

import com.application_tracking_api.application_tracking_api.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySQLRepository extends JpaRepository<JobApplication, Integer> {
    
}


