package br.com.organicxpto.pedidos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 29/02/2024
 * Project Name: spring-data
 */

public interface pedidoRepository extends JpaRepository<Pedido, UUID> {
}
