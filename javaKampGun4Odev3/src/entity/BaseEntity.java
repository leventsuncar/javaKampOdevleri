package entity;

import java.util.Date;

public abstract class BaseEntity {
    private Date createdAt;

    public BaseEntity() {
    }

    public BaseEntity(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
