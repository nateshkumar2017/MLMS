package com.mlms.repo;

import com.mlms.entities.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReportGenerateRepo extends JpaRepository<TestResult,String> {

}
