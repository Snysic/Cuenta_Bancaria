package dev.cuentabancaria;

public class Cuenta {
    public float saldo; 
    public int numConsignaciones = 0;
    public int numRetiros = 0;
    protected float tasaAnual;
    public float comMensual = 0;
    
    
    public Cuenta(float saldo, float tasaAnual) {
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
    }
    
    public void consignar(float cantidad) {
    saldo = saldo + cantidad; 
    
    numConsignaciones = numConsignaciones + 1;
    }
    
    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
       
        if (nuevoSaldo >= 0) {
        saldo -= cantidad;
        numRetiros = numRetiros + 1;
        } else {
        System.out.println("la cantidad que quiere retirar sobrepasa el saldo actual");
        }
        }
        
        public void calcularInterés() {
        float tasaMensual = tasaAnual / 12; 
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual; 
        }
     
        public void extractoMensual() {
        saldo -= comMensual;
        calcularInterés();
        }
}
