package br.com.hcode.solid.lsp;

public class CreditCard extends NubankCard{

    @Override
    public void validate() throws Exception {

        //validação do cartao
        System.out.println("Validando limite");
        System.out.println("Limite ok");
    }
}