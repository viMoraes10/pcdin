package com.unibit.unisal.entities;

import com.unibit.unisal.enums.TipoEmprego;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Experiencia {
    @Id
    private Long id;
    private boolean ativo;

    private String nome;

    private TipoEmprego tipoEmprego;

    private String descriacao;

    private Usuario idUsuario;

    private Date ultimaModificacao;

    private String quemModificou;

    private Date dataCriacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEmprego getTipoEmprego() {
        return tipoEmprego;
    }

    public void setTipoEmprego(TipoEmprego tipoEmprego) {
        this.tipoEmprego = tipoEmprego;
    }

    public String getDescriacao() {
        return descriacao;
    }

    public void setDescriacao(String descriacao) {
        this.descriacao = descriacao;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getUltimaModificacao() {
        return ultimaModificacao;
    }

    public void setUltimaModificacao(Date ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }

    public String getQuemModificou() {
        return quemModificou;
    }

    public void setQuemModificou(String quemModificou) {
        this.quemModificou = quemModificou;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
