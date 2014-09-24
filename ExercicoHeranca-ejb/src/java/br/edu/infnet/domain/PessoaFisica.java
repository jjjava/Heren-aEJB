
package br.edu.infnet.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Javapos
 */

@Entity
@DiscriminatorValue(value = "PF")
public class PessoaFisica extends Pessoa{

    @Column(name="cpfcnpj")
    private String cpf;
    
    public PessoaFisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}