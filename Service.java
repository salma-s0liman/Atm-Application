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
    public double withDraw(double WithdrawalAmount);
    public double deposit(double depositAmount);
    public double checkBalance();
    public void checkpassword(String password);
}
