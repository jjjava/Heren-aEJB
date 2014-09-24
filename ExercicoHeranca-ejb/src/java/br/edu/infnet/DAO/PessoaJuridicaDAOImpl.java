/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.DAO;

import br.edu.infnet.domain.PessoaJuridica;
import javax.ejb.Stateful;

/**
 *
 * @author Javapos
 */
@Stateful
public class PessoaJuridicaDAOImpl extends AbstractDAO<PessoaJuridica> implements PessoaJuridicaDAO {

    public PessoaJuridicaDAOImpl() {
        super(PessoaJuridica.class);
    }
}