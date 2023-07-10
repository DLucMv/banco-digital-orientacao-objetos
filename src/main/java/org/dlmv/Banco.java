package org.dlmv;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.dlmv.contas.Conta;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class Banco {

    private String nome;
    private List<Conta> contas;


}
