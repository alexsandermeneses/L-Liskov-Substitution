package br.com.hcode.solid.lsp;

import java.sql.SQLOutput;

public class DebitCard extends NubankCard{

    @Override
    public void validate() throws Exception {
        System.out.println("Verificando saldo");
        System.out.println("Saldo ok");
    }
}
