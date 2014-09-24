
package br.edu.infnet.business;

import br.edu.infnet.DAO.PessoaFisicaDAO;
import br.edu.infnet.domain.PessoaFisica;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Hudson Schumaker
 */
@Stateless
public class PessoaFisicaDTOImpl implements PessoaFisicaDTO {

    @EJB
    private PessoaFisicaDAO pfDAO;

    @Override
    public void cadastrar(PessoaFisica pf) {
        pfDAO.cadastrar(pf);
    }

    @Override
    public void alterar(PessoaFisica pf) {
        pfDAO.atualizar(pf);
    }

    @Override
    public void excluir(PessoaFisica pf) {
        pfDAO.excluir(pf);
    }

    @Override
    public void obter(Integer id) {
        pfDAO.obter(id);
    }

    @Override
    public List<PessoaFisica> lista() {
        return pfDAO.listar();
    }
}