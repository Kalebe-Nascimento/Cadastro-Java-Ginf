/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByNmNickname", query = "SELECT u FROM Usuario u WHERE u.nmNickname = :nmNickname")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nm_nickname")
    private String nmNickname;

    public Usuario() {
    }

    public Usuario(String nmNickname) {
        this.nmNickname = nmNickname;
    }

    public String getNmNickname() {
        return nmNickname;
    }

    public void setNmNickname(String nmNickname) {
        this.nmNickname = nmNickname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nmNickname != null ? nmNickname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.nmNickname == null && other.nmNickname != null) || (this.nmNickname != null && !this.nmNickname.equals(other.nmNickname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.Usuario[ nmNickname=" + nmNickname + " ]";
    }
    
}
