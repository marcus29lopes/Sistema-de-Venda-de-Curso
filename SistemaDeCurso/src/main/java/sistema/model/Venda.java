package sistema.model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Curso> cursosVenda;

    public Venda(){
        this.cursosVenda = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso){
        cursosVenda.add(curso);
    }
    public void adicionarCurso(int id, ArrayList<Curso> cursos){
        cursosVenda.add(cursos.get(id-1));
    }

    public void removerCurso(int id){
        for (int i = 0; i <cursosVenda.size(); i++){
            Curso cursoRemovido = cursosVenda.get(i);
            if (cursoRemovido.getId() == id){
                cursosVenda.remove(cursoRemovido);
                System.out.println("Voce removeu o curso de: " + cursoRemovido.getNome());
            }
        }
    }

    public void calcularTotal(){
        double total = 0;
        for(int i = 0; i < cursosVenda.size(); i++){
            Curso curso = cursosVenda.get(i);
            double valor = curso.getPreco();
            total+=valor;
        }
        System.out.println("O valor total é: " + total);
    }

}
