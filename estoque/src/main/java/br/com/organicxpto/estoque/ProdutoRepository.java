package br.com.organicxpto.estoque;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 29/02/2024
 * Project Name: spring-data
 */

public interface ProdutoRepository extends MongoRepository<Produto, Long> {
}
