//Felipe Padovani Seugling - RA: 2453487
public class Aluno{
    private String nome;
    private int materia;

    public Aluno(){
        nome = "";
        materia = 0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMateria(){
        return materia; 
    }

    public void setMateria(int materia) throws MuiMatException{ //THROWS (com "s") => AVISO: POSSO lançar um objeto de determinado tipo
        if(materia > 0){
            if(materia <= 10){
                this.materia = materia;
            }
            else{
                throw new MuiMatException(); //THROW (sem "s")  => ORDEM: LANCE o determinado objeto
            }
        }
    }



}//fim da classe

