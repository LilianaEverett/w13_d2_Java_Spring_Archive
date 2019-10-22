package com.example.archiveservice.repositories;

import com.example.archiveservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@RepositoryRestResource()
public interface FileRepository extends JpaRepository<File, Long> {
}
