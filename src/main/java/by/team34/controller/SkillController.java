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

import by.team34.dto.SkillDto;
import by.team34.dto.TemplateDto;
import by.team34.dto.UserDto;
import by.team34.entity.Skill;
import by.team34.service.IGenericService;


@RestController
@RequestMapping("/skill")
public class SkillController {
	
	@Autowired
	private IGenericService<Skill,String> service;

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void SkillDelete(@RequestParam(value = "name") String name) {
		service.delete(name);
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<SkillDto> getSkills() {
		return TemplateDto.parseSkill(service.findAll());
	}

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/save", method = RequestMethod.PUT)
	@ResponseBody
	public Skill SaveSkill(@Valid @RequestBody Skill skill, BindingResult bindingResult) throws BindException {
		if (bindingResult.hasErrors()) {
			throw new BindException(bindingResult);
		}
		service.insert(skill);
		return skill;
	}
	
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public SkillDto getSkill(@RequestParam(value = "name") String name) {
        return new SkillDto(service.findBy(name));
    }
    
    
}
