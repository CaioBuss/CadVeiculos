import java.util.ArrayList;
import java.util.List;

List<String> veiculos = new ArrayList<>();

void main(){
    IO.println("Bem vindo ao Sistema CadVeiculos");
    String menu = """
            MENU DE OPÇÕES
            1 - Cadastrar Veículo;
            2 - Listar Veículos;
            3 - Remover Veículo;
            0 - Sair
            """;
    int opcao;
    do {
        IO.println(menu);
        opcao = Input.scanInt("Digite a opção desejada: ");
        switch (opcao) {
            case 1 -> {
                cadastrar();
                IO.readln("Pressione Enter para Continuar");
            }
            case 2 -> {
                listar();
                IO.readln("Pressione Enter para Continuar");
            }
            case 3 -> {
                //TODO Remover veículo
                IO.readln("Pressione Enter para Continuar");
            }
            case 0 -> {
                IO.println("Volte sempre!!!");
            }
            default -> {
                IO.println("Opção Inválida");
                IO.readln("Pressione Enter para Continuar");
            }
                
        }
    } while (opcao != 0);

}



void cadastrar() {
    String veiculo = IO.readln("Digite o nome do novo veículo: ");
    veiculo = veiculo.trim();
    if (veiculo.isEmpty())
        IO.println("Nome do veículo inválido!");
    else
        veiculos.add(veiculo);
}

void listar() {
    for (int i = 1; i <= veiculos.size() ; i++) {
        IO.println(i + " - " + veiculos.get(i - 1));
    }
}