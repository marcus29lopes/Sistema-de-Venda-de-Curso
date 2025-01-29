package sistema.controller;



/*ler um arquivo de texto chamado produtos.txt, processar os dados e transformá-los
em objetos da classe Item.*/

import sistema.model.Curso;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private ArrayList<String> linhas;
    private List<Curso> cursos;

    public BancoDeDados() {
        this.linhas = new ArrayList<>();
        lerDados();
        this.cursos = new ArrayList<>();
        transformarLinhasEmObjetos();

    }

    void lerDados() {
        try {
            InputStream bytes = new FileInputStream("cursos.txt");//Abre o arquivo como um fluxo de bytes
            InputStreamReader file = new InputStreamReader(bytes);//Converte esses bytes em caracteres legíveis.
            BufferedReader br = new BufferedReader(file);//Melhora a performance, permitindo ler o arquivo linha por linha.
            String linha = br.readLine();
            while (linha != null) {
                linhas.add(linha);
                linha = br.readLine(); //le proxima linha
            }
            System.out.println("Arquivo Lido com sucesso!\n");
            br.close();
        } catch (Exception e) {
            System.out.println("Arquivo Não encontrado.");
        }
    }

    void transformarLinhasEmObjetos() {
        for (int i = 0; i < linhas.size(); i++){
            String[] cursosTexto = linhas.get(i).split(",");//split retorna um array
            String nome = cursosTexto[0];
            double preco = Double.parseDouble(cursosTexto[1]);
            int id = Integer.parseInt(cursosTexto[2]);
            Curso curso = new Curso(nome, preco, id);
            cursos.add(curso);
        }
    }
    public List<Curso> getCursos(){
        return cursos;
    }
}


