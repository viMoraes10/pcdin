package com.unibit.unisal.entities;

import com.unibit.unisal.enums.TipoEmprego;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

import java.sql.Date;
import java.time.LocalTime;

import static java.time.LocalTime.now;

@Entity
public class Experiencia {
    @Id
    private Long id;
    @NonNull
    private boolean ativo;
    @NonNull
    private String nome;
    @NonNull
    private TipoEmprego tipoEmprego;

    private String descriacao;

    private int idUsuario;
    @NonNull
    private Date dataInicial;

    private Date dataFinal;

    private Date ultimaModificacao;

    private String quemModificou;

    private Date dataCriacao;

    public Experiencia() {
    }

    public Experiencia(Experiencia newExperiencia) {

        this.setDataCriacao(Date.valueOf(String.valueOf(now())));
    }

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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
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

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
