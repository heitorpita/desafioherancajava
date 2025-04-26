package Desafio3;

public class Main {

    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "sasuke uchiha";
        sasuke.idade = 132;
        sasuke.nivelDificuldade = "Alta";
        sasuke.statusMissao = "Em Andamento";
        sasuke.missao = "Recuperar o Diamante";
        sasuke.mostrarInformacoes();

        Hyuga neji = new Hyuga();
        neji.nome = "Neji Hyuga";
        neji.idade = 16;
        neji.nivelDificuldade = "Medio";
        neji.statusMissao = "concluida";
        neji.missao = "Proteger senhor feudal";
        neji.superOlhosAtivados();

        Filho filho = new Filho();
        filho.nome = "FILHO HYUGA UCHIHA";
        filho.idade = 10;
        filho.nivelDificuldade = "facil";
        filho.statusMissao = "em andamento";
        filho.missao = "ROUBAR PAO";
        filho.mostrarHabilidadeEspecial();
        filho.AtivarSuperOlho();
        filho.AtivarOKarma();



    }


}


















