package br.edu.infnet.DAO;

import br.edu.infnet.domain.PessoaJuridica;

/**
 *
 * @author Javapos
 */
public interface PessoaJuridicaDAO {

    void cadastrar(PessoaJuridica pj);

    void atualizar(PessoaJuridica pj);

    void excluir(PessoaJuridica pj);

    PessoaJuridica obter(Integer id);
}
