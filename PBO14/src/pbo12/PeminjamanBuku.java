/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo12;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author hibban mubarak
 */
@Entity
@Table(name = "peminjaman_buku")
@NamedQueries({
    @NamedQuery(name = "PeminjamanBuku.findAll", query = "SELECT p FROM PeminjamanBuku p ORDER BY p.idPeminjaman"),
    @NamedQuery(name = "PeminjamanBuku.findByIdPeminjaman", query = "SELECT p FROM PeminjamanBuku p WHERE p.idPeminjaman = :idPeminjaman"),
    @NamedQuery(name = "PeminjamanBuku.findByNamaPeminjam", query = "SELECT p FROM PeminjamanBuku p WHERE p.namaPeminjam = :namaPeminjam"),
    @NamedQuery(name = "PeminjamanBuku.findByTanggalPinjam", query = "SELECT p FROM PeminjamanBuku p WHERE p.tanggalPinjam = :tanggalPinjam"),
    @NamedQuery(name = "PeminjamanBuku.findByTanggalKembali", query = "SELECT p FROM PeminjamanBuku p WHERE p.tanggalKembali = :tanggalKembali")})
public class PeminjamanBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_peminjaman")
    private String idPeminjaman;
    @Basic(optional = false)
    @Column(name = "nama_peminjam")
    private String namaPeminjam;
    @Basic(optional = false)
    @Column(name = "tanggal_pinjam")
    private String tanggalPinjam;
    @Column(name = "tanggal_kembali")
    private String tanggalKembali;
    @JoinColumn(name = "id_buku", referencedColumnName = "id_buku")
    @ManyToOne
    private KoleksiBuku idBuku;

    public PeminjamanBuku() {
    }

    public PeminjamanBuku(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public PeminjamanBuku(String idPeminjaman, String namaPeminjam, String tanggalPinjam) {
        this.idPeminjaman = idPeminjaman;
        this.namaPeminjam = namaPeminjam;
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public KoleksiBuku getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(KoleksiBuku idBuku) {
        this.idBuku = idBuku;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeminjaman != null ? idPeminjaman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanBuku)) {
            return false;
        }
        PeminjamanBuku other = (PeminjamanBuku) object;
        if ((this.idPeminjaman == null && other.idPeminjaman != null) || (this.idPeminjaman != null && !this.idPeminjaman.equals(other.idPeminjaman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idPeminjaman;
    }
    
}
