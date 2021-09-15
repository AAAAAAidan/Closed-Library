package org.simplelibrary.controller;

import lombok.extern.slf4j.Slf4j;
import org.simplelibrary.model.Subject;
import org.simplelibrary.service.AccountService;
import org.simplelibrary.service.SubjectService;
import org.simplelibrary.view.TemplateView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
public class SubjectController extends TemplateView {

  private final AccountService accountService;
  private final SubjectService subjectService;

  @Autowired
  public SubjectController(AccountService accountService,
                           SubjectService subjectService) {
    this.accountService = accountService;
    this.subjectService = subjectService;
  }

  @GetMapping("/subjects")
  public String getSubjects(RedirectAttributes redirectAttributes) {
    redirectAttributes.addAttribute("filter", "subjects");
    return "redirect:/search";
  }

  @GetMapping("/subjects/{id}")
  public String getSubject(Model model, @PathVariable Integer id) {
    Subject subject = subjectService.getById(id);
    model.addAttribute("subject", subject);

    if (accountService.isLoggedIn()) {
      model.addAttribute("lists", accountService.getLoggedInAccount().getCatalogs());
    }

    return loadView(model, "subjects/subject");
  }

}
