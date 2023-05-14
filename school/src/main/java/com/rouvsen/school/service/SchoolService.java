package com.rouvsen.school.service;

import com.rouvsen.school.entity.FullSchoolResponse;
import com.rouvsen.school.entity.School;
import com.rouvsen.school.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolWithStudents(Long schoolId) {
        return null;
    }
}
