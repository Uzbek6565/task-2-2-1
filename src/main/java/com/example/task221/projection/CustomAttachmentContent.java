package com.example.task221.projection;

import com.example.task221.entity.Attachment;
import com.example.task221.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();
    byte[] getBytes();
    Attachment getAttachment();
}
