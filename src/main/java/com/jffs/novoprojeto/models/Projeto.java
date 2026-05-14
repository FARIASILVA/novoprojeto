package com.jffs.novoprojeto.models;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "projeto")
public class Projeto implements Serializable{
    


@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

@Column(name = "nome")
private String nome;

@Column(name="descricao")
private String descricao;

@Column(name = "preco")
private BigDecimal preco;

@Column(name ="quantidade")
private int quantidade;

@Column(name ="setor")
private String setor;


@Column(name ="categoria")
private String categoria;



public String getCategoria() {
    return categoria;
}

public void setCategoria(String categoria) {
    this.categoria = categoria;
}

public String getSetor() {
    return setor;
}

public void setSetor(String setor) {
    this.setor = setor;
}

public long getId() {
return id;
}

public void setId(long id) {
this.id = id;
}

public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public BigDecimal getPreco() {
return preco;
}

public void setPreco(BigDecimal preco) {
this.preco = preco;
}

public int getQuantidade() {
return quantidade;
}

public void setQuantidade(int quantidade) {
this.quantidade = quantidade;
}
public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}
}
