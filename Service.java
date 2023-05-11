/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

/**
 *
 * @author Time Computer
 */
public interface Service {
    public abstract double withDraw(double WithdrawalAmount);
    public abstract double deposit(double depositAmount);
    public abstract double checkBalance();
    public abstract void checkpassword(String password);
}
