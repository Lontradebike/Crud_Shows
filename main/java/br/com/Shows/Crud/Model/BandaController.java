package br.com.Shows.Crud.Model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.Shows.Crud.acoes.BandaAcoes;
 
 
@Controller
public class BandaController {
 
    @Autowired
    private BandaAcoes bandaAcoes;

	public BandaAcoes getBandaAcoes() {
		return bandaAcoes;
	}

	public void setBandaAcoes(BandaAcoes bandaAcoes) {
		this.bandaAcoes = bandaAcoes;
	}
    
	@RequestMapping("/")
	public ModelAndView home() {
	    List<Banda> listBanda = bandaAcoes.listAll();
	    ModelAndView mav = new ModelAndView("index");
	    mav.addObject("listBanda", listBanda);
	    return mav;
	    
	    
	    @RequestMapping("/nova")
	    public String newCustomerForm(Map<String, Object> model) {
	        Banda banda = new Banda();
	        model.put("banda", banda);
	        return "nova_banda";
	    }
	    
	    
	    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
	    public String saveCustomer(@ModelAttribute("banda") Banda banda){
	        BandaAcoes.save(banda);
	        return "redirect:/";
	    }
	    
	}
    
    
    
    
}