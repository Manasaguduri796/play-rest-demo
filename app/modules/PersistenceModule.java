package modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class PersistenceModule extends AbstractModule {
    @Provides
    @Singleton
    public EntityManagerFactory ProvideEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("defaultPersistenceUnit");
    }
    @Provides
    public EntityManager provideEntityManager(EntityManagerFactory ewf){
        return ewf.createEntityManager();
    }


}
