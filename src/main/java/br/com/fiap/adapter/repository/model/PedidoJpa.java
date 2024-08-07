package br.com.fiap.adapter.repository.model;

import br.com.fiap.core.domain.model.Cliente;
import br.com.fiap.core.domain.model.PedidoStatus;
import br.com.fiap.core.domain.model.Produto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "pedido")
public class PedidoJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    Cliente cliente;
    @Column(nullable = false)
    String numero;
    @Column(nullable = false)
    PedidoStatus statusPedido;
    @OneToMany
    @Column(nullable = false)
    List<Produto> produtos;

    public PedidoJpa(Cliente cliente, String numero, PedidoStatus statusPedido, List<Produto> produtos) {
        this.id = null;
        this.cliente = cliente;
        this.numero = numero;
        this.statusPedido = statusPedido;
        this.produtos = produtos;
    }

}
