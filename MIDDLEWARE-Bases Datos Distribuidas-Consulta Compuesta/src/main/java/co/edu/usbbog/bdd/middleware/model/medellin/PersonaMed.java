/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.bdd.middleware.model.medellin;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 305
 */
@Entity
@Table(name = "persona", catalog = "per_med_db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaMed.findAll", query = "SELECT p FROM PersonaMed p")
    , @NamedQuery(name = "PersonaMed.findById", query = "SELECT p FROM PersonaMed p WHERE p.id = :id")
    , @NamedQuery(name = "PersonaMed.findByNom", query = "SELECT p FROM PersonaMed p WHERE p.nom = :nom")
    , @NamedQuery(name = "PersonaMed.findByApp", query = "SELECT p FROM PersonaMed p WHERE p.app = :app")
    , @NamedQuery(name = "PersonaMed.findByEdad", query = "SELECT p FROM PersonaMed p WHERE p.edad = :edad")})
public class PersonaMed implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id",nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom",nullable = false, length = 45)
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "app",nullable = false, length = 45)
    private String app;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad",nullable = false)
    private int edad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prop")
    private List<TelefonoMed> telefonoMedList;

    public PersonaMed() {
    }

    public PersonaMed(Integer id) {
        this.id = id;
    }

    public PersonaMed(Integer id, String nom, String app, int edad) {
        this.id = id;
        this.nom = nom;
        this.app = app;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @XmlTransient
    public List<TelefonoMed> getTelefonoMedList() {
        return telefonoMedList;
    }

    public void setTelefonoBogList(List<TelefonoMed> telefonoMedList) {
        this.telefonoMedList = telefonoMedList;
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
        if (!(object instanceof PersonaMed)) {
            return false;
        }
        PersonaMed other = (PersonaMed) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonaMed{" + "id=" + id + ", nom=" + nom + ", app=" + app + ", edad=" + edad + ", telefonoMedList=" + telefonoMedList + '}';
    }

   
    
}
