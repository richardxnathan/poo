package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author richa
 */
public class Estadia {
    
    private int horaEntrada;
    private int horaSaida;
    
    public Estadia (){}
    
    public Estadia (int horaEntrada, int horaSaida){
        this.setHoraEntrada(horaEntrada);
        this.setHoraSaida(horaSaida);
    }
    
    public int getHoraEntrada(){
        return this.horaEntrada;
    }
    
    public void setHoraEntrada(int horaEntrada){
        if(horaEntrada < 0 || horaEntrada > 24){
            throw new IllegalArgumentException("Hora negativa ou maior que 24.");
        }
        
        this.horaEntrada = horaEntrada;
    }
    
    public int getHoraSaida(){
        return this.horaSaida;
    }
    
    public void setHoraSaida(int horaSaida){
        if(horaSaida < 0 || horaSaida > 24){
            throw new IllegalArgumentException("Hora negativa ou maior que 24.");
        }
        this.horaSaida = horaSaida;
    }
    
    /**
     * Método feito para calcular o tempo que o veículo ficou estacionado,
     * primeiro ele testa os horários pra verificar se a entrada e saída foram
     * no mesmo dia, caso positivo retorna o tempo que ele ficou.
     * Caso a entrada e saida foram em dias diferentes o método faz o mesmo
     * calculo acrescentando 24 horas.
     * @return tipo inteiro.
     */
    public int calcularTempoEstadia(){
        if(horaSaida > horaEntrada){
            return (horaSaida - horaEntrada);
        } 
        
        horaSaida += 24;
        return (horaSaida - horaEntrada);
    }
    
    
    /**
     * Método feito para calcular o valor a pagar a partir do tempo que o veiculo,
     * permaneceu estacionado, primeiro há um teste para verificar se ficou menos
     * de 4 horas, caso positivo temos a taxa fixa de R$12,00, do contrário
     * é abatida as 4 horas e calculado o preço final a se pagar multiplicando
     * o número de horas, com valor por hora e somando a taxa fixa.
     * @return tipo double.
     */
    public double calcularValorPagar(){
        if(this.calcularTempoEstadia() <= 4){
            return 12.00;
        }
        int horas = this.calcularTempoEstadia() - 4;
        return (12 + (horas * 3));
    }
    
}
