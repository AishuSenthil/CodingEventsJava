package org.launchcode.codingevents.controllers;
import org.launchcode.codingevents.data.EventCategoryRepository;
import jakarta.validation.Valid;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class EventCategoryController {
//    @GetMapping
//    public String displayAllCategories(Model model) {
//        model.addAttribute("title", "All Categories");
//        model.addAttribute("categories", EventCategoryRepository.findAll());
//        return "eventCategories/index";
//    }

    @GetMapping("create")
    public String renderCreateEventCategoryForm(Model model) {
        model.addAttribute("title", "Create Category");
        model.addAttribute(new EventCategory());
        return "eventCategories/create";
//    }
//
//    @PostMapping("create")
//    public String processCreateEventCategoryForm(@Valid EventCategory eventCategory, Errors errors, Model model) {
//        if (!errors.hasErrors()) {
//            EventCategoryRepository.save(eventCategory);
//            return "redirect:";
//        } else {
//            model.addAttribute("title", "Create Category");
//            return "eventCategories/create";
//        }
//    }
}
