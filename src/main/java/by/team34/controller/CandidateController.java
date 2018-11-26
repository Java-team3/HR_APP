package by.team34.controller;

import by.team34.dto.CandidateDto;
import by.team34.dto.TemplateDto;
import by.team34.entity.Candidate;
import by.team34.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private IGenericService<Candidate, Long> service;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT)
    @ResponseBody
    public Candidate candidateSave(@Valid @RequestBody Candidate candidate, BindingResult bindingResult)
            throws BindException {
        if (bindingResult.hasErrors()) {
            throw new BindException(bindingResult);
        }
        if (candidate.getId() != null)
            service.update(candidate);
        else
            service.insert(candidate);
        return candidate;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public void candidateDelete(@RequestParam(value = "id") Long id) {
        service.delete(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    @ResponseBody
    public CandidateDto getCandidate(@RequestParam(value = "id") Long id) {
        return TemplateDto.parseCandidate(service.findBy(id));
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    @ResponseBody
    public List<CandidateDto> candidateSort(@RequestParam(value = "type") String type) {
        return TemplateDto.parseCandidateDto(service.sort(type));
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<CandidateDto> candidateAll() {
        return TemplateDto.parseCandidateDto(service.findAll());
    }

}
