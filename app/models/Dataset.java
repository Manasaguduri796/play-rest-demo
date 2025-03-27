package models;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.Map;
@Entity
@Table(name = "table_2")
public class Dataset {
   @Id
   private String id;
   @JdbcTypeCode(SqlTypes.JSON)
   @Column( name="dataschema",columnDefinition = "Jsonb")
   private Map<String,Object> dataschema;
   @JdbcTypeCode(SqlTypes.JSON)
   @Column(name = "router_config",columnDefinition = "Jsonb")
   private Map<String,Object> routerConfig;
   @Enumerated(EnumType.STRING)
   @Column(name = "status",nullable = false)
   private Status status;
   @Column(name = "created_by",nullable = false)
   private String createdBy;
   @Column(name = "updated_by",nullable = false)
   private String updatedBy;
   @CreationTimestamp
   private LocalDateTime createdByDate;
   @UpdateTimestamp
   private LocalDateTime updatedByDate;
   //constructors and getter setters methods..
   public Dataset(){

   }
   public Dataset(String id, Map<String, Object> dataschema, Map<String, Object> routerConfig, Status status, String createdBy, String updatedBy, LocalDateTime createdByDate, LocalDateTime updatedByDate) {
      this.id = id;
      this.dataschema = dataschema;
      this.routerConfig = routerConfig;
      this.status = status;
      this.createdBy = createdBy;
      this.updatedBy = updatedBy;
      this.createdByDate = createdByDate;
      this.updatedByDate = updatedByDate;
   }


   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public Map<String, Object> getDataschema() {
      return dataschema;
   }

   public void setDataschema(Map<String, Object> dataschema) {
      this.dataschema = dataschema;
   }

   public Map<String, Object> getRouterConfig() {
      return routerConfig;
   }

   public void setRouterConfig(Map<String, Object> routerConfig) {
      this.routerConfig = routerConfig;
   }

   public Status getStatus() {
      return status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public String getCreatedBy() {
      return createdBy;
   }

   public void setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
   }

   public String getUpdatedBy() {
      return updatedBy;
   }

   public void setUpdatedBy(String updatedBy) {
      this.updatedBy = updatedBy;
   }

   public LocalDateTime getCreatedByDate() {
      return createdByDate;
   }

   public void setCreatedByDate(LocalDateTime createdByDate) {
      this.createdByDate = createdByDate;
   }

   public LocalDateTime getUpdatedByDate() {
      return updatedByDate;
   }

   public void setUpdatedByDate(LocalDateTime updatedByDate) {
      this.updatedByDate = updatedByDate;
   }
   @Override
   public String toString() {
      return "Dataset{" +
              "id='" + id + '\'' +
              ", dataschema=" + dataschema +
              ", routerConfig=" + routerConfig +
              ", status=" + status +
              ", createdBy='" + createdBy + '\'' +
              ", updatedBy='" + updatedBy + '\'' +
              ", createdByDate=" + createdByDate +
              ", updatedByDate=" + updatedByDate +
              '}';
   }
}


