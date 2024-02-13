public class Hero {

    String name;
    int age;
    String type;

    public void heroInfo(String name, String type, int age){
        this.name = name;
        this.age = age;
        this.type = type;
    }


    public void attack(){
        
        switch (type) {
            case "Mago":
                System.out.println(name + ", o(a) " + type + " atacou usando magia");
                break;

            case "Guerreiro":
                System.out.println(name + ", o(a) " + type + " atacou usando espada");
                break;
            
            case "Ninja":
                System.out.println(name + ", o(a) " + type + "atacou usando shuriken");
                break;
        
            default:
                break;
        }
    }
    



}
