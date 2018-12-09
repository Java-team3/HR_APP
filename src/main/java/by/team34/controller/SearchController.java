package by.team34.controller;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import by.team34.dto.CandidateDto;
import by.team34.dto.TemplateDto;
import by.team34.dto.VacancyDto;
import by.team34.entity.Attachment;
import by.team34.entity.Candidate;
import by.team34.entity.ContactDetails;
import by.team34.entity.Requirement;
import by.team34.entity.Skill;
import by.team34.entity.Vacancy;
import by.team34.service.IGenericService;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	@Resource(name="candidateService")
    private IGenericService<Candidate, Long> serviceCandidate;
	
	@Resource(name="vacancyService")
	private IGenericService<Vacancy,Long> serviceVacancy;
	
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/candidate", method = RequestMethod.GET)
    @ResponseBody
    public List<CandidateDto> candidateList(@RequestParam(value="name") String name) {
    	List<Candidate> list = new ArrayList<Candidate>();
    	for (Candidate candidate : serviceCandidate.findAll()) {
    		if (candidate.getName().contains(name) || candidate.getSurname().contains(name)) {
    			list.add(candidate);
    			continue;
    		}
    		for (ContactDetails detail : candidate.getContactDetails()) {
    			if (detail.getContactDetails().contains(name)) {
    				list.add(candidate);
    				break;
    			}
    		}
    		for (Attachment attachment : candidate.getAttachments()) {
    			if (attachment.getFilePath().contains(name)) {
    				list.add(candidate);
    				break;
    			}
    		}
    		for (Skill skill : candidate.getSkills()) {
    			if (skill.getName().contains(name)) {
    				list.add(candidate);
    				break;
    			}
    		}
    	}
		return TemplateDto.parseCandidateDto(list);
    }
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/vacancy", method = RequestMethod.GET)
    @ResponseBody
    public List<VacancyDto> vacancyList(@RequestParam(value="name") String name) {
    	List<Vacancy> list = new ArrayList<Vacancy>();
    	for (Vacancy vacancy : serviceVacancy.findAll()) {
    		if (vacancy.getPosition().contains(name)) {
    			list.add(vacancy);
    			continue;
    		}
    		for (Requirement requirement : vacancy.getRequirements()) {
    			if (requirement.getName().contains(name)) {
    				list.add(vacancy);
    				break;
    			}
    		}
    	}
		return TemplateDto.parseVacancyDto(list);
    }    
    
}
