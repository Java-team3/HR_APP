package by.team34.entity;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name = "attachment")
public class Attachment {

    @Column(name = "FILE_PATH")
    private String filePath;

    @Column(name = "ATTACHMENT_TYPE")
    private String attachmentType;

    @ManyToOne
    @JoinColumn(name = "CANDIDATE_ID")
    private Candidate candidate;


    public final String getFilePath() {
        return filePath;
    }

    public final void setFilePath(final String filePath) {
        this.filePath = filePath;
    }

    public final String getAttachmentType() {
        return attachmentType;
    }

    public final void setAttachmentType(final String attachmentType) {
        this.attachmentType = attachmentType;
    }
}