package innerclass.builder;

public class Patient {

    private String name;
    private boolean emergency;
    private boolean normal;


    public Patient(Builder builder){
        this.name=builder.name;
        this.emergency=builder.emergency;
        this.normal=builder.normal;
    }
    public static class Builder{
        private String name;
        private boolean emergency;
        private boolean normal;


        public Builder(String name){
            this.name=name;
        }

        public Builder emergency(boolean emergency){
            this.emergency=emergency;
            return this;
        }

        public Builder normal(boolean normal){
            this.normal=normal;
            return this;
        }

        public Patient build(){
            return new Patient(this);
        }
    }

    public static void main(String[] args) {
        Patient patient = new Builder("HI").emergency(true).build();
    }
}
