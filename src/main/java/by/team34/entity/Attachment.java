package by.team34.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Attachment {

    //@Column(name = "FILE_PATH")
    private String filePath;

    //@Column(name = "ATTACHMENT_TYPE")
    private String attachmentType;

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