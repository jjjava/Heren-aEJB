
package br.edu.infnet.DAO;

import javax.ejb.Stateful;

/**
 *
 * @author Javapos
 */
import br.edu.infnet.domain.PessoaFisica;

@Stateful
public class PessoaFisicaDAOImpl extends AbstractDAO<PessoaFisica> implements PessoaFisicaDAO {

    public PessoaFisicaDAOImpl() {
        super(PessoaFisica.class);
    }
}