package br.com.slamine.listavip.service;

import br.com.slamine.listavip.model.Convidado;
import br.com.slamine.listavip.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvidadoService {

    @Autowired
    private ConvidadoRepository repository;
    //private br.com.slamine.enviadorEmail.EmailService emailService;



    public Iterable<Convidado> getAll(){
        Iterable<Convidado> convidados = repository.findAll();
        return convidados;
    }

    public void save(Convidado convidado) {
        repository.save(convidado);
    }

    public void sendMail(String nome, String email) {
        //emailService = new br.com.slamine.enviadorEmail.EmailService();
        //emailService.send(nome, email);
    }
}
