/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help_desk;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author johna
 */
@Entity
@Table(name = "baseconhecimento", catalog = "helpdesk", schema = "")
@NamedQueries({
    @NamedQuery(name = "Baseconhecimento_1.findAll", query = "SELECT b FROM Baseconhecimento_1 b"),
    @NamedQuery(name = "Baseconhecimento_1.findById", query = "SELECT b FROM Baseconhecimento_1 b WHERE b.id = :id"),
    @NamedQuery(name = "Baseconhecimento_1.findByProblema", query = "SELECT b FROM Baseconhecimento_1 b WHERE b.problema = :problema"),
    @NamedQuery(name = "Baseconhecimento_1.findBySolucaoProblema", query = "SELECT b FROM Baseconhecimento_1 b WHERE b.solucaoProblema = :solucaoProblema")})
public class Baseconhecimento_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "problema")
    private String problema;
    @Column(name = "solucaoProblema")
    private String solucaoProblema;

    public Baseconhecimento_1() {
    }

    public Baseconhecimento_1(Integer id) {
        this.id = id;
    }

    public Baseconhecimento_1(Integer id, String problema) {
        this.id = id;
        this.problema = problema;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        String oldProblema = this.problema;
        this.problema = problema;
        changeSupport.firePropertyChange("problema", oldProblema, problema);
    }

    public String getSolucaoProblema() {
        return solucaoProblema;
    }

    public void setSolucaoProblema(String solucaoProblema) {
        String oldSolucaoProblema = this.solucaoProblema;
        this.solucaoProblema = solucaoProblema;
        changeSupport.firePropertyChange("solucaoProblema", oldSolucaoProblema, solucaoProblema);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Baseconhecimento_1)) {
            return false;
        }
        Baseconhecimento_1 other = (Baseconhecimento_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "help_desk.Baseconhecimento_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
