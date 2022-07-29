// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventTargetRedshiftTarget {
    /**
     * @return The name of the database.
     * 
     */
    private final String database;
    /**
     * @return The database user name.
     * 
     */
    private final @Nullable String dbUser;
    /**
     * @return The name or ARN of the secret that enables access to the database.
     * 
     */
    private final @Nullable String secretsManagerArn;
    /**
     * @return The SQL statement text to run.
     * 
     */
    private final @Nullable String sql;
    /**
     * @return The name of the SQL statement.
     * 
     */
    private final @Nullable String statementName;
    /**
     * @return Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * 
     */
    private final @Nullable Boolean withEvent;

    @CustomType.Constructor
    private EventTargetRedshiftTarget(
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("dbUser") @Nullable String dbUser,
        @CustomType.Parameter("secretsManagerArn") @Nullable String secretsManagerArn,
        @CustomType.Parameter("sql") @Nullable String sql,
        @CustomType.Parameter("statementName") @Nullable String statementName,
        @CustomType.Parameter("withEvent") @Nullable Boolean withEvent) {
        this.database = database;
        this.dbUser = dbUser;
        this.secretsManagerArn = secretsManagerArn;
        this.sql = sql;
        this.statementName = statementName;
        this.withEvent = withEvent;
    }

    /**
     * @return The name of the database.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The database user name.
     * 
     */
    public Optional<String> dbUser() {
        return Optional.ofNullable(this.dbUser);
    }
    /**
     * @return The name or ARN of the secret that enables access to the database.
     * 
     */
    public Optional<String> secretsManagerArn() {
        return Optional.ofNullable(this.secretsManagerArn);
    }
    /**
     * @return The SQL statement text to run.
     * 
     */
    public Optional<String> sql() {
        return Optional.ofNullable(this.sql);
    }
    /**
     * @return The name of the SQL statement.
     * 
     */
    public Optional<String> statementName() {
        return Optional.ofNullable(this.statementName);
    }
    /**
     * @return Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * 
     */
    public Optional<Boolean> withEvent() {
        return Optional.ofNullable(this.withEvent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetRedshiftTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private @Nullable String dbUser;
        private @Nullable String secretsManagerArn;
        private @Nullable String sql;
        private @Nullable String statementName;
        private @Nullable Boolean withEvent;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetRedshiftTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.dbUser = defaults.dbUser;
    	      this.secretsManagerArn = defaults.secretsManagerArn;
    	      this.sql = defaults.sql;
    	      this.statementName = defaults.statementName;
    	      this.withEvent = defaults.withEvent;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder dbUser(@Nullable String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public Builder secretsManagerArn(@Nullable String secretsManagerArn) {
            this.secretsManagerArn = secretsManagerArn;
            return this;
        }
        public Builder sql(@Nullable String sql) {
            this.sql = sql;
            return this;
        }
        public Builder statementName(@Nullable String statementName) {
            this.statementName = statementName;
            return this;
        }
        public Builder withEvent(@Nullable Boolean withEvent) {
            this.withEvent = withEvent;
            return this;
        }        public EventTargetRedshiftTarget build() {
            return new EventTargetRedshiftTarget(database, dbUser, secretsManagerArn, sql, statementName, withEvent);
        }
    }
}