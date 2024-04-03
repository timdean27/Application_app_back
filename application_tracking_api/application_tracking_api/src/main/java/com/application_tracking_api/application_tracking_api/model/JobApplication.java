package com.application_tracking_api.application_tracking_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "job_applications")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String job;
    private String description;
    private String company;
    private String jobPostingLink;
    private String resume;
    private String coverLetter;
    private String screeningInterview;
    private String dateOfScreeningInterview;
    private String codingInterview;
    private String dateOfCodingInterview;
    private String behaviorInterview;
    private String dateOfBehaviorInterview;
    private String dateApplied;
    private String followupForInformation;
    private String adviceReceived;
    private String dateFollowedUp;
    private boolean declined;

    public Integer getId() {
        return id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobPostingLink() {
        return jobPostingLink;
    }

    public void setJobPostingLink(String jobPostingLink) {
        this.jobPostingLink = jobPostingLink;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    public String getScreeningInterview() {
        return screeningInterview;
    }

    public void setScreeningInterview(String screeningInterview) {
        this.screeningInterview = screeningInterview;
    }

    public String getDateOfScreeningInterview() {
        return dateOfScreeningInterview;
    }

    public void setDateOfScreeningInterview(String dateOfScreeningInterview) {
        this.dateOfScreeningInterview = dateOfScreeningInterview;
    }

    public String getCodingInterview() {
        return codingInterview;
    }

    public void setCodingInterview(String codingInterview) {
        this.codingInterview = codingInterview;
    }

    public String getDateOfCodingInterview() {
        return dateOfCodingInterview;
    }

    public void setDateOfCodingInterview(String dateOfCodingInterview) {
        this.dateOfCodingInterview = dateOfCodingInterview;
    }

    public String getBehaviorInterview() {
        return behaviorInterview;
    }

    public void setBehaviorInterview(String behaviorInterview) {
        this.behaviorInterview = behaviorInterview;
    }

    public String getDateOfBehaviorInterview() {
        return dateOfBehaviorInterview;
    }

    public void setDateOfBehaviorInterview(String dateOfBehaviorInterview) {
        this.dateOfBehaviorInterview = dateOfBehaviorInterview;
    }

    public String getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(String dateApplied) {
        this.dateApplied = dateApplied;
    }

    public String getFollowupForInformation() {
        return followupForInformation;
    }

    public void setFollowupForInformation(String followupForInformation) {
        this.followupForInformation = followupForInformation;
    }

    public String getAdviceReceived() {
        return adviceReceived;
    }

    public void setAdviceReceived(String adviceReceived) {
        this.adviceReceived = adviceReceived;
    }

    public String getDateFollowedUp() {
        return dateFollowedUp;
    }

    public void setDateFollowedUp(String dateFollowedUp) {
        this.dateFollowedUp = dateFollowedUp;
    }

    public boolean getDeclined() {
        return declined;
    }
    public void setDeclined(boolean declined) {
        this.declined = declined;
    }
}
