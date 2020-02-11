package com.ELM.stProject.Wattheq.View;

import com.ELM.stProject.Wattheq.Model.Certificate;
import com.ELM.stProject.Wattheq.Repository.CertificateRepo;
import com.ELM.stProject.Wattheq.Service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateServiceImplementation implements CertificateService {

    @Autowired
    private CertificateRepo repo;

    @Override
    public Certificate addCertificate(Certificate certificate) {
        return repo.save(certificate);
    }

    @Override
    public List<Certificate> getAllCertificates() {
        return repo.findAll();
    }

    @Override
    public Certificate getCertificate(int certificateID) {
        return repo.findById(certificateID).get();
    }

    @Override
    public Certificate updateCertificate(Certificate certificate, int certificateID) {
        certificate.setCertificateID(certificateID);
        return repo.save(certificate);
    }

    @Override
    public void deleteCertificate(int certificateID) {
        repo.deleteById(certificateID);
    }

    @Override
    public void deleteAllCertificates() {
        repo.deleteAll();
    }
}
