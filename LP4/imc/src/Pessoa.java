
public class Pessoa {

    private String genero;
    private float peso;
    private float altura;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if(!genero.equals("masculino") && !genero.equals("feminino")) {
            throw new IllegalArgumentException("genero invalido");
        }
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso <= 0 ){
            throw new IllegalArgumentException("peso invalido");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("altura invalida");
        }
        this.altura = altura;
    }

    public float calcularImc(){
        return peso/ (altura * altura);
    }

    public String definirStatusImc()
    {
        float imc = calcularImc();

        if(genero.equals("masculino")){
            if(imc < 20.7) {
                return "Abaixo do peso";
            }
            else if(imc < 26.4) {
                return "Peso normal";
            }
            else if(imc < 27.8) {
                return "Marginalmente acima";
            }
            else if(imc < 31.1) {
                return "Acima do peso";
            }
            return "Obeso";
        }
        else{
            if(imc < 19.1) {
                return "Abaixo do peso";
            }
            else if(imc < 25.8) {
                return "Peso normal";
            }
            else if(imc < 27.2) {
                return "Marginalmente acima";
            }
            else if(imc < 32.3) {
                return "Acima do peso";
            }
            return "Obeso";
        }
    }
}