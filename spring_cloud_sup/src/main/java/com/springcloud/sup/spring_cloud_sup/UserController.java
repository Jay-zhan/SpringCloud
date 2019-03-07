package com.springcloud.sup.spring_cloud_sup;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @GetMapping(value = "/call/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public user call(@PathVariable Integer id, HttpServletRequest request) {
        user p = new user();
        p.setId(id);
        p.setName("james");
        p.setMsg(request.getRequestURL().toString());
        return p;
    }
}
