package com.example.task221.projection;

import com.example.task221.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getName();
    Long getSize();
    String getContentType();
}
