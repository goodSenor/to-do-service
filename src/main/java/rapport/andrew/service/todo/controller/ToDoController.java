package rapport.andrew.service.todo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    @RequestMapping(value = "api/v1/item/{id}", method = RequestMethod.GET)
    public ResponseEntity getItem(@PathVariable long id) {
        return new ResponseEntity("Hello, World!!", HttpStatus.OK);
    }
}
