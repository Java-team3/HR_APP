package by.team34.entity;


import javax.persistence.*;

@Embeddable
public class Attachment {

    private String filePath;

    private String attachmentType;

    public final String getFilePath() {
        return filePath;
    }

    public final void setFilePath(final String filePath) {
        this.filePath = filePath;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

}