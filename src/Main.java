import Service.CalculadoraDeDesconto;
import Service.DescontoCUPOM;
import Service.EstrategiaDeDesconto;
import model.Pedido;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido("1", 22, 21, "jose@gmial.com", null);

        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        EstrategiaDeDesconto estrategiaDeDesconto = new DescontoCUPOM();

        double valorFinal = calculadoraDeDesconto.aplicarDesconto(pedido, estrategiaDeDesconto);

        System.out.println("Valor descontado: "+ valorFinal);
    }
}