package sistema;

import sistema.controller.BancoDeDados;
import sistema.model.Curso;
import sistema.model.Venda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BancoDeDados bc = new BancoDeDados();
        ArrayList<Curso> cursos = bc.getCursos();

        Venda venda = new Venda();
        venda.adicionarCurso(1, cursos);
        venda.adicionarCurso(2, cursos);
        venda.adicionarCurso(3,cursos);
        venda.removerCurso(2);
        venda.calcularTotal();

    }
}