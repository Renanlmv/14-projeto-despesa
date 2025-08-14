package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;

import java.util.List;

public class MainTeste {
    public static void main(String[] args) {
//        System.out.println(Conexao.conectar());
        CategoriaDAO dao = new CategoriaDAO();
                                        // L indica que é long
//        Categoria categoria = new Categoria(5L, "Segurança");
//        dao.inserir(categoria);
        List<Categoria> lista = dao.listar();
        for (Categoria categoria : lista){
            System.out.println(categoria.getId() + " --> " + categoria.getCategoria());
        }

    }
}
