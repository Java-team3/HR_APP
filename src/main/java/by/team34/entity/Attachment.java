package by.team34.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Attachment {
	
	@Column(name="FILE_PATH")
    private String filePath;
	
	@Column(name="ATTACHMENT_TYPE")
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