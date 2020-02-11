package com.ELM.stProject.Wattheq.Repository;

import com.ELM.stProject.Wattheq.Model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificateRepo extends JpaRepository<Certificate, Integer> {
    @Override
    List<Certificate> findAll();
}
