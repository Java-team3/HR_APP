package by.team34.dto;

import by.team34.entity.Requirement;
import by.team34.entity.Skill;
import by.team34.entity.User;
import by.team34.entity.Vacancy;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class TemplateDto {

    public static VacancyDto parseVacancy(Vacancy vacancy) {
        return new VacancyDto(vacancy.getId(), vacancy.getSalaryTo(),
                vacancy.getSalaryFrom(), vacancy.getExperienceYearsRequire(),
                vacancy.getPosition(), parseUser(vacancy.getUser()),
                parseRequirement(vacancy.getRequirements()));
    }

    public static List<VacancyDto> parseVacancy(Collection<Vacancy> vacancies) {
        List<VacancyDto> list = new LinkedList<VacancyDto>();
        for (Vacancy vacancy : vacancies) {
            list.add(parseVacancy(vacancy));
        }
        return list;
    }

    public static UserDto parseUser(User user) {
        return new UserDto(user.getId(), user.getName(),
                user.getSurname(), user.getEmail(), user.getPassword(),
                user.getRoles());
        // нужно добавить про роль
    }

    public static List<UserDto> parseUserDto(Collection<User> users) {
        List<UserDto> list = new LinkedList<UserDto>();
        for (User user : users) {
            list.add(parseUser(user));
        }
        return list;
    }

    public static List<SkillDto> parseSkill(Collection<Skill> skills) {
        List<SkillDto> list = new LinkedList<SkillDto>();
        for (Skill skill : skills) {
            list.add(new SkillDto(skill.getName()));
        }
        return list;
    }

    public static List<RequirementDto> parseRequirement(Collection<Requirement> requirements) {
        List<RequirementDto> list = new LinkedList<RequirementDto>();
        for (Requirement requirement : requirements) {
            list.add(new RequirementDto(requirement.getName()));
        }
        return list;
    }

}
