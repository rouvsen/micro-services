package com.rouvsen.school.Controller;

import com.rouvsen.school.entity.FullSchoolResponse;
import com.rouvsen.school.entity.School;
import com.rouvsen.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createSchool(@RequestBody School school) {
        schoolService.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> getAllSchools() {
        return ResponseEntity.ok(schoolService.findAllSchools());
    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> getAllSchoolsWithStudents(
            @PathVariable("school-id") Long schoolId) {
        return ResponseEntity.ok(schoolService.findSchoolWithStudents(schoolId));
    }
}
