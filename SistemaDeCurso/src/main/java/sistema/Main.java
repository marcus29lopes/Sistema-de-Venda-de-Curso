package sistema;

import sistema.controller.BancoDeDados;
import sistema.model.Curso;
import sistema.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BancoDeDados bc = new BancoDeDados();
        List<Curso> cursos = bc.getCursos();
        
        Venda venda = new Venda();

        venda.adicionarCurso(3,cursos);
        venda.calcularTotal();

    }
}