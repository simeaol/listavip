package br.com.slamine.listavip.controller;

import br.com.slamine.listavip.model.Convidado;
import br.com.slamine.listavip.service.ConvidadoService;
import org.hibernate.validator.internal.constraintvalidators.hv.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ConvidadoController {

    @Autowired
    private ConvidadoService service;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/listaconvidados")
    public String listaConvidados(Model model){
        Iterable<Convidado> convidados = service.getAll();
        model.addAttribute("convidados" , convidados);
        return "listaconvidados";
    }

    @RequestMapping(value = "salvar", method = RequestMethod.POST)
    public String salvar(@RequestParam String nome, @RequestParam String email, @RequestParam String telefone){
        Convidado convidado = new Convidado(nome, email, telefone);
        service.save(convidado);

        service.sendMail(nome, email);

        return "redirect:listaconvidados";

    }
}
