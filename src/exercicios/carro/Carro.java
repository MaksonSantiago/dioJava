package exercicios.carro;

public class Carro {
    // Variáveis utilizadas
    int onOff = 0;
    int marcha = 0;
    int velocidade = 0;
    // Método para ligar ou desligar o carro, alternando em 1 e 0
    public void ligarDesligarCarro() {
        if (onOff == 0){
            onOff = 1;
            System.out.println("Carro ligado.");
        } else{
            if (velocidade == 0 & marcha == 0){
                onOff = 0;
                System.out.println("Carro desligado.");
            } else{
                System.out.println("Pare o carro e coloque no ponto morto para desligar");
            }
        }
    }
    /* Método para troca de marchas, verificando 
    a velocidade se está mínima ou máxima da marcha, 
    para aumentar a marcha ou diminuir */
    public void passarMarcha() {
        if(onOff == 0){
            System.out.println("Ligue o carro para passar a marcha.");
        } else{
            switch (marcha) {
                case 0:
                    marcha += 1;
                    System.out.println("Primeira marcha");
                    break;
                case  1:
                    if (velocidade == 20){
                        marcha += 1;
                        System.out.println("Segunda marcha");
                        break;
                    } else if (velocidade == 0){
                        marcha -= 1;
                        System.out.println("Ponto morto");
                        break;
                    } else{
                        System.out.println("Velocidade não o suficitente para a troca de marcha.");
                        break;
                    }
                case 2:
                    if (velocidade == 40){
                        marcha += 1;
                        System.out.println("Terceira marcha");
                        break;
                    } else if(velocidade <= 21){
                        marcha -= 1;
                        System.out.println("Primeira marcha");
                    } else{
                        System.out.println("Velocidade não o suficitente para a troca de marcha.");
                    }
                case 3:
                    if (velocidade == 60){
                        marcha += 1;
                        System.out.println("Quarta marcha");
                        break;
                    } else if(velocidade == 41){
                        marcha -= 1;
                        System.out.println("Segunda marcha");
                        break;
                    } else{
                        System.out.println("Velocidade não o suficitente para a troca de marcha.");
                        break;
                    }
                case 4:
                    if (velocidade == 80){
                        marcha += 1;
                        System.out.println("Quinta marcha");
                        break;
                    } else if(velocidade == 61){
                        marcha -= 1;
                        System.out.println("Terceira marcha");
                    } else{
                        System.out.println("Velocidade não o suficitente para a troca de marcha.");
                    }
                case 5:
                    if (velocidade == 100){
                        marcha += 1;
                        System.out.println("Sexta marcha");
                        break;
                    } else if(velocidade == 81){
                        marcha -= 1;
                        System.out.println("Quarta marcha");
                        break;
                    } else{
                        System.out.println("Velocidade não o suficitente para a troca de marcha.");
                    }
                case 6:
                    if (velocidade == 101){
                        marcha -= 1;
                        System.out.println("Quinta marcha");
                        break;
                    } else{
                        System.out.println("Velocidade não o suficitente para a troca de marcha.");
                    }
            }
        }
    }
    // Método para acelerar o carro
    public void acelerarCarro(){
        if (onOff == 1){
            if (marcha * 20 == velocidade){
                System.out.println("É necessário passar a marcha.");
            } else{
                velocidade += 1;
            }
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }
    // Método para diminuir a velocidade
    public void diminuirVelocidade(){
        switch(marcha) {
            case 0:
                System.out.println("Carro está no ponto morto.");
                break;
            case 1:
                if (velocidade > 0){
                    velocidade -= 1;
                    break;
                } else{
                    System.out.println("Diminua a marcha.");
                    break;
                }
            case 2:
                if (velocidade > 20){
                    velocidade -= 1;
                    break;
                } else{
                    System.out.println("Diminua a marcha.");
                    break;
                }
            case 3:
                if (velocidade > 40){
                    velocidade -= 1;
                    break;
                } else{
                    System.out.println("Diminua a marcha.");
                    break;
                }
            case 4:
                if (velocidade > 60){
                    velocidade -= 1;
                    break;
                } else{
                    System.out.println("Diminua a marcha.");
                    break;
                }
            case 5:
                if (velocidade > 80){
                    velocidade -= 1;
                    break;
                } else{
                    System.out.println("Diminua a marcha.");
                    break;
                }
            case 6:
                if (velocidade > 100){
                    velocidade -= 1;
                    break;
                } else{
                    System.out.println("Diminua a marcha.");
                    break;
                }
        }
    }
    // Método para virar a direção
    public void virarDirecao(){
        if ( velocidade >= 1 && velocidade <= 40){
            System.out.println("Direção mudada.");
        } else if(velocidade >40){
            System.out.println("Diminua a velocidade para mudar de direção.");
        } else{
            System.out.println("Aumente a velocidade para mudar de direção.");
        }
    }
    // Método para verficar velocidade
    public void verificarVelocidade(){
        System.out.printf("a velocidade atual é %s km/h.\n", velocidade);
    }
}
