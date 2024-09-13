public class RA2920482411003 {

    private String nome;
    private int ra;
    private int idade;
    private String github;
    private String Linkedin;
    private String curso;
    private String turma;

    public RA2920482411003(String nome, int ra, int idade, String github, String Linkedin, String curso, String turma){
        this.nome= nome;
        this.ra=ra;
        this.idade = idade;
        this.github = github;
        this.curso = curso;
        this.turma = turma;
    }    
    public void setNome (String ent_nome){
        nome = ent_nome;
    }
    public String getNome(){
        return nome;
    }

    public void setRa (int ent_ra){
        ra = ent_ra;
    }
    public int getra(){
        return ra;
    }

    public void setidade (int ent_idade){
        idade = ent_idade;
    }
    public int getidade(){
        return idade;
    }

    public void setgithub (String ent_github){
        github = ent_github;
    }
    public String getgithub(){
        return github;
    }

    public void setLinkedin (String ent_Linkedin){
        Linkedin = ent_Linkedin;
    }
    public String getLinkedin(){
        return Linkedin;
    }

    public void setcurso (String ent_curso){
        curso = ent_curso;
    }
    public String getcurso(){
        return curso;
    }

    public void setturma (String ent_turma){
        turma = ent_turma;
    }
    public String getturma(){
        return turma;
    }
}