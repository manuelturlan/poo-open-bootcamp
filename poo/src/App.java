public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();

        persona1.setName("Manuel");
        persona1.setAge(21);
        persona1.setPhone(595962);


        System.out.println(persona1.getName());
        System.out.println(persona1.getAge());
        System.out.println(persona1.getPhone());
    }

    static class Persona {
        private String nombre;
        private int edad;
        private int telefono;

        // Getter nombre
        public String getName() {
            return nombre;
        }

        // Setter nombre
        public void setName(String newName) {
            this.nombre = newName;
        }

        // Getter edad
        public int getAge() {
            return edad;
        }

        // Setter edad
        public void setAge(int newAge) {
            this.edad = newAge;
        }

        // Getter telefono
        public int getPhone() {
            return telefono;
        }

        // Setter telefono
        public void setPhone(int newPhone) {
            this.telefono = newPhone;
        }
    }
}
