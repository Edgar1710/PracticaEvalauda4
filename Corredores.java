package practicaevaluda4;

public class Corredores {

    private String nombre;
    private int edad;
    private int numeroCorredor;
    private int tiempoEstimado;
    private String categoria;

    public Participante(String nombre, int edad, int numeroCorredor, int tiempoEstimado) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroCorredor = numeroCorredor;
        this.tiempoEstimado = tiempoEstimado;
        this.categoria = determinarCategoria(edad);
    }

    private String determinarCategoria(int edad) {
        if (edad < 18) {
            return "Juvenil";
        } else if (edad <= 40) {
            return "Adulto";
        } else {
            return "Master";
        }
    }

    public int getNumeroCorredor() {
        return numeroCorredor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDatos() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Número: " + numeroCorredor
                + ", Tiempo Estimado: " + tiempoEstimado + " min, Categoría: " + categoria;
    }
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

}

    
    }

}
