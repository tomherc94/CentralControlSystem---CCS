/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccsPackage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "vendas", catalog = "teste", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vendas.findAll", query = "SELECT v FROM Vendas v")
    , @NamedQuery(name = "Vendas.findByIdEvento", query = "SELECT v FROM Vendas v WHERE v.idEvento = :idEvento")
    , @NamedQuery(name = "Vendas.findByCodigo", query = "SELECT v FROM Vendas v WHERE v.codigo = :codigo")
    , @NamedQuery(name = "Vendas.findByDescricao", query = "SELECT v FROM Vendas v WHERE v.descricao = :descricao")
    , @NamedQuery(name = "Vendas.findByValorCompra", query = "SELECT v FROM Vendas v WHERE v.valorCompra = :valorCompra")
    , @NamedQuery(name = "Vendas.findByValorVenda", query = "SELECT v FROM Vendas v WHERE v.valorVenda = :valorVenda")
    , @NamedQuery(name = "Vendas.findByLucroBruto", query = "SELECT v FROM Vendas v WHERE v.lucroBruto = :lucroBruto")
    , @NamedQuery(name = "Vendas.findByIr", query = "SELECT v FROM Vendas v WHERE v.ir = :ir")
    , @NamedQuery(name = "Vendas.findByLucroLiquido", query = "SELECT v FROM Vendas v WHERE v.lucroLiquido = :lucroLiquido")
    , @NamedQuery(name = "Vendas.findByQuantidadeVenda", query = "SELECT v FROM Vendas v WHERE v.quantidadeVenda = :quantidadeVenda")
    , @NamedQuery(name = "Vendas.findByDataVenda", query = "SELECT v FROM Vendas v WHERE v.dataVenda = :dataVenda")})
public class Vendas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_evento")
    private Integer idEvento;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor_compra")
    private BigDecimal valorCompra;
    @Basic(optional = false)
    @Column(name = "valor_venda")
    private BigDecimal valorVenda;
    @Basic(optional = false)
    @Column(name = "lucro_bruto")
    private BigDecimal lucroBruto;
    @Basic(optional = false)
    @Column(name = "ir")
    private BigDecimal ir;
    @Basic(optional = false)
    @Column(name = "lucro_liquido")
    private BigDecimal lucroLiquido;
    @Basic(optional = false)
    @Column(name = "quantidade_venda")
    private int quantidadeVenda;
    @Basic(optional = false)
    @Column(name = "data_venda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;

    public Vendas() {
    }

    public Vendas(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Vendas(Integer idEvento, String codigo, String descricao, BigDecimal valorCompra, BigDecimal valorVenda, BigDecimal lucroBruto, BigDecimal ir, BigDecimal lucroLiquido, int quantidadeVenda, Date dataVenda) {
        this.idEvento = idEvento;
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.lucroBruto = lucroBruto;
        this.ir = ir;
        this.lucroLiquido = lucroLiquido;
        this.quantidadeVenda = quantidadeVenda;
        this.dataVenda = dataVenda;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        Integer oldIdEvento = this.idEvento;
        this.idEvento = idEvento;
        changeSupport.firePropertyChange("idEvento", oldIdEvento, idEvento);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        BigDecimal oldValorCompra = this.valorCompra;
        this.valorCompra = valorCompra;
        changeSupport.firePropertyChange("valorCompra", oldValorCompra, valorCompra);
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        BigDecimal oldValorVenda = this.valorVenda;
        this.valorVenda = valorVenda;
        changeSupport.firePropertyChange("valorVenda", oldValorVenda, valorVenda);
    }

    public BigDecimal getLucroBruto() {
        return lucroBruto;
    }

    public void setLucroBruto(BigDecimal lucroBruto) {
        BigDecimal oldLucroBruto = this.lucroBruto;
        this.lucroBruto = lucroBruto;
        changeSupport.firePropertyChange("lucroBruto", oldLucroBruto, lucroBruto);
    }

    public BigDecimal getIr() {
        return ir;
    }

    public void setIr(BigDecimal ir) {
        BigDecimal oldIr = this.ir;
        this.ir = ir;
        changeSupport.firePropertyChange("ir", oldIr, ir);
    }

    public BigDecimal getLucroLiquido() {
        return lucroLiquido;
    }

    public void setLucroLiquido(BigDecimal lucroLiquido) {
        BigDecimal oldLucroLiquido = this.lucroLiquido;
        this.lucroLiquido = lucroLiquido;
        changeSupport.firePropertyChange("lucroLiquido", oldLucroLiquido, lucroLiquido);
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        int oldQuantidadeVenda = this.quantidadeVenda;
        this.quantidadeVenda = quantidadeVenda;
        changeSupport.firePropertyChange("quantidadeVenda", oldQuantidadeVenda, quantidadeVenda);
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        Date oldDataVenda = this.dataVenda;
        this.dataVenda = dataVenda;
        changeSupport.firePropertyChange("dataVenda", oldDataVenda, dataVenda);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvento != null ? idEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendas)) {
            return false;
        }
        Vendas other = (Vendas) object;
        if ((this.idEvento == null && other.idEvento != null) || (this.idEvento != null && !this.idEvento.equals(other.idEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ccsPackage.Vendas[ idEvento=" + idEvento + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
