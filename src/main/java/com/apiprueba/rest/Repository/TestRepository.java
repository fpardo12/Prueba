package com.apiprueba.rest.Repository;

import com.apiprueba.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Task, Long> {
}
