package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.Despesa;
import br.fiap.modelo.DespesaDAO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TesteDespesa {
    public static void main(String[] args) {
        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DespesaDAO dao = new DespesaDAO();
        Despesa despesa = new Despesa();
        /*despesa.setId(2L);
        despesa.setDescricao("sobremesa no shopping");
        despesa.setValor(20.00);
        despesa.setData(LocalDate.parse("21/08/2025", mascara));
        despesa.setCategoria(new Categoria(6L, "Alimentação"));

        dao.inserir(despesa);*/
//        List<Despesa> lista = dao.listar();
//        for (Despesa desp : lista){
//            System.out.println(desp.getId());
//            System.out.println(desp.getCategoria().getId());
//            System.out.println(desp.getValor());
//            System.out.println(desp.getDescricao());
//            System.out.println(desp.getData());
//            System.out.println();
//        }

        List<Despesa> relatorio = dao.relatorio();
        for (Despesa desp2 : relatorio) {
            System.out.println("DESCRIÇÃO: " + desp2.getDescricao());
            System.out.println("VALOR: " + desp2.getValor());
            System.out.println("DATA: " + desp2.getData());
            System.out.println("CATEGORIA: " + desp2.getCategoria().getCategoria());
            System.out.println("-----------------------------------------");
        }

    }
}
