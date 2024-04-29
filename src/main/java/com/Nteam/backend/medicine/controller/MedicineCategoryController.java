package com.Nteam.backend.medicine.controller;

import com.Nteam.backend.medicine.entity.MedicineCategory;
import com.Nteam.backend.medicine.repository.MedicineCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicineCategory")
public class MedicineCategoryController {
    @Autowired
    private MedicineCategoryRepository medicineCategoryRepository;

    // 상비약 카테고리 전체 조회
    @GetMapping("")
    public List<MedicineCategory> getAllMedicineCategories() {
        return medicineCategoryRepository.findAll();
    }

}
