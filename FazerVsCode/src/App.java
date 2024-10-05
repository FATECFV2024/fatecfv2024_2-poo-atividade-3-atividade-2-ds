public class App {
        
    public static void main(String[] args) throws Exception {
        Ra2920482411004 estudante = new Ra2920482411004("Luana Messias de Sena", "2920482411004", 19 );
        estudante.setGitHub("LuanaMeSe");
        estudante.setLinkedin("Luana");
        estudante.setCurso("ADS");
        estudante.setTurma("2°");
        System.out.println("nome: " + estudante.getNome() + "ra: " + estudante.getRa());
    }
}
