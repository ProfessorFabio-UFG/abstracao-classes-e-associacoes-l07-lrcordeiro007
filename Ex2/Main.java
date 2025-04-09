

public class Main {
    public static void main(String[] args) {
    


        Departamento departamento= new Departamento("Instituto de Informatica", "inf");
        //Departamento departamento= new Departamento("Centro de aulas engenharia", "cae");


        Curso curso= new Curso("Ciencia da Computaçao", "CC", departamento);
        //Departamento depto2[] = new Departamento[1];
        //depto2[0] = departamento[1];
       // Curso curso[1]= new Curso("Ciencia Ambientais", "CA", depto2);

  
        Aluno aluno = new Aluno("Luis", 202301466, 2023, curso);
        //Curso cur2[] = new Curso[1];
       //cur2[0] = curso[1];
        //Aluno aluno[1] = new Aluno("Daniel", 20231666, 2023, cur2);

        System.out.println(aluno);
    }
}
