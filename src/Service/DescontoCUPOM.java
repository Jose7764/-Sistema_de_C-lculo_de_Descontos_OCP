package Service;

import model.Pedido;

public class DescontoCUPOM implements EstrategiaDeDesconto{

    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.85;
    }


}
