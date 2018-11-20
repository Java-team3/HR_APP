package by.team34.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class AttachmentPK implements Serializable{
	@Basic
	private long candidate_id;
	@Basic
	private String file_path;
	@Basic
	private String attachment_type;
	public AttachmentPK(long candidate_id, String file_path, String attachment_type) {
		this.candidate_id = candidate_id;
		this.file_path = file_path;
		this.attachment_type = attachment_type;
	}
	
	
}
