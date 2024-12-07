package main.java.br.com.ltoledo.dao;

import main.java.br.com.ltoledo.domain.Marca;
import main.java.br.com.ltoledo.domain.Registro;

public interface IRegistroDao {

    Registro cadastrar(Registro reg);

    Registro buscarPorCodigoMarca(String codigoMarca);

    Registro buscarPorMarca(Marca marca);

    Registro buscarPorCodigoMarcaCriteria(String codigoMarca);
    Registro buscarPorMarcaCriteria(Marca marca);

}