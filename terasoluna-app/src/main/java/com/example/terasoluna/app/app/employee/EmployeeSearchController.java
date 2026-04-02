package com.example.terasoluna.app.app.employee;

import com.example.terasoluna.app.domain.service.EmployeeSearchCriteria;
import com.example.terasoluna.app.domain.service.EmployeeSearchResult;
import com.example.terasoluna.app.domain.service.EmployeeSearchService;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeSearchController {

    private final EmployeeSearchService employeeSearchService;

    public EmployeeSearchController(EmployeeSearchService employeeSearchService) {
        this.employeeSearchService = employeeSearchService;
    }

    @ModelAttribute("employeeSearchForm")
    public EmployeeSearchForm setUpEmployeeSearchForm() {
        return new EmployeeSearchForm();
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/employee/search";
    }

    @GetMapping("/employee/search")
    public String search(
            @Valid @ModelAttribute("employeeSearchForm") EmployeeSearchForm form,
            BindingResult bindingResult,
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size,
            Model model) {

        int safePage = Math.max(1, page);
        int safeSize = Math.max(1, size);

        if (bindingResult.hasErrors()) {
            model.addAttribute("employees", List.of());
            model.addAttribute("resultCount", 0);
            model.addAttribute("currentPage", 1);
            model.addAttribute("totalPages", 1);
            model.addAttribute("size", safeSize);
            model.addAttribute("hasPrev", false);
            model.addAttribute("hasNext", false);
            model.addAttribute("prevPage", 1);
            model.addAttribute("nextPage", 1);
            model.addAttribute("pageLinks", List.of(new PageLink(1, true)));
            return "employee/search";
        }

        EmployeeSearchCriteria criteria = new EmployeeSearchCriteria(
                form.getEmployeeId(),
                form.getName(),
                form.getAge(),
                form.getBirth(),
                form.getAddress(),
                form.getPhoneNumber());

        EmployeeSearchResult result = employeeSearchService.search(criteria, safePage, safeSize);

        model.addAttribute("employees", result.employees());
        model.addAttribute("resultCount", result.totalCount());
        model.addAttribute("currentPage", result.currentPage());
        model.addAttribute("totalPages", result.totalPages());
        model.addAttribute("size", result.pageSize());
        model.addAttribute("hasPrev", result.currentPage() > 1);
        model.addAttribute("hasNext", result.currentPage() < result.totalPages());
        model.addAttribute("prevPage", Math.max(1, result.currentPage() - 1));
        model.addAttribute("nextPage", Math.min(result.totalPages(), result.currentPage() + 1));
        model.addAttribute("pageLinks", createPageLinks(result.currentPage(), result.totalPages()));

        return "employee/search";
    }

    private List<PageLink> createPageLinks(int currentPage, int totalPages) {
        List<PageLink> links = new ArrayList<>();
        for (int p = 1; p <= totalPages; p++) {
            links.add(new PageLink(p, p == currentPage));
        }
        return links;
    }
}
