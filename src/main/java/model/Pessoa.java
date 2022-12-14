package model;

//import org.hibernate.length;


import javax.persistence.*;
@Entity
@Table (name = "db_pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 50, nullable = false, unique = true)
    private String cpf;

  //  create table pessoa (
  //          id serial primary key not null,
    //         nome varvhar (50) not null, unique
  //
  // )


    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }


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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }






}
