package br.com.hcode.solid.lsp;

public class MainPayment {
    public static void main(String[] args) throws Exception {
        //CreditCard card = new CreditCard();
        //DebitCard card = new DebitCard();
        NubankReward card = new NubankReward(); //chamadas diferentes

        card.validate(); //metodos são os mesmos
        card.collectPayment();
    }
}
