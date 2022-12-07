package br.com.ada.ecommerce;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public class Carrinho {

    private BigDecimal total;
    private List<Item> itens;

    public Carrinho(List<Item> itens) {
        this.itens = itens;
    }

    public BigDecimal getTotal() {
        total = itens.stream()
        .map(item -> item.getProduto().getValor().multiply(new BigDecimal(item.getQuantidade()))).reduce(BigDecimal.ZERO, BigDecimal::add);

        Optional<BigDecimal> valor = itens.stream()
            .map(item -> item.getProduto().getValor()
                            .multiply(new BigDecimal(item.getQuantidade())))
            .reduce(BigDecimal::add);

        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void listProducts(){
        itens.stream().forEach(item -> {
            System.out.printf("Produto: %s - Valor unitário: %s%n", item.getProduto().getNome(), item.getProduto().getValor());
        });
    }
}
