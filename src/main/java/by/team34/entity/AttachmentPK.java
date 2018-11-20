package by.team34.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class AttachmentPK implements Serializable {
    @Basic
    private long candidateId;
    @Basic
    private String filePath;
    @Basic
    private String attachmentType;

    public AttachmentPK(final long candidateId, final String filePath,
                        final String attachmentType) {
        this.candidateId = candidateId;
        this.filePath = filePath;
        this.attachmentType = attachmentType;
    }


}
