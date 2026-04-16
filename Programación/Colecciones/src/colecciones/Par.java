/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;


class Par <T, U> {
//Valores
  private T primero;
  private U segundo;
    
  //Contructor 
  public Par(T primero, U segundo) {
      this.primero = primero;
      this.segundo = segundo;
  }
     
  //Getter T
  public T GetPrimero() {
      return primero;
  }
  
  //Setter T
  public void SetPrimero(T primero){
      this.primero = primero;
  }
  
  //Getter U
  public U GetSegundo() {
      return segundo;
  }
  
  //Setter U
  public void SetSegundo(U segundo) {
      this.segundo = segundo;
  }
  
  //Método toString
    @Override
    public String toString() {
        return "Par [primero=" + primero + ", segundo=" + segundo + "]";
    }
}
