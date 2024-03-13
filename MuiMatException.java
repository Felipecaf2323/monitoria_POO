//Felipe Padovani Seugling - RA: 2453487
public class MuiMatException extends Exception {

    Leitura l = new Leitura();

    public void impError(){
        System.out.println("\nO aluno nao pode estar matriculado em mais de 10 materias");
    }

    public Aluno corMuiMat(Aluno a1){
        try{
            a1.setMateria(Integer.parseInt(l.entDados("\nMuitas materias --> Informe novamente quantas materias: ")));
        }

        catch(MuiMatException mme){
            mme.impError();
            a1 = mme.corMuiMat(a1);
        }

        return a1;
    }

}//fim da classe
