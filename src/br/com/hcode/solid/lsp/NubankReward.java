package br.com.hcode.solid.lsp;

public class NubankReward implements IPaymentInstrument{
    @Override
    public void validate() throws Exception {
        //validações
        System.out.println("Limite ok, Rewards ok");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado com sucesso");
        System.out.println("Pontuação creditada no Programa Rewards");
    }
}
