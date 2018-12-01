package by.team34.dto;

import by.team34.entity.Skill;

public class SkillDto {

    private String name;

    public SkillDto(Skill skill) {
        this.name = skill.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
