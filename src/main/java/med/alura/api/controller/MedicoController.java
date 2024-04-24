package med.alura.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.alura.api.medico.DadosCadastroMedico;
import med.alura.api.medico.DadosListagemMedico;
import med.alura.api.medico.Medico;
import med.alura.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
       repository.save(new Medico(dados));
    }

    @GetMapping
    public List<DadosListagemMedico> listar(){
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}
