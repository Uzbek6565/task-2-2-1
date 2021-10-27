package com.example.task221.controller;

import com.example.task221.entity.Attachment;
import com.example.task221.message.Result;
import com.example.task221.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/upload")
    public HttpEntity<?> upload(MultipartHttpServletRequest request){
        Result result = attachmentService.upload(request);
        return ResponseEntity.status(result.isSuccess()?201:409).body(result);
    }

    @GetMapping
    public List<Attachment> getAllAttachments(){
        return attachmentService.getAllAttachments();
    }

    @GetMapping("/upload/{id}")
    public HttpEntity<?> getAttachmentById(@PathVariable Integer id){
        Result result = attachmentService.getAllAttachmentById(id);
        return ResponseEntity.status(result.isSuccess()?200:400).body(result);
    }

    @PutMapping("/upload/{id}")
    public HttpEntity<?> editAttachment(@PathVariable Integer id, @RequestBody Attachment attachment){
        Result result = attachmentService.editAttachment(id, attachment);
        return ResponseEntity.status(result.isSuccess()?202:400).body(result);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteAttachment(@PathVariable Integer id){
        Result result = attachmentService.deleteAttachment(id);
        return ResponseEntity.status(result.isSuccess()?204:400).body(result);
    }
}
