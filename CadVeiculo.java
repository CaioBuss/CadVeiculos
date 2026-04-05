import java.util.ArrayList;
import java.util.List;

List<String> veiculos = new ArrayList<>();

void main (){
    IO.println("Bem vindo ao sistema CadVeiculo!");
    String menu = """
            1 - Cadastrar Veiculo
            2 - Listar Veiculos
            3 - Remover Veiculo
            0 - Sair
            """;

    int opcao;
    do {
        IO.println(menu);
        opcao = Input.scanInt("Digite a opcao desejada: ");

    }while (opcao != 0);

    switch (opcao) {
        case 1: {
            IO.readln("Precione Enter para continuar");
        // Adicione os casos para as outras opções
    }   case 2: {
            IO.readln("Precione Enter para continuar");
        }
        case 3: {
            IO.readln("Precione Enter para continuar");
        }
        case 0: {
            IO.println("VOLTE SEMPRE!");
        }
        default: {
            IO.println("Opcao invalida! Tente novamente.");
        } 
    }
}