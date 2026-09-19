package com.montenegrosistemas.produtosapi.repositories;

import com.montenegrosistemas.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {


}
