package Service;

import model.Pedido;

public class DescontoVip implements EstrategiaDeDesconto{
    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getValorBruto()* 0.95;
    }
}
