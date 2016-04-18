package rubrica;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Edoardo Zanoni
 */
public class Contatto implements Comparable {
    
    private String nome;
    private String cognome;
    private Set<String> numeriTelefono;
    private Set<String> emails;
    private Set<String> indirizzi;

    public Contatto(String nome, String cognome) {
        
        this.nome = nome;
        this.cognome = cognome;
        this.numeriTelefono = new HashSet();
    }

    public String getNome() {
        
        return nome;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }

    public String getCognome() {
        
        return cognome;
    }

    public void setCognome(String cognome) {
        
        this.cognome = cognome;
    }

    public Set<String> getNumeriTelefono() {
        
        return numeriTelefono;
    }

    public boolean addNumeroTelefono(String numeroTelefono) {
        
        return this.numeriTelefono.add(numeroTelefono);
    }

    public Set<String> getEmails() {
        
        return emails;
    }

    public boolean addEmail(String email) {
        
        return this.emails.add(email);
    }

    public Set<String> getIndirizzi() {
        
        return indirizzi;
    }

    public boolean setIndirizzo(String indirizzo) {
        
        return this.indirizzi.add(indirizzo);
    }

    @Override
    public int compareTo(Object o) {
        
        if (o == null)
            throw new NullPointerException();
        
        if (o instanceof Contatto) {
            
            Contatto tempP = (Contatto) o;
            String tempS1 = new StringBuilder(this.getNome()).append(" ").append(this.getCognome()).toString();
            String tempS2 = new StringBuilder(tempP.getNome()).append(" ").append(tempP.getCognome()).toString();
            return tempS1.compareTo(tempS2);
        }
        
        throw new ClassCastException();
    }
    
    @Override
    public int hashCode() {
        
        int hash = 1;
        hash = (hash * 17) + this.getNome().hashCode();
        hash = (hash * 17) + this.getCognome().hashCode();
        return hash;
    }
}
