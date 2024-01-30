package ru.mikhailov.seminar3HW.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EmployeeController {

    //Задание п.1. - Создание базового веб-приложения Spring MVC
    //Ведет к представлению домашней странцы, где я потренировался добавлять картинки и ссылки

    @GetMapping("/home")
    public String welcome (){
        return "home";
    }
    //Задание п.2. - Создайте простую страницу с некоторыми переменными,
    //которые заполняются с помощью модели Spring MVC и отображаются на странице с использованием Thymeleaf
    //Ведет к представлению страницы, которая вычисляет результат возведения двойки в степень.
    //Степень передается в пути

    @GetMapping("/power/{value}")
    public String powerOfTwo (@PathVariable("value") int value, Model model){
        model.addAttribute("powerOfTwo", Math.pow(2, value));
        return "power";
    }

}
