package Service;

import model.Pedido;

public interface EstrategiaDeDesconto {
    double aplicarDesconto(Pedido pedido);
}
