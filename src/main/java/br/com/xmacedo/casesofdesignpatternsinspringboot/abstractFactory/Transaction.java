package br.com.xmacedo.casesofdesignpatternsinspringboot.abstractFactory;

public interface Transaction {
    void begin();
    void commit();
    void rollback();
}
