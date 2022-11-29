
public class Pessoa {
    private String nome;        
    private int idade;          
    private float altura;       
    private float peso;         
    private char sexo;          
 
    public void setNome(String nome){
            this.nome = nome;
    }
    public void setIdade(int idade){
            this.idade = idade;
    }
    public void setAltura(float altura){
            this.altura = altura;
    }
    public void setPeso(float peso){
            this.peso = peso;
    }
    public void setSexo(char sexo){
        if( (sexo != 'M') && (sexo != 'F') )
            throw new IllegalArgumentException("Sexo invalido. 'M' OU 'F' ");
        else
            this.sexo = sexo;
    }
 
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getAltura(){
        return this.altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public char getSexo(){
        return this.sexo;
    }
 
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
    }
}

	}

}
