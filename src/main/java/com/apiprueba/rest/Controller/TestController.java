package com.apiprueba.rest.Controller;

import com.apiprueba.rest.Model.Task;
import com.apiprueba.rest.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TestController {
    @Autowired
    private TestRepository testRepository;

    @GetMapping(value= "/tasks")
    public List<Task> getTasks(){
        return testRepository.findAll();
    }
    @PostMapping(value="/savetask")
    public String saveTask(@RequestBody Task task){
        testRepository.save(task);
        return "Saved task";
    }
    @PutMapping(value= "/update/{id}")
    public String updateTask(@PathVariable long id, @RequestBody Task task){
        Task updateTask = testRepository.findById(id).get();
        updateTask.setName(task.getName());
        updateTask.setLastname(task.getLastname());
        updateTask.setAge(task.getAge());
        updateTask.setPhoto(task.getPhoto());
        updateTask.setDocument(task.getDocument());
        testRepository.save(updateTask);
        return "Updated Task";
    }
    @DeleteMapping(value= "delete/{id}")
    public String deleteTask(@PathVariable long id){
        Task deleteTask = testRepository.findById(id).get();
        testRepository.delete(deleteTask);
        return "deleted Task";
    }
}
