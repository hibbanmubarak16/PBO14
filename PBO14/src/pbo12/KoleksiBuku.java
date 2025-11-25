/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo12;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author hibban mubarak
 */
@Entity
@Table(name = "koleksi_buku")
@NamedQueries({
    @NamedQuery(name = "KoleksiBuku.findAll", query = "SELECT k FROM KoleksiBuku k ORDER BY k.idBuku "),
    @NamedQuery(name = "KoleksiBuku.findByIdBuku", query = "SELECT k FROM KoleksiBuku k WHERE k.idBuku = :idBuku"),
    @NamedQuery(name = "KoleksiBuku.findByJudul", query = "SELECT k FROM KoleksiBuku k WHERE k.judul = :judul"),
    @NamedQuery(name = "KoleksiBuku.findByGenre", query = "SELECT k FROM KoleksiBuku k WHERE k.genre = :genre"),
    @NamedQuery(name = "KoleksiBuku.findByPengarang", query = "SELECT k FROM KoleksiBuku k WHERE k.pengarang = :pengarang"),
    @NamedQuery(name = "KoleksiBuku.findByTahunTerbit", query = "SELECT k FROM KoleksiBuku k WHERE k.tahunTerbit = :tahunTerbit")})
public class KoleksiBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_buku")
    private String idBuku;
    @Basic(optional = false)
    @Column(name = "judul")
    private String judul;
    @Column(name = "genre")
    private String genre;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "tahun_terbit")
    private String tahunTerbit;
    @OneToMany(mappedBy = "idBuku", cascade = CascadeType.ALL)
    private Collection<PeminjamanBuku> peminjamanBukuCollection;

    public KoleksiBuku() {
    }

    public KoleksiBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public KoleksiBuku(String idBuku, String judul) {
        this.idBuku = idBuku;
        this.judul = judul;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public Collection<PeminjamanBuku> getPeminjamanBukuCollection() {
        return peminjamanBukuCollection;
    }

    public void setPeminjamanBukuCollection(Collection<PeminjamanBuku> peminjamanBukuCollection) {
        this.peminjamanBukuCollection = peminjamanBukuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBuku != null ? idBuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KoleksiBuku)) {
            return false;
        }
        KoleksiBuku other = (KoleksiBuku) object;
        if ((this.idBuku == null && other.idBuku != null) || (this.idBuku != null && !this.idBuku.equals(other.idBuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idBuku ;
    }
    
}
