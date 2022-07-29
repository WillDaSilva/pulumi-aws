// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConstraintResult {
    private final @Nullable String acceptLanguage;
    /**
     * @return Description of the constraint.
     * 
     */
    private final String description;
    private final String id;
    /**
     * @return Owner of the constraint.
     * 
     */
    private final String owner;
    /**
     * @return Constraint parameters in JSON format.
     * 
     */
    private final String parameters;
    /**
     * @return Portfolio identifier.
     * 
     */
    private final String portfolioId;
    /**
     * @return Product identifier.
     * 
     */
    private final String productId;
    /**
     * @return Constraint status.
     * 
     */
    private final String status;
    /**
     * @return Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetConstraintResult(
        @CustomType.Parameter("acceptLanguage") @Nullable String acceptLanguage,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("owner") String owner,
        @CustomType.Parameter("parameters") String parameters,
        @CustomType.Parameter("portfolioId") String portfolioId,
        @CustomType.Parameter("productId") String productId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.acceptLanguage = acceptLanguage;
        this.description = description;
        this.id = id;
        this.owner = owner;
        this.parameters = parameters;
        this.portfolioId = portfolioId;
        this.productId = productId;
        this.status = status;
        this.type = type;
    }

    public Optional<String> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    /**
     * @return Description of the constraint.
     * 
     */
    public String description() {
        return this.description;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Owner of the constraint.
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return Constraint parameters in JSON format.
     * 
     */
    public String parameters() {
        return this.parameters;
    }
    /**
     * @return Portfolio identifier.
     * 
     */
    public String portfolioId() {
        return this.portfolioId;
    }
    /**
     * @return Product identifier.
     * 
     */
    public String productId() {
        return this.productId;
    }
    /**
     * @return Constraint status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConstraintResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private String description;
        private String id;
        private String owner;
        private String parameters;
        private String portfolioId;
        private String productId;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConstraintResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.owner = defaults.owner;
    	      this.parameters = defaults.parameters;
    	      this.portfolioId = defaults.portfolioId;
    	      this.productId = defaults.productId;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder parameters(String parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder portfolioId(String portfolioId) {
            this.portfolioId = Objects.requireNonNull(portfolioId);
            return this;
        }
        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetConstraintResult build() {
            return new GetConstraintResult(acceptLanguage, description, id, owner, parameters, portfolioId, productId, status, type);
        }
    }
}