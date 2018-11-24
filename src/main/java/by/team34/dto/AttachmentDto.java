package by.team34.dto;

public class AttachmentDto {

    private String filePath;
    private String attachmentType;

    public AttachmentDto(String filePath, String attachmentType) {
        this.filePath = filePath;
        this.attachmentType = attachmentType;
    }

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
