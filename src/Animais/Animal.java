package Animais;

@Entidade
public class Animal {

    @Id
    private Long id;

    @Nome
    private String nome;

    public Animal() {}

    public Animal(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Métodos Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
