package services;

import Repositories.DatasetRepository;
import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import models.Dataset;
import play.api.mvc.Results;
import play.mvc.Result;
import utils.ResponseDataset;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DatasetService {

    @PersistenceContext
    private EntityManager entityManager;

    private final DatasetRepository datasetRepository;
    private Object DatasetResponse;

    @Inject
    public DatasetService(DatasetRepository datasetRepository, EntityManager entityManager) {
        this.datasetRepository = datasetRepository;
        this.entityManager = entityManager;
    }

    public Map<String,Object> getAll(){
        List<Dataset> dataset  = datasetRepository.findAll();
        if(dataset.isEmpty()){
            return ResponseDataset.responseGetall("Success",404,"Dataset Not Found",Collections.emptyList());
        }
        return ResponseDataset.responseGetall("Success",200,"null",dataset);
    }


    public Map<String,Object> getById(String id){
        Optional<Dataset> datasetgetid = datasetRepository.findById(id);
        if (datasetgetid.isPresent()){
            return ResponseDataset.responseGetall("Success",200,"null",datasetRepository.findById(id));
        }
        return ResponseDataset.responseGetall("Fail",404,"Requested Dataset id is not found",null);
    }
}
