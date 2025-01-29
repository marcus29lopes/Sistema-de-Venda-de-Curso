package sistema;

import sistema.model.Curso;
import sistema.model.Venda;

public class Main {
    public static void main(String[] args) {

        Venda venda = new Venda();
        venda.adicionarCurso(new Curso("Inglês", 1200, 1));
        venda.adicionarCurso(new Curso("Farmacia", 1500, 2));
        venda.calcularTotal();
        venda.removerCurso(2);
        venda.calcularTotal();

    }
}