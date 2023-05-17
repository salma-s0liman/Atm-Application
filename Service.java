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
    public void withDraw(int with);
    public void deposit(int dep);
    public void checkBalance();
 
}
