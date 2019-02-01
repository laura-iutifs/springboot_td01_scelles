package s4.spring.controllers;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.lang.model.util.Elements;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

import s4.spring.models.Element;

@Controller
@SessionAttributes("elements")
public class MainController {

	@GetMapping("items")
	public String index() {
		//model.addAttribute("essai", "000");
		return "index";
	}

	@ModelAttribute("elements")
	public List<Element> getItems() {
		Element elm = new Element();
		List<Element> elms = new ArrayList<>();
		elms.add(elm);
		return elms;
	}

	@GetMapping("new")
	public String newItem() {
		return "firstItem";
	}

	@PostMapping("addNew")
	public RedirectView addNew(@RequestParam("nom") String nom, @RequestParam int evaluation) {
		Element elm = new Element();
		elm.setNom(nom);
		elm.setEvaluation(evaluation);
		getItems().add(elm);
		return new RedirectView("/items");
	}
}
