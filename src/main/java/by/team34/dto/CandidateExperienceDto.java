package by.team34.dto;

import java.util.Date;
import java.util.Set;

public class CandidateExperienceDto {

    private Long id;
    private Date dateFrom;
    private Date dateTo;
    private String jobDescription;
    private String jobPosition;
    private String companyName;
    private Set<ResponsibilityDto> responsibilities;

    public CandidateExperienceDto(Long id, Date dateFrom, Date dateTo,
                                  String jobDescription, String jobPosition,
                                  String companyName,
                                  Set<ResponsibilityDto> responsibilities) {
        this.id = id;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.jobDescription = jobDescription;
        this.jobPosition = jobPosition;
        this.companyName = companyName;
        this.responsibilities = responsibilities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Set<ResponsibilityDto> getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(Set<ResponsibilityDto> responsibilities) {
        this.responsibilities = responsibilities;
    }
}
