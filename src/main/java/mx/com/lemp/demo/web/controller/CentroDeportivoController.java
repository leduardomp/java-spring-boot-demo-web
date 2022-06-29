package mx.com.lemp.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.lemp.demo.web.model.CentroDeportivo;
import mx.com.lemp.demo.web.service.CentroDeportivoService;

@Controller
public class CentroDeportivoController {

	@Autowired
	private CentroDeportivoService centroDeportivoService;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", centroDeportivoService.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		
		if(id != null && id != 0) {
			model.addAttribute("centroDeportivo", centroDeportivoService.get(id));
		}else {
			model.addAttribute("centroDeportivo", new CentroDeportivo());
		}
		
		return "save";
	}
	
	@PostMapping("/save")
	public String save(CentroDeportivo centroDeportivo, Model model) {
		centroDeportivoService.save(centroDeportivo);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		centroDeportivoService.delete(id);
		return "redirect:/";
	}
	
	@GetMapping("/error")
	public String error(Model model) {
		return "error";
	}
}
