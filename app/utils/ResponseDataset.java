package utils;

import com.fasterxml.jackson.databind.JsonNode;
import play.api.mvc.Result;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class ResponseDataset {
    public static Map<String,Object> responseGetall(String status,int responseCode,String errorMessage, Object result){

        Map<String,Object> response = new LinkedHashMap<>();
        response.put("id","api.read");
        response.put("ver","1.0");
        response.put("ts", Instant.now().toString());

        Map<String,Object> param = new LinkedHashMap<>();
        param.put("resmsgid", UUID.randomUUID().toString());
        param.put("status",status);
        param.put("error_msg",errorMessage);

        response.put("params",param);
        response.put("responseCode",responseCode);
        response.put("result",result);

        return response;
    }


}