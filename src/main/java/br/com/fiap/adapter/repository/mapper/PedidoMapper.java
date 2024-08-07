package br.com.fiap.adapter.repository.mapper;

import br.com.fiap.adapter.repository.model.PedidoJpa;
import br.com.fiap.core.domain.model.Pedido;
import br.com.fiap.core.domain.model.response.PedidoResponse;

public class PedidoMapper {
    public PedidoJpa toPedidoJpa(Pedido pedido) {
        return new PedidoJpa(
                pedido.getCategoria(),
                pedido.getNome(),
                pedido.getDescricao(),
                pedido.getPreco()
        );
    }

    public Pedido toPedido(PedidoJpa pedidoJpa) {
        return new Pedido(
                pedidoJpa.getCategoria(),
                pedidoJpa.getNome(),
                pedidoJpa.getDescricao(),
                pedidoJpa.getPreco()
        );
    }

    public PedidoResponse toPedidoResponse(PedidoJpa pedidoJpa) {
        return new PedidoResponse(
                pedidoJpa.getId(),
                pedidoJpa.getCategoria(),
                pedidoJpa.getNome(),
                pedidoJpa.getDescricao(),
                pedidoJpa.getPreco(),
                Strings.EMPTY
        );
    }
}
