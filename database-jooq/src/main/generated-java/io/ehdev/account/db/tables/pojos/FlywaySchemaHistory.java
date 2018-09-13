/*
 * This file is generated by jOOQ.
 */
package io.ehdev.account.db.tables.pojos;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "flyway_schema_history", schema = "account_manager", indexes = {
    @Index(name = "flyway_schema_history_s_idx", columnList = "success ASC"),
    @Index(name = "PRIMARY", unique = true, columnList = "installed_rank ASC")
})
public class FlywaySchemaHistory implements Serializable {

    private static final long serialVersionUID = 1279512775;

    private Integer installedRank;
    private String  version;
    private String  description;
    private String  type;
    private String  script;
    private Integer checksum;
    private String  installedBy;
    private Instant installedOn;
    private Integer executionTime;
    private Boolean success;

    public FlywaySchemaHistory() {}

    public FlywaySchemaHistory(FlywaySchemaHistory value) {
        this.installedRank = value.installedRank;
        this.version = value.version;
        this.description = value.description;
        this.type = value.type;
        this.script = value.script;
        this.checksum = value.checksum;
        this.installedBy = value.installedBy;
        this.installedOn = value.installedOn;
        this.executionTime = value.executionTime;
        this.success = value.success;
    }

    public FlywaySchemaHistory(
        Integer installedRank,
        String  version,
        String  description,
        String  type,
        String  script,
        Integer checksum,
        String  installedBy,
        Instant installedOn,
        Integer executionTime,
        Boolean success
    ) {
        this.installedRank = installedRank;
        this.version = version;
        this.description = description;
        this.type = type;
        this.script = script;
        this.checksum = checksum;
        this.installedBy = installedBy;
        this.installedOn = installedOn;
        this.executionTime = executionTime;
        this.success = success;
    }

    @Id
    @Column(name = "installed_rank", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getInstalledRank() {
        return this.installedRank;
    }

    public void setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
    }

    @Column(name = "version", length = 50)
    @Size(max = 50)
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Column(name = "description", nullable = false, length = 200)
    @NotNull
    @Size(max = 200)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "type", nullable = false, length = 20)
    @NotNull
    @Size(max = 20)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "script", nullable = false, length = 1000)
    @NotNull
    @Size(max = 1000)
    public String getScript() {
        return this.script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Column(name = "checksum", precision = 10)
    public Integer getChecksum() {
        return this.checksum;
    }

    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    @Column(name = "installed_by", nullable = false, length = 100)
    @NotNull
    @Size(max = 100)
    public String getInstalledBy() {
        return this.installedBy;
    }

    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
    }

    @Column(name = "installed_on", nullable = false)
    public Instant getInstalledOn() {
        return this.installedOn;
    }

    public void setInstalledOn(Instant installedOn) {
        this.installedOn = installedOn;
    }

    @Column(name = "execution_time", nullable = false, precision = 10)
    @NotNull
    public Integer getExecutionTime() {
        return this.executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    @Column(name = "success", nullable = false)
    @NotNull
    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FlywaySchemaHistory (");

        sb.append(installedRank);
        sb.append(", ").append(version);
        sb.append(", ").append(description);
        sb.append(", ").append(type);
        sb.append(", ").append(script);
        sb.append(", ").append(checksum);
        sb.append(", ").append(installedBy);
        sb.append(", ").append(installedOn);
        sb.append(", ").append(executionTime);
        sb.append(", ").append(success);

        sb.append(")");
        return sb.toString();
    }
}
