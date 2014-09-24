

package br.edu.infnet.DAO;

import br.edu.infnet.domain.PessoaFisica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Javapos
 */

@Local
public interface PessoaFisicaDAO {
    
    void cadastrar(PessoaFisica pf);
    void atualizar(PessoaFisica pf);
    void excluir(PessoaFisica pf);
    PessoaFisica obter(Integer id);
    List<PessoaFisica> listar();
}
