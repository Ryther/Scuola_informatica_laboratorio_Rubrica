package rubrica;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Edoardo Zanoni
 */
public class Rubrica {

    private String nomeRubrica;
    private String descrizione;
    private Set<Contatto> contatti;

    public Rubrica(String nome, String descrizione) {
        
        this.nomeRubrica = nome;
        this.descrizione = descrizione;
        this.contatti = new HashSet();
    }

    public String getNomeRubrica() {
        
        return nomeRubrica;
    }

    public void setNomeRubrica(String nome) {
        
        this.nomeRubrica = nome;
    }

    public String getDescrizione() {
        
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        
        this.descrizione = descrizione;
    }

    public Set<Contatto> getContatti() {
        
        return contatti;
    }

    public boolean addContatto(String nome, String cognome) {
        
        return this.contatti.add(new Contatto(nome, cognome));
    }
    
    public TreeSet<Contatto> getContatto(String nome) {
        
    }
}
