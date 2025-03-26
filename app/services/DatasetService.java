package services;

import Repositories.DatasetRepository;
import com.fasterxml.jackson.databind.JsonNode;
import models.Dataset;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class DatasetService {
    private final DatasetRepository datasetRepository;

    @Inject
    public DatasetService(DatasetRepository datasetRepository) {
        this.datasetRepository = datasetRepository;
    }
}
