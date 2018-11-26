package by.team34.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Attachment {

    private String filePath;
    private AttachmentType attachmentType;

    public final String getFilePath() {
        return filePath;
    }

    public final void setFilePath(final String filePath) {
        this.filePath = filePath;
    }

    public AttachmentType getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType;
    }

    public enum AttachmentType {
        CV,
        COVER_LETTER,
        PHOTO
    }
}