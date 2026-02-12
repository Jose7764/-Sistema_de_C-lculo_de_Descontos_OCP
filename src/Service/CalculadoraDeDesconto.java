package Service;

import model.Pedido;
import model.TipoDesconto;

public class CalculadoraDeDesconto  {

    public double aplicarDesconto(Pedido pedido, EstrategiaDeDesconto estrategiaDeDesconto) {

        return estrategiaDeDesconto.aplicarDesconto(pedido);
    }

}
