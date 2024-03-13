//Felipe Padovani Seugling - RA: 2453487
public class TstExcecao {
    public static void main(String arg[]) throws NumberFormatException, MuiMatException{

        Leitura l = new Leitura();
        Aluno aluno = new Aluno();

        //entrada
        aluno.setNome(l.entDados("\nNome do aluno: "));
        try{
            aluno.setMateria(Integer.parseInt(l.entDados("\nQuantas materias o aluno esta matriculado: ")));

        }
        catch(MuiMatException mme){
            mme.impError();
            aluno = mme.corMuiMat(aluno);
        }

        //saida
        System.out.println("\nO aluno "+aluno.getNome()+" esta matriculado em "+aluno.getMateria()+" materias");

    }
}//fim da classe
