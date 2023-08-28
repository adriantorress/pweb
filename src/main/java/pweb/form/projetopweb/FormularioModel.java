package pweb.form.projetopweb;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class FormularioModel {
    @NotEmpty(message = "Campo obrigatório")
    private String name;

    @NotEmpty(message = "Campo obrigatório")
    private String birth;

    @NotEmpty(message = "Campo obrigatório")
    private String mname;
    
    @NotEmpty(message = "Campo obrigatório")
    private String fname;
    
    @NotEmpty(message = "Campo obrigatório")
    private String ddd;
    
    @NotEmpty(message = "Campo obrigatório")
    private String number;
    
    @NotEmpty(message = "Campo obrigatório")
    private String extension;
    
    @Email(message = "Email inválido")
    private String email;

    @NotEmpty(message = "Campo obrigatório")
    private String serie;

    @NotEmpty(message = "Campo obrigatório")
    private String session;

    @Size(max = 3, message = "Apenas no máximo 3 atividades extracurriculares são permitidas.")
    private List<String> activities;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getDdd() {
        return ddd;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
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

    public String getSession() {
        return session;
    }
    public void setSession(String session) {
        this.session = session;
    }

    public List<String> getActivities() {
        return activities;
    }
    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    
}

