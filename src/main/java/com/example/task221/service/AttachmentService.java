package com.example.task221.service;

import com.example.task221.entity.Attachment;
import com.example.task221.entity.AttachmentContent;
import com.example.task221.message.Result;
import com.example.task221.repository.AttachmentContentRepository;
import com.example.task221.repository.AttachmentRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class AttachmentService {
    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    @SneakyThrows
    public Result upload(MultipartHttpServletRequest request) {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        Attachment attachment = new Attachment(null, file.getOriginalFilename(), file.getSize(), file.getContentType());
        Attachment savedAttachment = attachmentRepository.save(attachment);

        AttachmentContent attachmentContent = new AttachmentContent(null, file.getBytes(), savedAttachment);
        attachmentContentRepository.save(attachmentContent);
        return new Result("File uploaded", true, savedAttachment.getId());
    }

    public List<Attachment> getAllAttachments() {
        return attachmentRepository.findAll();
    }

    public Result getAllAttachmentById(Integer id) {
        Optional<Attachment> attachmentRepositoryById = attachmentRepository.findById(id);
        if (attachmentRepositoryById.isPresent())
            return new Result("Attachment with ID " + id, true, attachmentRepositoryById.get());
        return new Result("File not found", false);
    }

    public Result editAttachment(Integer id, Attachment attachment) {
        Optional<Attachment> attachmentRepositoryById = attachmentRepository.findById(id);
        if (!attachmentRepositoryById.isPresent())
            return new Result("Attachment not found", false);
        Attachment attachmentById = attachmentRepositoryById.get();
        attachmentById.setName(attachment.getName());
        attachmentById.setContentType(attachment.getContentType());
        attachmentById.setSize(attachment.getSize());
        attachmentRepository.save(attachmentById);
        return new Result("File is edited", true);
    }


    public Result deleteAttachment(Integer id) {
        Optional<Attachment> attachmentRepositoryById = attachmentRepository.findById(id);
        if (!attachmentRepositoryById.isPresent())
            return new Result("File not found", false);
        return new Result("File is deleted", true);
    }
}
