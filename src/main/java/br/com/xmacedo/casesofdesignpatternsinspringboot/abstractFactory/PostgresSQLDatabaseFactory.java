package br.com.xmacedo.casesofdesignpatternsinspringboot.abstractFactory;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component("postgresSQLFactory")
@ConditionalOnProperty(name = "db.type", havingValue = "postgres")
public class PostgresSQLDatabaseFactory implements DatabaseFactory{

    @Override
    public Connection createConnection() {
        return new PostgresSQLConnection();
    }
    @Override
    public Transaction createTransaction(){
        return new PostgresSQLTransaction();
    }
}
