package by.team34.controller;

import by.team34.dto.InterviewDto;
import by.team34.dto.TemplateDto;
import by.team34.entity.Interview;
import by.team34.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Set;

@RestController
@RequestMapping("/interview")
public class InterviewController {
    @Autowired
    private IGenericService<Interview, Long> service;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT)
    @ResponseBody
    public Interview SaveOrUpdate(@Valid @RequestBody Interview interview, BindingResult bindingResult)
            throws BindException {
        if (bindingResult.hasErrors()) {
            throw new BindException(bindingResult);
        }
        if (interview.getId() != null)
            service.update(interview);
        else
            service.insert(interview);
        return interview;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/delete")
    @ResponseBody
    public void InterviewDelete(@RequestParam(value = "id") Long id) {
        service.delete(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/id")
    @ResponseBody
    public InterviewDto InterviewFilter(@RequestParam(value = "id") Long id) {
        return TemplateDto.parseInterview(service.findBy(id));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/sort")
    @ResponseBody
    public Set<InterviewDto> InterviewSort(@RequestParam(value = "type") String type) {
        return TemplateDto.parseInterviewDto(service.sort(type));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/list")
    @ResponseBody
    public Set<InterviewDto> InterviewList() {
        return TemplateDto.parseInterviewDto(service.findAll());
    }






}
