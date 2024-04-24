package med.alura.api.medico;

import jakarta.validation.constraints.NotNull;
import med.alura.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}
