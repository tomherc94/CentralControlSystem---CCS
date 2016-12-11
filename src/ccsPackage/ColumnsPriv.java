/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccsPackage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author gusta
 */
@Entity
@Table(name = "columns_priv", catalog = "mysql", schema = "")
@NamedQueries({
    @NamedQuery(name = "ColumnsPriv.findAll", query = "SELECT c FROM ColumnsPriv c")
    , @NamedQuery(name = "ColumnsPriv.findByHost", query = "SELECT c FROM ColumnsPriv c WHERE c.columnsPrivPK.host = :host")
    , @NamedQuery(name = "ColumnsPriv.findByDb", query = "SELECT c FROM ColumnsPriv c WHERE c.columnsPrivPK.db = :db")
    , @NamedQuery(name = "ColumnsPriv.findByUser", query = "SELECT c FROM ColumnsPriv c WHERE c.columnsPrivPK.user = :user")
    , @NamedQuery(name = "ColumnsPriv.findByTablename", query = "SELECT c FROM ColumnsPriv c WHERE c.columnsPrivPK.tablename = :tablename")
    , @NamedQuery(name = "ColumnsPriv.findByColumnname", query = "SELECT c FROM ColumnsPriv c WHERE c.columnsPrivPK.columnname = :columnname")
    , @NamedQuery(name = "ColumnsPriv.findByTimestamp", query = "SELECT c FROM ColumnsPriv c WHERE c.timestamp = :timestamp")
    , @NamedQuery(name = "ColumnsPriv.findByColumnpriv", query = "SELECT c FROM ColumnsPriv c WHERE c.columnpriv = :columnpriv")})
public class ColumnsPriv implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ColumnsPrivPK columnsPrivPK;
    @Basic(optional = false)
    @Column(name = "Timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    @Basic(optional = false)
    @Column(name = "Column_priv")
    private String columnpriv;

    public ColumnsPriv() {
    }

    public ColumnsPriv(ColumnsPrivPK columnsPrivPK) {
        this.columnsPrivPK = columnsPrivPK;
    }

    public ColumnsPriv(ColumnsPrivPK columnsPrivPK, Date timestamp, String columnpriv) {
        this.columnsPrivPK = columnsPrivPK;
        this.timestamp = timestamp;
        this.columnpriv = columnpriv;
    }

    public ColumnsPriv(String host, String db, String user, String tablename, String columnname) {
        this.columnsPrivPK = new ColumnsPrivPK(host, db, user, tablename, columnname);
    }

    public ColumnsPrivPK getColumnsPrivPK() {
        return columnsPrivPK;
    }

    public void setColumnsPrivPK(ColumnsPrivPK columnsPrivPK) {
        this.columnsPrivPK = columnsPrivPK;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        Date oldTimestamp = this.timestamp;
        this.timestamp = timestamp;
        changeSupport.firePropertyChange("timestamp", oldTimestamp, timestamp);
    }

    public String getColumnpriv() {
        return columnpriv;
    }

    public void setColumnpriv(String columnpriv) {
        String oldColumnpriv = this.columnpriv;
        this.columnpriv = columnpriv;
        changeSupport.firePropertyChange("columnpriv", oldColumnpriv, columnpriv);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (columnsPrivPK != null ? columnsPrivPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ColumnsPriv)) {
            return false;
        }
        ColumnsPriv other = (ColumnsPriv) object;
        if ((this.columnsPrivPK == null && other.columnsPrivPK != null) || (this.columnsPrivPK != null && !this.columnsPrivPK.equals(other.columnsPrivPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccsPackage.ColumnsPriv[ columnsPrivPK=" + columnsPrivPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
