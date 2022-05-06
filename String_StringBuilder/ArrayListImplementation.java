package String_StringBuilder;

public class ArrayListImplementation {
     public static class Employees{
        String names[] = new String[5];
        int size = 0;
        
        public void add(String name){
            if(size == names.length){
                String newnames[] = new String[2*names.length];
                for(int i = 0; i < names.length; i++){
                    newnames[i] = names[i];
                }
                names = newnames;
            }
            
            names[size] = name;
            size++;
        }
        
        public void remove(int idx){
            for(int i = idx; i < size; i++){
                names[i] = names[i+1];
            }
            size--;
        }
        
        public void remove(String name){
            int idx = -1;
            for(int i = 0; i < size; i++){
                if(name.equals(names[i])){
                    idx = i;
                    break;
                }
            }
            
            if(idx != -1){
                remove(idx);
            }
        }
        
        public int getSize(){
            return size;
        }
        
        public String get(int idx){
            return names[idx];
        }
    }
 
    public static void main(String args[]){
        Employees obj = new Employees();
        obj.add("rohan");
        obj.add("vaishnavi");
        obj.add("safdar");
        obj.add("rohit");
        obj.add("mantasha");
        obj.add("rahul");
        obj.add("amit");
        
        for(int i = 0; i < obj.getSize(); i++){
            System.out.println(obj.get(i));
        }
        
        obj.remove("rohit");
        
        for(int i = 0; i < obj.getSize(); i++){
            System.out.println(obj.get(i));
        }
      
    }
}
