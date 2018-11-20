package by.team34.entity;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "attachment")
public class Attachment {

	@EmbeddedId
	private AttachmentPK id;
	
    @Column(name = "FILE_PATH")
    private String filePath;

    @Column(name = "ATTACHMENT_TYPE")
    private String attachmentType;

    @ManyToOne
    @JoinColumn(name = "CANDIDATE_ID")
    private Candidate candidate;

    

    public final AttachmentPK getId() {
		return id;
	}

	public final void setId(final AttachmentPK id) {
		this.id = id;
	}

	public final Candidate getCandidate() {
		return candidate;
	}

	public final void setCandidate(final Candidate candidate) {
		this.candidate = candidate;
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