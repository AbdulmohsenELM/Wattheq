package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.Model.Certificate;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CertificateService {

    public Certificate addCertificate(Certificate certificate);
    public List<Certificate> getAllCertificates();
    public Certificate getCertificate(int certificateID);
    public Certificate updateCertificate(Certificate certificate, int certificateID);
    public void deleteCertificate (int certificateID);
    public void deleteAllCertificates();
    public Certificate uploadCertificate(MultipartFile file);
}