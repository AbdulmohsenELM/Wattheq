package com.ELM.stProject.Wattheq.View;

import com.ELM.stProject.Wattheq.Model.Certificate;
import com.ELM.stProject.Wattheq.Repository.CertificateRepo;
import com.ELM.stProject.Wattheq.Service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
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
        Certificate newCert = getCertificate(certificateID);
        certificate.setCertificateID(certificateID);
        certificate.setCertificateName(newCert.getCertificateName());
        certificate.setCertificateDocument(newCert.getCertificateDocument());
        certificate.setCertificateType(newCert.getCertificateType());
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

    @Override
    public Certificate uploadCertificate(MultipartFile file) {
        try {
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            Certificate certificate = new Certificate(fileName, file.getContentType(), file.getBytes());
            return repo.save(certificate);
        }
        catch(IOException e) {
            return null;
        }
    }
}
