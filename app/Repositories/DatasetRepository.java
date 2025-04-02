package Repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import models.Dataset;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;
import java.util.Optional;

@Singleton
public class DatasetRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    public DatasetRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public List<Dataset> findAll(){
        TypedQuery<Dataset> query = entityManager.createQuery("SELECT d from Dataset d",Dataset.class);
        return query.getResultList();
    }
    public Optional<Dataset> findById(String id){
        Dataset dataset = entityManager.find(Dataset.class ,id);
        return Optional.ofNullable(dataset);
    }
    }




