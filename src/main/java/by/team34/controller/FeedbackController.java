package by.team34.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import by.team34.dto.CandidateDto;
import by.team34.dto.FeedbackDto;
import by.team34.dto.TemplateDto;
import by.team34.entity.Candidate;
import by.team34.entity.CandidateFeedback;
import by.team34.service.IGenericService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	private IGenericService<CandidateFeedback,Long> service;
	
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT)
    @ResponseBody
    public CandidateFeedback feedbackSave(@Valid @RequestBody CandidateFeedback feedback, BindingResult bindingResult)
            throws BindException {
        if (bindingResult.hasErrors()) {
            throw new BindException(bindingResult);
        }
        if (feedback.getId() != null)
            service.update(feedback);
        else
            service.insert(feedback);
        return feedback;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public void feedbackDelete(@RequestParam(value = "id") Long id) {
        service.delete(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    @ResponseBody
    public FeedbackDto getfeedback(@RequestParam(value = "id") Long id) {
        return new FeedbackDto(service.findBy(id));
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    @ResponseBody
    public List<FeedbackDto> feedbackSort(@RequestParam(value = "type") String type) {
        return TemplateDto.parseFeedback(service.sort(type));
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<FeedbackDto> feedbackAll() {
        return TemplateDto.parseFeedback(service.findAll());
    }
	
}
