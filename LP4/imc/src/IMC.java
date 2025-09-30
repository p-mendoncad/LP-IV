public class IMC {

    public static void main(String[] args) {
        double peso = 74.3;
        double altura = 1.78;
        String sexo = "M";

        String resultado = resultadoIMC(peso, altura, sexo);
        System.out.println(resultado);
    }

    public static String resultadoIMC(double peso, double altura, String sexo) {
        double imc = peso / (altura * altura);

        if (sexo.equals("F")) {
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else if (imc < 25.8) {
                return "No peso normal";
            } else if (imc < 27.3) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else if (sexo.equals("M")) {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else if (imc < 26.4) {
                return "No peso normal";
            } else if (imc < 27.8) {
                return "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else {
            return "Sexo inválido";
        }
    }
}
