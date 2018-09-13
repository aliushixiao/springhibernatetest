package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "teacher", schema = "test")
public class TeacherEntity {
    private String t;
    private String tname;

    @Id
    @Column(name = "T", nullable = false)
    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Basic
    @Column(name = "Tname", nullable = true, length = 10)
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (t != null ? !t.equals(that.t) : that.t != null) return false;
        if (tname != null ? !tname.equals(that.tname) : that.tname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = t != null ? t.hashCode() : 0;
        result = 31 * result + (tname != null ? tname.hashCode() : 0);
        return result;
    }
}
