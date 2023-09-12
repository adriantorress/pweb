package projetoweb;

import java.time.LocalDate;

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

  @NotBlank(message = "O campo não pode estar em branco")
  private String nome;

  @NotNull(message = "A data não pode estar em branco")
  @Past(message = "A data deve estar no passado")
  public LocalDate dataNascimento;

  @NotBlank(message = "O campo não pode estar em branco")
  private String nomeDaMae;

  @NotBlank(message = "O campo não pode estar em branco")
  private String nomeDoPai;

  @NotNull
  private Integer ddd;

  @NotNull
  private Integer numero;

  @NotNull
  private Integer ramal;

  @NotEmpty(message = "O campo não pode estar em branco")
  @Email(message = "Informe um email válido.")
  private String email;

  @NotEmpty(message = "O campo não pode estar em branco.")
  private String serie;

  @NotBlank(message = "O campo não pode estar em branco.")
  private String turno;

  @Size(max = 3, message = "Selecione no máximo 3 atividades.")
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
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getNomeDaMae() {
    return nomeDaMae;
  }

  public void setNomeDaMae(String nomeDaMae) {
    this.nomeDaMae = nomeDaMae;
  }

  public String getNomeDoPai() {
    return nomeDoPai;
  }

  public void setNomeDoPai(String nomeDoPai) {
    this.nomeDoPai = nomeDoPai;
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
