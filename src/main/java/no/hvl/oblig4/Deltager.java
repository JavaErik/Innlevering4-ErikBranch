package no.hvl.oblig4;

public class Deltager {

    private String mobilnummer;
    private String passord;
    private String fornavn;
    private String etternavn;
    private String kjonn;
    private String salt;


   public Deltager(String fornavn, String etternavn, String mobilnummer, String kjonn, String passord) {
    this.fornavn = fornavn;
    this.etternavn = etternavn;
    this.mobilnummer = mobilnummer;
    this.kjonn = kjonn;
    this.passord = passord;
   }

   public String getFornavn() {
    return fornavn;
   }
   public String getEtternavn() {
    return etternavn;
   }
   public String getMobilnummer() {
    return mobilnummer;
   }
   public String getPassord() {
    return passord;
   }

   public void setPassord(String passord) {
    this.passord = passord;
   }

   public String getKjonn() {
    return kjonn;
   }

   public String getSalt() {
    return salt;
   }

   public void setSalt(String salt) {
    this.salt = salt;
   }

}

