package com.application_tracking_api.application_tracking_api.controller;

import com.application_tracking_api.application_tracking_api.repository.MySQLRepository;
import com.application_tracking_api.application_tracking_api.model.JobApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    MySQLRepository mySQLRepository;

    @GetMapping("/")
    public String getHome() {
        return "HOME";
    }

    @GetMapping("/jobapplication")
    public List<JobApplication> getAllJobApplications() {
        return mySQLRepository.findAll();
    }

    @GetMapping("/jobapplication/{identity}")
    public ResponseEntity<?> getSingleJobApplication(@PathVariable("identity") Integer id) {
        Optional<JobApplication> jobApplicationOptional = mySQLRepository.findById(id);
        if (jobApplicationOptional.isPresent()) {
            return ResponseEntity.ok(jobApplicationOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/jobapplication/updates/{identity}")
    public ResponseEntity<?> updateJobApplication(@PathVariable("identity") Integer id, @RequestBody JobApplication requestBody) {
        Optional<JobApplication> optionalJobApplication = mySQLRepository.findById(id);
        if (optionalJobApplication.isPresent()) {
            JobApplication current = optionalJobApplication.get();
            // Update fields based on the request body
            current.setJob(requestBody.getJob());
            current.setDescription(requestBody.getDescription());
            current.setCompany(requestBody.getCompany());
            current.setJobPostingLink(requestBody.getJobPostingLink());
            current.setResume(requestBody.getResume());
            current.setCoverLetter(requestBody.getCoverLetter());
            current.setScreeningInterview(requestBody.getScreeningInterview());
            current.setDateOfScreeningInterview(requestBody.getDateOfScreeningInterview());
            current.setCodingInterview(requestBody.getCodingInterview());
            current.setDateOfCodingInterview(requestBody.getDateOfCodingInterview());
            current.setBehaviorInterview(requestBody.getBehaviorInterview());
            current.setDateOfBehaviorInterview(requestBody.getDateOfBehaviorInterview());
            current.setDateApplied(requestBody.getDateApplied());
            current.setFollowupForInformation(requestBody.getFollowupForInformation());
            current.setAdviceReceived(requestBody.getAdviceReceived());
            current.setDateFollowedUp(requestBody.getDateFollowedUp());
    
            mySQLRepository.save(current);
            return ResponseEntity.ok(current);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/jobapplication/add")
    public JobApplication create(@RequestBody Map<String, String> body) {
        // Extract data from the request body
        String job = body.get("job");
        String description = body.get("description");
        String company = body.get("company");
        String jobPostingLink = body.get("jobPostingLink");
        String resume = body.get("resume");
        String coverLetter = body.get("coverLetter");
        String screeningInterview = body.get("screeningInterview");
        String dateOfScreeningInterview = body.get("dateOfScreeningInterview");
        String codingInterview = body.get("codingInterview");
        String dateOfCodingInterview = body.get("dateOfCodingInterview");
        String behaviorInterview = body.get("behaviorInterview");
        String dateOfBehaviorInterview = body.get("dateOfBehaviorInterview");
        String dateApplied = body.get("dateApplied");
        String followupForInformation = body.get("followupForInformation");
        String adviceReceived = body.get("adviceReceived");
        String dateFollowedUp = body.get("dateFollowedUp");
    
        // Create a new JobApplication object with the extracted data
        JobApplication newJobApplication = new JobApplication();
        newJobApplication.setJob(job);
        newJobApplication.setDescription(description);
        newJobApplication.setCompany(company);
        newJobApplication.setJobPostingLink(jobPostingLink);
        newJobApplication.setResume(resume);
        newJobApplication.setCoverLetter(coverLetter);
        newJobApplication.setScreeningInterview(screeningInterview);
        newJobApplication.setDateOfScreeningInterview(dateOfScreeningInterview);
        newJobApplication.setCodingInterview(codingInterview);
        newJobApplication.setDateOfCodingInterview(dateOfCodingInterview);
        newJobApplication.setBehaviorInterview(behaviorInterview);
        newJobApplication.setDateOfBehaviorInterview(dateOfBehaviorInterview);
        newJobApplication.setDateApplied(dateApplied);
        newJobApplication.setFollowupForInformation(followupForInformation);
        newJobApplication.setAdviceReceived(adviceReceived);
        newJobApplication.setDateFollowedUp(dateFollowedUp);
    
        // Save the new JobApplication object to the database
        return mySQLRepository.save(newJobApplication);
    }
    
    
    @DeleteMapping("/jobapplication/{identity}")
    public ResponseEntity<?> deleteJobApplication(@PathVariable("identity") Integer id) {
        if (mySQLRepository.existsById(id)) {
            mySQLRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
