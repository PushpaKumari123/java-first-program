/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
interface nestedinterface
{
int  a=5;
void abc();
}

/**
 *
 * @author pushpa
 */
public class a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nestedinterface obj=new nestedinterface(){
            void abc()
            {
                System.out.println("Hello");
            }
        }
        // TODO code application logic here
    }
    

