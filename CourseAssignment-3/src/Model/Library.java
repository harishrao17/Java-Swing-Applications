/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harish
 */
public class Library {

    String buildingNo;
    Material material;
    BookDirectory bookdir;
    MagazineDirectory magazinedir;
    AuthorDirectory authordir;
    GenreDirectory genredir;

    public Library() {
        this.material = new Material();
        this.bookdir = new BookDirectory();
        this.magazinedir = new MagazineDirectory();
        this.authordir = new AuthorDirectory();
        this.genredir = new GenreDirectory();
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public BookDirectory getBookdir() {
        return bookdir;
    }

    public void setBookdir(BookDirectory bookdir) {
        this.bookdir = bookdir;
    }

    public MagazineDirectory getMagazinedir() {
        return magazinedir;
    }

    public void setMagazinedir(MagazineDirectory magazinedir) {
        this.magazinedir = magazinedir;
    }

    public AuthorDirectory getAuthordir() {
        return authordir;
    }

    public void setAuthordir(AuthorDirectory authordir) {
        this.authordir = authordir;
    }

    public GenreDirectory getGenredir() {
        return genredir;
    }

    public void setGenredir(GenreDirectory genredir) {
        this.genredir = genredir;
    }

}
