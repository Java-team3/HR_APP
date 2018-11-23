package by.team34.dto;

import by.team34.entity.*;

import java.util.*;


public class TemplateDto {

    public static VacancyDto parseVacancy(Vacancy vacancy) {
        return new VacancyDto(vacancy.getId(), vacancy.getSalaryTo(),
                vacancy.getSalaryFrom(), vacancy.getExperienceYearsRequire(),
                vacancy.getPosition(), parseUser(vacancy.getUser()),
                parseRequirement(vacancy.getRequirements()));
    }

    public static List<VacancyDto> parseVacancyDto(Collection<Vacancy> vacancies) {
        List<VacancyDto> list = new LinkedList<VacancyDto>();
        for (Vacancy vacancy : vacancies) {
            list.add(parseVacancy(vacancy));
        }
        return list;
    }

    public static UserDto parseUser(User user) {
        return new UserDto(user.getId(), user.getName(),
                user.getSurname(), user.getEmail(), user.getPassword(),
                parseRole(user.getRoles()));
        // нужно добавить про роль
    }

    public static List<UserDto> parseUserDto(Collection<User> users) {
        List<UserDto> list = new LinkedList<UserDto>();
        for (User user : users) {
            list.add(parseUser(user));
        }
        return list;
    }

//    public static RoleDto parseRole(Role role) {
//        return new RoleDto(role.getId(), role.getName());
//        // нужно добавить про роль
//    }
//
//    public static List<RoleDto> parseRoleDto(Collection<Role> roles) {
//        List<RoleDto> list = new LinkedList<RoleDto>();
//        for (Role role : roles) {
//            list.add(parseRole(role));
//        }
//        return list;
//    }

    public static Set<RoleDto> parseRole(Collection<Role> roles) {
        Set<RoleDto> set = new HashSet<RoleDto>();
        for (Role role : roles) {
            set.add(new RoleDto(role.getId(), role.getName()));
        }
        return set;
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
