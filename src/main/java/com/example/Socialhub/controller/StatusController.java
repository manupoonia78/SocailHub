package com.example.Socialhub.controller;

import com.example.Socialhub.entity.Status;
import com.example.Socialhub.repo.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/status")
public class StatusController {


    @Autowired
    private StatusRepo statusRepo;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public String savestatus(@RequestBody Integer Id,String name,String desc,String file){

        Status status = new Status();
        status.setId(Id);
        status.setName(name);
        status.setDesc(desc);
        status.setFile(file);
        statusRepo.save(status);
        return "Status Updated Sucessfully !";

    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)

    public List<Status> getStatus(@RequestBody Integer id,String pg, String pgn) {
        return statusRepo.findAll();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)

    public String comment(@RequestBody Integer id, String comment_user, String comment){
        Optional<Status> optStatus = statusRepo.findById(id);
        Status existStatus = optStatus.get();
        existStatus.setComment_user(comment_user);
        existStatus.setComment(comment);
        return "You Commented Sucessfully !!";
    }
}
