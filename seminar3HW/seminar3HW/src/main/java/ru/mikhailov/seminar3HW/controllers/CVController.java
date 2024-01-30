package ru.mikhailov.seminar3HW.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.mikhailov.seminar3HW.model.CV;
import ru.mikhailov.seminar3HW.service.CVService;

//Задание п.3. - Создание формы ввода и обработка данных формы
//Данные добавляются аналогично примеру с семинара, хранятся также в колеекции

@Controller
public class CVController {

    private final CVService cvService;

    public CVController(CVService cvService) {
        this.cvService = cvService;
    }

    @GetMapping("/recruitment")
    public String viewCVs(Model model) {
        var CVs = cvService.getCVs();
        model.addAttribute("CVs", CVs);

        return "recruitment.html";
    }
    @PostMapping("/recruitment")
    public String addCV(CV cv, Model model) {
        cvService.addCV(cv);

        var CVs = cvService.getCVs();
        model.addAttribute("CVs", CVs);

        return "recruitment.html";
    }
}
