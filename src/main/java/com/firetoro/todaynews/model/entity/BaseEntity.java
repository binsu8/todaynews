package com.firetoro.todaynews.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@MappedSuperclass
public abstract class BaseEntity {

    @Column(insertable = false, updatable = false)
    protected Instant created;

    @Column(insertable = false, updatable = false)
    protected Instant updated;



    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public Instant getUpdated() {
        return updated;
    }

    public void setUpdated(Instant updated) {
        this.updated = updated;
    }

    /**
     * convert DB entity to json POJO, avoid serialization and persistent problems
     * @param withSet with fields
     * @return json POJO
     */
    /*
    public abstract BaseEntity json(Set<With> withSet);
    */
    /*
    @SuppressWarnings("unchecked")
    public static <T extends BaseEntity> List<T> json(Collection<T> collection, Set<With> withSet) {
        return (List<T>) collection.stream().map(o -> o.json(withSet)).collect(Collectors.toList());
    }
    */
}
