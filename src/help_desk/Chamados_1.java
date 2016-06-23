
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


@Entity
@Table(name = "chamados", catalog = "helpdesk", schema = "")
@NamedQueries({
    @NamedQuery(name = "Chamados_1.findAll", query = "SELECT c FROM Chamados_1 c"),
    @NamedQuery(name = "Chamados_1.findByNumeroChamado", query = "SELECT c FROM Chamados_1 c WHERE c.numeroChamado = :numeroChamado"),
    @NamedQuery(name = "Chamados_1.findByTitulo", query = "SELECT c FROM Chamados_1 c WHERE c.titulo = :titulo"),
    @NamedQuery(name = "Chamados_1.findByOriginador", query = "SELECT c FROM Chamados_1 c WHERE c.originador = :originador"),
    @NamedQuery(name = "Chamados_1.findByCompromisso", query = "SELECT c FROM Chamados_1 c WHERE c.compromisso = :compromisso"),
    @NamedQuery(name = "Chamados_1.findByTipo", query = "SELECT c FROM Chamados_1 c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Chamados_1.findByPrioridade", query = "SELECT c FROM Chamados_1 c WHERE c.prioridade = :prioridade"),
    @NamedQuery(name = "Chamados_1.findByDescricao", query = "SELECT c FROM Chamados_1 c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "Chamados_1.findBySolucao", query = "SELECT c FROM Chamados_1 c WHERE c.solucao = :solucao"),
    @NamedQuery(name = "Chamados_1.findByMotivoRejeicao", query = "SELECT c FROM Chamados_1 c WHERE c.motivoRejeicao = :motivoRejeicao"),
    @NamedQuery(name = "Chamados_1.findByConclusao", query = "SELECT c FROM Chamados_1 c WHERE c.conclusao = :conclusao")})
public class Chamados_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numeroChamado")
    private Integer numeroChamado;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "originador")
    private String originador;
    @Basic(optional = false)
    @Column(name = "compromisso")
    private String compromisso;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "prioridade")
    private String prioridade;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "solucao")
    private String solucao;
    @Column(name = "motivoRejeicao")
    private String motivoRejeicao;
    @Column(name = "conclusao")
    private String conclusao;

    public Chamados_1() {
    }

    public Chamados_1(Integer numeroChamado) {
        this.numeroChamado = numeroChamado;
    }

    public Chamados_1(Integer numeroChamado, String titulo, String originador, String compromisso, String tipo, String prioridade, String descricao) {
        this.numeroChamado = numeroChamado;
        this.titulo = titulo;
        this.originador = originador;
        this.compromisso = compromisso;
        this.tipo = tipo;
        this.prioridade = prioridade;
        this.descricao = descricao;
    }

    public Integer getNumeroChamado() {
        return numeroChamado;
    }

    public void setNumeroChamado(Integer numeroChamado) {
        Integer oldNumeroChamado = this.numeroChamado;
        this.numeroChamado = numeroChamado;
        changeSupport.firePropertyChange("numeroChamado", oldNumeroChamado, numeroChamado);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        String oldTitulo = this.titulo;
        this.titulo = titulo;
        changeSupport.firePropertyChange("titulo", oldTitulo, titulo);
    }

    public String getOriginador() {
        return originador;
    }

    public void setOriginador(String originador) {
        String oldOriginador = this.originador;
        this.originador = originador;
        changeSupport.firePropertyChange("originador", oldOriginador, originador);
    }

    public String getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(String compromisso) {
        String oldCompromisso = this.compromisso;
        this.compromisso = compromisso;
        changeSupport.firePropertyChange("compromisso", oldCompromisso, compromisso);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        String oldPrioridade = this.prioridade;
        this.prioridade = prioridade;
        changeSupport.firePropertyChange("prioridade", oldPrioridade, prioridade);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        String oldSolucao = this.solucao;
        this.solucao = solucao;
        changeSupport.firePropertyChange("solucao", oldSolucao, solucao);
    }

    public String getMotivoRejeicao() {
        return motivoRejeicao;
    }

    public void setMotivoRejeicao(String motivoRejeicao) {
        String oldMotivoRejeicao = this.motivoRejeicao;
        this.motivoRejeicao = motivoRejeicao;
        changeSupport.firePropertyChange("motivoRejeicao", oldMotivoRejeicao, motivoRejeicao);
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        String oldConclusao = this.conclusao;
        this.conclusao = conclusao;
        changeSupport.firePropertyChange("conclusao", oldConclusao, conclusao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroChamado != null ? numeroChamado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chamados_1)) {
            return false;
        }
        Chamados_1 other = (Chamados_1) object;
        if ((this.numeroChamado == null && other.numeroChamado != null) || (this.numeroChamado != null && !this.numeroChamado.equals(other.numeroChamado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "help_desk.Chamados_1[ numeroChamado=" + numeroChamado + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
