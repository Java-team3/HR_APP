package by.team34.entity;


import javax.persistence.*;

@Entity
@Table(name = "attachment")
public class Attachment {

    @Column(name = "FILE_PATH")
    private String filePath;

    @Column(name = "ATTACHMENT_TYPE")
    private String attachmentType;

    @ManyToOne
    @JoinColumn(name = "CANDIDATE_ID")
    private Candidate candidate;


    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
}
