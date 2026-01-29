package br.com.xmacedo.casesofdesignpatternsinspringboot.abstractFactory;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component("postgresFactory")
@ConditionalOnProperty(name = "db.type", havingValue = "postgres")
public class PostgresDatabaseFactory implements DatabaseFactory{

    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }
    @Override
    public Transaction createTransaction(){
        return new PostgresTransaction();
    }
}
