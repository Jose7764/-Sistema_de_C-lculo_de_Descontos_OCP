package Service;

import model.Pedido;

public class DescontoSazonal implements EstrategiaDeDesconto{
    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.90;
    }
}
