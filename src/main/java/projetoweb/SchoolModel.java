package projetoweb;
import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_school")
public class SchoolModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @NotBlank(message = "Campo Obrigatório")
  @Size(min =3, max = 50)
  private String nome;

  public LocalDate data_nascimento;

 
  private String nomedamae;

  private String nomedopai;

  @NotNull
  private Integer ddd;

  @NotNull
  private Integer numero;

  @NotNull
  private Integer ramal;

  @NotEmpty
  @Email
  private String email;

  private String serie;

  @NotBlank
  private String turno;

  @Size(max = 3)
  public String[] atividades;

  
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataNascimento() {
    return data_nascimento;
  }
  public void setDataNascimento(LocalDate data_nascimento) {
    this.data_nascimento = data_nascimento;
  }

  public String getNomeDaMae() {
    return nomedamae;
  }
  public void setNomeDaMae(String nomedamae) {
    this.nomedamae = nomedamae;
  }

  public String getNomeDoPai() {
    return nomedopai;
  }
  public void setNomeDoPai(String nomedopai) {
    this.nomedopai = nomedopai;
  }

  public Integer getDdd() {
    return ddd;
  }
  public void setDdd(Integer ddd) {
    this.ddd = ddd;
  }

  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Integer getRamal() {
    return ramal;
  }
  public void setRamal(Integer ramal) {
    this.ramal = ramal;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getSerie() {
    return serie;
  }
  public void setSerie(String serie) {
    this.serie = serie;
  }

  public String getTurno() {
    return turno;
  }
  public void setTurno(String turno) {
    this.turno = turno;
  }

  public String[] getAtividades() {
    return atividades;
  }
  public void setAtividades(String[] atividades) {
    this.atividades = atividades;
  }
}
