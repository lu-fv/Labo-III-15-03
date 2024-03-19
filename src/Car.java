public class Car {

    private String mark; // atributos
    private Integer model;

    public Car (String mark, Integer model) {   /// constructor

        this.mark = mark;
        this.model =model;
    }
    public Integer getModel(){ // metodo (funcion)
        return this.model;
    }


    public String getMark(){ // devuelve valor
      return this.mark;
    }

    public void setMark (String mark){  // da valor
        this.mark = mark;

    }

    public String typeModel ()
    {
        if (this.model > 2010){
            return "Ultimate";
        }
        else{
            return "Classic";
        }
    }

}
