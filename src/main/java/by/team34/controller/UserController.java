package by.team34.controller;

import by.team34.dto.TemplateDto;
import by.team34.dto.UserDto;
import by.team34.entity.User;
import by.team34.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IGenericService<User, Long> service;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT)
    @ResponseBody
    public User SaveUser(@Valid @RequestBody User user, BindingResult bindingResult) throws BindException {
        if (bindingResult.hasErrors()) {
            throw new BindException(bindingResult);
        }
        if (user.getId() != null)
            service.update(user);
        else
            service.insert(user);
        return user;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public void UserDelete(@RequestParam(value = "id") Long id) {
        service.delete(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    @ResponseBody
    public List<UserDto> UserSort(@RequestParam(value = "type") String type) {
        return TemplateDto.parseUserDto(service.sort(type));
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<UserDto> UserAll() {
        return TemplateDto.parseUserDto(service.findAll());
    }


    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public UserDto getUser(@RequestParam(value = "id") Long id) {
        return TemplateDto.parseUser(service.findBy(id));
    }
}
