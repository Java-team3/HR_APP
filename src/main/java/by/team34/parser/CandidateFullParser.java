package by.team34.parser;

import by.team34.dto.CandidateDto;
import by.team34.dto.CandidateFullDto;
import by.team34.entity.Candidate;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CandidateFullParser {
    public static List<CandidateFullDto> parseCandidateFullDto(Collection<Candidate> candidates) {
        List<CandidateFullDto> list = new LinkedList<CandidateFullDto>();
        for (Candidate candidate : candidates)
            list.add(new CandidateFullDto(candidate));
        return list;
    }
}
