package br.com.xmacedo.casesofdesignpatternsinspringboot.abstractFactory;

public interface Connection {
    void conect();
    void executeQuery(String query);
    void close();
}
