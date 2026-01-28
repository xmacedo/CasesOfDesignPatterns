package br.com.xmacedo.casesofdesignpatternsinspringboot.abstractFactory;

public interface DatabaseFactory {
    Connection createConnection();
    Transaction createTransaction();
}
