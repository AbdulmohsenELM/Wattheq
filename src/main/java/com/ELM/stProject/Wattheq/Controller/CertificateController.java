package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.DTO.CertificateDTO;
import com.ELM.stProject.Wattheq.Model.Certificate;
import com.ELM.stProject.Wattheq.Service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@RestController
@RequestMapping(value = "/Certificates")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @PostMapping(value = "/AddCertificate")
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return certificateService.addCertificate(certificate);
    }

    @GetMapping(value = "/GetAllCertificates")
    public List<CertificateDTO> getAllCertificates() {
        return certificateService.getAllCertificates();
    }

    @GetMapping(value = "/GetAllCertificates/{certificateID}")
    public CertificateDTO getCertificate(@PathVariable("certificateID") int certificateID) {
        return certificateService.getCertificate(certificateID);
    }

    @PutMapping(value = "/UpdateCertificate/{certificateID}")
    public Certificate updateCertificate(@RequestBody Certificate certificate, @PathVariable("certificateID") int certificateID) {
        return certificateService.updateCertificate(certificate, certificateID);
    }

    @DeleteMapping(value = "DeleteAllCertificates")
    public void deleteAllCertificates() {
        certificateService.deleteAllCertificates();
    }

    @DeleteMapping(value = "DeleteAllCertificates/{certificateID}")
    public void deleteCertificate(@PathVariable("certificateID") int certificateID) {
        certificateService.deleteCertificate(certificateID);
    }

    @PostMapping("/UploadCertificate")
    public Certificate uploadCertificate(@RequestParam("file") MultipartFile file) {
        return certificateService.uploadCertificate(file);
    }
}